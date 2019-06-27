package com.example.flow

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.InitiatingFlow
import net.corda.core.flows.SchedulableFlow

@InitiatingFlow
@SchedulableFlow
class SchedFlow() : FlowLogic<Unit>() {

    @Suspendable
    override fun call(): Unit {
        if (true) throw RuntimeException("Just checking if this is retried")
    }
}