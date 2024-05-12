package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213828aI {
    public final List<AnchorCommonStruct> LIZ;
    public final TuxSheet LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.3dp, android.view.View] */
    public C213828aI(final Context context, List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        UrlModel icon;
        this.LIZ = list;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        for (AnchorCommonStruct anchorCommonStruct : list) {
            ?? r2 = new FrameLayout(context) { // from class: X.3dp
                public SmartImageView LJLIL;
                public SmartImageView LJLILLLLZI;
                public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

                public final View LIZ(int i) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
                    View view = (View) linkedHashMap.get(Integer.valueOf(i));
                    if (view != null) {
                        return view;
                    }
                    View findViewById = findViewById(i);
                    if (findViewById == null) {
                        return null;
                    }
                    linkedHashMap.put(Integer.valueOf(i), findViewById);
                    return findViewById;
                }

                {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bfj, this, true);
                    View findViewById = LLLLIILL.findViewById(R.id.fd9);
                    o.LJIIIIZZ(findViewById, "view.findViewById(R.id.k_common_anchor_icon)");
                    this.LJLIL = (SmartImageView) findViewById;
                    View findViewById2 = LLLLIILL.findViewById(R.id.fd8);
                    o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.k_common_anchor_btn)");
                    this.LJLILLLLZI = (SmartImageView) findViewById2;
                }

                public final void setActionIcon(ImageUrlModel urlModel) {
                    o.LJIIIZ(urlModel, "urlModel");
                    W5F LJII = W5U.LJII(urlModel);
                    LJII.LJIJI = Bitmap.Config.ARGB_8888;
                    SmartImageView smartImageView = this.LJLILLLLZI;
                    if (smartImageView != null) {
                        LJII.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LJII);
                    } else {
                        o.LJIJI("actionIconView");
                        throw null;
                    }
                }

                public final void setIcon(ImageUrlModel urlModel) {
                    o.LJIIIZ(urlModel, "urlModel");
                    W5F LJII = W5U.LJII(urlModel);
                    LJII.LJIJI = Bitmap.Config.ARGB_8888;
                    SmartImageView smartImageView = this.LJLIL;
                    if (smartImageView != null) {
                        LJII.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LJII);
                    } else {
                        o.LJIJI("iconView");
                        throw null;
                    }
                }

                public final void setOnActionClickListener(View.OnClickListener onClickListener) {
                    C16880lQ.LJJIJLIJ((SmartImageView) LIZ(R.id.fd8), onClickListener);
                }

                public final void setSubtitle(String str) {
                    ((TextView) LIZ(R.id.fd_)).setText(str);
                }

                public final void setTitle(String str) {
                    ((TextView) LIZ(R.id.fda)).setText(str);
                }
            };
            List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
            if (actions != null && (anchorPanelAction = (AnchorPanelAction) ListProtector.get(actions, 0)) != null && (icon = anchorPanelAction.getIcon()) != null) {
                r2.setActionIcon(C78939UyV.LJ(icon));
            }
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                r2.setIcon(C78939UyV.LJ(thumbnail));
            }
            r2.setTitle(anchorCommonStruct.getKeyword());
            r2.setSubtitle(anchorCommonStruct.getDescription());
            linearLayout.addView(r2);
        }
        ASL asl = new ASL();
        asl.LIZ(linearLayout);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = true;
        tuxSheet.LJLJI = true;
        tuxSheet.LLD = false;
        asl.LIZ.LJLLLLLL = linearLayout.getHeight();
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1534));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = context.getString(R.string.hnq);
        o.LJIIIIZZ(string, "context.getString(R.stri…k_multipanel_modal_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZLLL = true;
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLL = c235119Kp;
        this.LIZIZ = tuxSheet2;
    }
}
