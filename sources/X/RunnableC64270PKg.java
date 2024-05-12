package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PKg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64270PKg implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean LIZ2;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ2) {
                    }
                }
            case 1:
                try {
                    ((QYU) this.LJLILLLLZI).LIZ(2, "Service disconnected");
                    return;
                } finally {
                    if (C39223FaN.LIZ(th)) {
                        return;
                    }
                }
            default:
                try {
                    o.LJIIIIZZ(((InterfaceC65784Pro) this.LJLILLLLZI).invoke(), "invoke(...)");
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0036 -> B:7:0x0036). Please report as a decompilation issue!!! */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC64270PKg.LIZ():void");
    }

    public /* synthetic */ RunnableC64270PKg(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
