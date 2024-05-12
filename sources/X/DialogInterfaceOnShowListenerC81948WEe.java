package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WEe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogInterfaceOnShowListenerC81948WEe implements DialogInterface.OnShowListener, DialogInterface.OnKeyListener, InterfaceC81961WEr {
    public DialogInterfaceC39771hF LJLIL;
    public C81947WEd LJLILLLLZI;
    public C81949WEf LJLJI;
    public boolean LJLJJI;

    public DialogInterfaceOnShowListenerC81948WEe(Context context) {
        C81947WEd c81947WEd = new C81947WEd(context);
        this.LJLILLLLZI = c81947WEd;
        c81947WEd.setOnLayoutResetListener(this);
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(context, R.style.a62);
        anonymousClass025.LIZ.LJIJ = this.LJLILLLLZI;
        DialogInterfaceC39771hF LIZ = anonymousClass025.LIZ();
        this.LJLIL = LIZ;
        LIZ.setOnShowListener(this);
        this.LJLIL.setOnKeyListener(this);
        LIZ(this.LJLILLLLZI);
    }

    public static void LIZ(View view) {
        view.setFitsSystemWindows(false);
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            LIZ((View) parent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0 < 0) goto L8;
     */
    @Override // android.content.DialogInterface.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow(android.content.DialogInterface r8) {
        /*
            r7 = this;
            X.WEd r4 = r7.LJLILLLLZI
            X.WEf r0 = r4.LJLJJI
            r3 = 1
            if (r0 != 0) goto L44
        L7:
            X.WEf r0 = r4.LJLJJI
            r6 = 0
            if (r0 == 0) goto L41
            int r0 = r0.LIZ
            if (r0 >= 0) goto L42
        L10:
            X.WEN r5 = new X.WEN
            r5.<init>(r4)
            X.WEf r2 = r4.getTransConfig()
            if (r2 != 0) goto L1f
            r1 = 0
        L1c:
            r4.LJLIL = r1
            return
        L1f:
            java.util.List<android.widget.ImageView> r0 = r2.LJIIIIZZ
            if (r0 != 0) goto L28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L28:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.WET r1 = r5.LIZ(r0)
            java.util.List<java.lang.String> r0 = r2.LJIIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            r5.LIZIZ(r0, r1, r3)
            r4.addView(r1, r3)
            goto L1c
        L41:
            r0 = 0
        L42:
            r6 = r0
            goto L10
        L44:
            java.util.List<java.lang.String> r0 = r0.LJIIIZ
            int r2 = r0.size()
            X.WEb r1 = new X.WEb
            X.WEf r0 = r4.LJLJJI
            int r0 = r0.LIZ
            r1.<init>(r4, r2, r0)
            r4.LJLJI = r1
            X.WEq r0 = r4.LJLLJ
            r1.LJLJI = r0
            X.Vo5 r1 = new X.Vo5
            android.content.Context r0 = r4.LJLJLJ
            r1.<init>(r0)
            r4.LJLILLLLZI = r1
            r0 = 2
            r1.setOverScrollMode(r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = r4.LIZJ(r0)
            r4.setBackgroundColor(r0)
            X.Vo5 r1 = r4.LJLILLLLZI
            r0 = 4
            r1.setVisibility(r0)
            X.Vo5 r1 = r4.LJLILLLLZI
            int r0 = r4.LJLJLLL
            int r0 = r0 + 1
            r1.setOffscreenPageLimit(r0)
            X.Vo5 r1 = r4.LJLILLLLZI
            X.WEb r0 = r4.LJLJI
            r1.setAdapter(r0)
            X.Vo5 r1 = r4.LJLILLLLZI
            X.WEf r0 = r4.LJLJJI
            int r0 = r0.LIZ
            r1.setCurrentItem(r0)
            X.Vo5 r2 = r4.LJLILLLLZI
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            r4.addView(r2, r1)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lcf
            r5.<init>()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = "position"
            X.Vo5 r0 = r4.LJLILLLLZI     // Catch: org.json.JSONException -> Lcf
            int r0 = r0.getCurrentItem()     // Catch: org.json.JSONException -> Lcf
            r5.put(r1, r0)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = "identity"
            X.WEf r0 = r4.LJLJJI     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.LJI     // Catch: org.json.JSONException -> Lcf
            r5.put(r1, r0)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = "from"
            X.WEf r0 = r4.LJLJJI     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.LJII     // Catch: org.json.JSONException -> Lcf
            r5.put(r1, r0)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = "type"
            r5.put(r0, r3)     // Catch: org.json.JSONException -> Lcf
            com.ss.android.ugc.aweme.ecommerce.service.IEventCenter r2 = com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter.LJ()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r1 = "ec_gallery_new_image_viewed"
            java.lang.String r0 = r5.toString()     // Catch: org.json.JSONException -> Lcf
            r2.LIZ(r1, r0)     // Catch: org.json.JSONException -> Lcf
            goto L7
        Lcf:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnShowListenerC81948WEe.onShow(android.content.DialogInterface):void");
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled() && this.LJLJJI && this.LJLILLLLZI.LIZIZ(this.LJLJI.LIZ)) {
            this.LJLJJI = false;
        }
        return true;
    }
}
