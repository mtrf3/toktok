package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BIu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28560BIu extends ClickableSpan {
    public final /* synthetic */ C1P LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ PerceptionMessage LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        C1P c1p = this.LJLIL;
        Context context = c1p.LJLIL;
        if (context != null) {
            long j = this.LJLILLLLZI;
            PerceptionMessage perceptionMessage = this.LJLJI;
            LiveDialog liveDialog = c1p.LJLJJL;
            if (liveDialog != null) {
                liveDialog.dismiss();
            }
            if (j == 1) {
                str = "https://www.tiktok.com/legal/page/global/rewards-policy-eea/en";
            } else {
                str = "https://www.tiktok.com/legal/page/row/virtual-items/en";
            }
            int LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(context));
            C29682Bks LIZJ = C29683Bkt.LIZJ(str);
            int LJIIJJI = C87277YNd.LJIIJJI(160);
            BY3 by3 = BY3.DP;
            LIZJ.LJIIJ(LJIIJJI, by3);
            LIZJ.LJIL(LJIJ, by3);
            LIZJ.LJIJJ("bottom");
            LIZJ.LJIIIZ("bottom");
            C29682Bks.LJIJI(LIZJ, 8);
            String uri = LIZJ.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder\n…ius(8).build().toString()");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            ((IHybridContainerService) LIZ).Vs0(context, uri, null);
            c1p.LJ("click", "program_terms", perceptionMessage.publicEventInfo, perceptionMessage.dialog);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Integer LJI;
        o.LJIIIZ(ds, "ds");
        Context context = this.LJLIL.LJLIL;
        if (context != null && (LJI = C79045V0n.LJI(R.attr.e3, context)) != null) {
            ds.setColor(LJI.intValue());
        }
    }

    public C28560BIu(C1P c1p, long j, PerceptionMessage perceptionMessage) {
        this.LJLIL = c1p;
        this.LJLILLLLZI = j;
        this.LJLJI = perceptionMessage;
    }
}
