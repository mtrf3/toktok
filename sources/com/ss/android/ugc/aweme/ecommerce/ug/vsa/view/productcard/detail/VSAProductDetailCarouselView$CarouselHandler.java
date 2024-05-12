package com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.detail;

import X.C16880lQ;
import X.C42785Gqj;
import X.GFF;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VSAProductDetailCarouselView$CarouselHandler extends Handler implements LifecycleEventObserver {
    public final WeakReference<C42785Gqj> LJLIL;

    public VSAProductDetailCarouselView$CarouselHandler(WeakReference<C42785Gqj> weakReference) {
        super(C16880lQ.LLJJJJ());
        this.LJLIL = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        C42785Gqj c42785Gqj = this.LJLIL.get();
        if (c42785Gqj != null) {
            int i = c42785Gqj.LJLJJI + 1;
            c42785Gqj.LJLJJI = i;
            if (i > ((ArrayList) c42785Gqj.LJLILLLLZI).size() - 1) {
                c42785Gqj.LJLJJI = 0;
            }
            View nextView = c42785Gqj.getNextView();
            o.LJIIIIZZ(nextView, "nextView");
            c42785Gqj.LIZIZ(nextView);
            c42785Gqj.showNext();
            c42785Gqj.LJLIL.sendEmptyMessageDelayed(0, 2000L);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        C42785Gqj c42785Gqj;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        int i = GFF.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (c42785Gqj = this.LJLIL.get()) == null) {
                    return;
                }
                c42785Gqj.LJLIL.removeCallbacksAndMessages(null);
                return;
            }
            C42785Gqj c42785Gqj2 = this.LJLIL.get();
            if (c42785Gqj2 == null || !c42785Gqj2.LJLJJL || !c42785Gqj2.LJLJJLL) {
                return;
            }
            c42785Gqj2.LJLJJLL = false;
            c42785Gqj2.LJLIL.removeCallbacksAndMessages(null);
            return;
        }
        C42785Gqj c42785Gqj3 = this.LJLIL.get();
        if (c42785Gqj3 == null || !c42785Gqj3.LJLJJL || c42785Gqj3.LJLJJLL) {
            return;
        }
        c42785Gqj3.LJLJJLL = true;
        c42785Gqj3.LJLIL.removeCallbacksAndMessages(null);
        c42785Gqj3.LJLIL.sendEmptyMessageDelayed(0, 2000L);
    }
}
