package X;

import android.os.HandlerThread;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.YRi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class HandlerThreadC87386YRi extends HandlerThread {
    public final /* synthetic */ YRU LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        Iterator<YRT> it = this.LJLIL.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        C87388YRk c87388YRk = this.LJLIL.LJIIIIZZ;
        EnumC87389YRl compState = EnumC87389YRl.STARTED;
        c87388YRk.getClass();
        o.LJIIIZ(compState, "compState");
        if (c87388YRk.LIZ.compareTo(compState) >= 0) {
            Iterator<YRT> it2 = this.LJLIL.LJIIIZ.iterator();
            while (it2.hasNext()) {
                it2.next().onStart();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC87386YRi(YRU yru) {
        super("MessagePortal");
        this.LJLIL = yru;
    }
}
