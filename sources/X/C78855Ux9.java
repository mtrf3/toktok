package X;

import Y.IDhS94S0100000_1;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Ux9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78855Ux9 implements InterfaceC28951BXv, InterfaceC73592SuS, W6H, InterfaceC79048V0q, InterfaceC48038ItG, InterfaceC66328Q1k, InterfaceC150675vj {
    public static boolean LJLIL = false;
    public static Class LJLILLLLZI = null;
    public static Class LJLJI = null;
    public static String LJLJL = "loki";
    public static int LJLJLJ;
    public static boolean LJLJLLL;
    public static final int[] LJLJJI = {R.attr.a4r};
    public static final C78855Ux9 LJLJJL = new C78855Ux9();
    public static final C78855Ux9 LJLJJLL = new C78855Ux9();
    public static final C78855Ux9 LJLL = new C78855Ux9();

    @Override // X.InterfaceC28951BXv
    public void LIZJ() {
        DecorationWrapperWidget.LLD = false;
    }

    @Override // X.InterfaceC66328Q1k
    public void LJ(Q1H q1h) {
    }

    @Override // X.InterfaceC66328Q1k
    public void LJFF(InterfaceC88472Yns interfaceC88472Yns) {
    }

    @Override // X.InterfaceC79048V0q
    public boolean available() {
        return false;
    }

    @Override // X.InterfaceC79048V0q
    public void close() {
    }

    @Override // X.InterfaceC79048V0q
    public int read(byte[] bArr, int i, int i2) {
        return 0;
    }

    public static final float LJI(View view) {
        if (view == null) {
            return 0.0f;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            return 0.0f;
        }
        return (r2.height() / view.getMeasuredHeight()) * 100.0f;
    }

    public static boolean LJII(RecyclerView recyclerView) {
        C0A2 c0a2;
        LinearLayoutManager linearLayoutManager = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) c0a2;
        }
        if (linearLayoutManager == null || linearLayoutManager.LLIL() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66328Q1k
    public void LIZ(AqS66S1200000_11 aqS66S1200000_11) {
        if (o.LJ(Q1K.LIZIZ.get(), Boolean.TRUE)) {
            Q1K.LIZ(new AqS163S0100000_13(aqS66S1200000_11, 364));
        } else {
            C48226IwI.LIZ(new AqS163S0100000_13(aqS66S1200000_11, 365), 0L);
        }
    }

    @Override // X.W6H
    public int LIZIZ(Object obj) {
        return ((InterfaceC81378Vwk) obj).size();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        PaidCollectionDetailResponse response = (PaidCollectionDetailResponse) obj;
        o.LJIIIZ(response, "response");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73484Ssi(timeUnit, abstractC73946T0k).LJIJI(new IDhS94S0100000_1(response, 12));
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        if (output.LIZLLL >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC150675vj
    public AnonymousClass671 LIZLLL(int i, Context context) {
        o.LJIIIZ(context, "context");
        C156466Cc c156466Cc = new C156466Cc(context);
        c156466Cc.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c156466Cc.setLayerType(1, null);
        return c156466Cc;
    }
}
