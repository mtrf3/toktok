package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Vau, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80024Vau extends F9E {
    public final InterfaceC80044VbE LJLIL;
    public final InterfaceC80068Vbc LJLILLLLZI;
    public final InterfaceC80021Var LJLJI;
    public final InterfaceC80017Van LJLJJI;
    public final InterfaceC80022Vas LJLJJL;
    public final InterfaceC80025Vav LJLJJLL;
    public final InterfaceC84737XNl LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public C80024Vau(InterfaceC80026Vaw queueListenerRegistry, InterfaceC80026Vaw playerListenerRegistry, InterfaceC80026Vaw queueOperationInterceptorRegistry, InterfaceC80026Vaw playerOperationInterceptorRegistry, InterfaceC80026Vaw audioPlayer, InterfaceC80026Vaw audioQueue, InterfaceC80026Vaw audioPlayerQueueController) {
        o.LJIIJ(queueListenerRegistry, "queueListenerRegistry");
        o.LJIIJ(playerListenerRegistry, "playerListenerRegistry");
        o.LJIIJ(queueOperationInterceptorRegistry, "queueOperationInterceptorRegistry");
        o.LJIIJ(playerOperationInterceptorRegistry, "playerOperationInterceptorRegistry");
        o.LJIIJ(audioPlayer, "audioPlayer");
        o.LJIIJ(audioQueue, "audioQueue");
        o.LJIIJ(audioPlayerQueueController, "audioPlayerQueueController");
        this.LJLIL = queueListenerRegistry;
        this.LJLILLLLZI = playerListenerRegistry;
        this.LJLJI = queueOperationInterceptorRegistry;
        this.LJLJJI = playerOperationInterceptorRegistry;
        this.LJLJJL = audioPlayer;
        this.LJLJJLL = audioQueue;
        this.LJLJL = audioPlayerQueueController;
    }
}
