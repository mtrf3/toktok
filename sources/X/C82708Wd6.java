package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wd6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82708Wd6 extends AbstractC29229BdZ {
    public final Fragment LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final View.OnTouchListener LJLJLLL;
    public final C0TS LJLL;
    public C82713WdB LJLLI;
    public final java.util.Map<Integer, C82711Wd9> LJLLILLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLL.LIZ).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[SYNTHETIC] */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "any"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            android.view.View r7 = (android.view.View) r7
            r0 = 2131369790(0x7f0a1f3e, float:1.8359568E38)
            java.lang.Object r5 = r7.getTag(r0)
            boolean r0 = r5 instanceof X.InterfaceC82710Wd8
            r4 = 0
            if (r0 == 0) goto L5a
            X.Wd8 r5 = (X.InterfaceC82710Wd8) r5
        L15:
            int r3 = r6.getCount()
            r2 = 0
        L1a:
            if (r2 >= r3) goto L5c
            X.0TS r1 = r6.LJLL
            if (r2 < 0) goto L56
            java.lang.Object r0 = r1.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r2 < r0) goto L4b
        L2a:
            r0 = r4
        L2b:
            if (r5 == 0) goto L48
            if (r0 == 0) goto L46
            java.lang.String r1 = r0.getAid()
        L33:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.getAid()
        L3d:
            boolean r0 = X.C38354F3m.LIZJ(r1, r0)
            if (r0 == 0) goto L48
            return r2
        L44:
            r0 = r4
            goto L3d
        L46:
            r1 = r4
            goto L33
        L48:
            int r2 = r2 + 1
            goto L1a
        L4b:
            java.lang.Object r0 = r1.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            goto L2b
        L56:
            r1.getClass()
            goto L2a
        L5a:
            r5 = r4
            goto L15
        L5c:
            r0 = -2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82708Wd6.LJIIL(java.lang.Object):int");
    }

    @Override // X.AbstractC29229BdZ
    public final void LJJIIJ(View view) {
        InterfaceC82710Wd8 interfaceC82710Wd8;
        Object obj = null;
        if (view != null) {
            obj = view.getTag(R.id.fdh);
        }
        if ((obj instanceof InterfaceC82710Wd8) && (interfaceC82710Wd8 = (InterfaceC82710Wd8) obj) != null) {
            interfaceC82710Wd8.unBind();
            if (((HashMap) this.LJLLILLLL).containsKey(Integer.valueOf(interfaceC82710Wd8.getPosition()))) {
                ((HashMap) this.LJLLILLLL).remove(Integer.valueOf(interfaceC82710Wd8.getPosition()));
            }
        }
    }

    public final void setData(List<? extends Aweme> list) {
        C0TS c0ts = this.LJLL;
        ((ArrayList) c0ts.LIZ).clear();
        if (list != null) {
            for (Aweme aweme : list) {
                if (aweme != null) {
                    ((ArrayList) c0ts.LIZ).add(aweme);
                }
            }
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:10|(1:38)|12|(3:18|(2:22|(1:24))|(5:26|27|(1:29)|30|(1:32)))|33|34|27|(0)|30|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016b, code lost:
    
        X.C16880lQ.LLLLIIL(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    @Override // X.AbstractC29229BdZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIII(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82708Wd6.LJJIII(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82708Wd6(Context context, Fragment fragment, String enterFrom, String str, ViewOnTouchListenerC81167VtL viewOnTouchListenerC81167VtL) {
        super(context, C16880lQ.LLZIL(context), 1);
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLJJLL = fragment;
        this.LJLJL = enterFrom;
        this.LJLJLJ = str;
        this.LJLJLLL = viewOnTouchListenerC81167VtL;
        this.LJLL = new C0TS(3);
        this.LJLLILLLL = new HashMap();
    }
}
