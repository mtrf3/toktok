package X;

import Y.ACListenerS24S0201000_7;
import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Gya, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43272Gya extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final String LJLIL;
    public final Long LJLILLLLZI;
    public final TuxSheet LJLJI;
    public final InterfaceC43276Gye LJLJJI;
    public final Activity LJLJJL;
    public final AwemeRawAd LJLJJLL;
    public List<OrientationInfo> LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Integer itemType = ((OrientationInfo) ListProtector.get(this.LJLJL, i)).getItemType();
        if (itemType != null) {
            return itemType.intValue();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Integer infoType;
        AwemeRawAd awemeRawAd;
        AboutAdInfo aboutThisAd;
        String disableText;
        o.LJIIIZ(holder, "holder");
        int itemViewType = getItemViewType(i);
        String str = "";
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                C43273Gyb c43273Gyb = (C43273Gyb) holder;
                OrientationInfo orientationInfo = (OrientationInfo) ListProtector.get(this.LJLJL, i);
                if (!TextUtils.isEmpty(orientationInfo.getTitle())) {
                    c43273Gyb.LJLIL.setText(orientationInfo.getTitle());
                    c43273Gyb.LJLIL.setVisibility(0);
                }
                if (TextUtils.isEmpty(orientationInfo.getEnableText()) || TextUtils.isEmpty(orientationInfo.getDisableText())) {
                    c43273Gyb.LJLILLLLZI.setVisibility(8);
                    return;
                }
                Integer num = orientationInfo.getSwitch();
                if (num == null || num.intValue() != 2) {
                    disableText = orientationInfo.getEnableText();
                } else {
                    disableText = orientationInfo.getDisableText();
                }
                if (TextUtils.isEmpty(orientationInfo.getLinkText())) {
                    c43273Gyb.LJLILLLLZI.setText(disableText);
                } else {
                    TuxTextView tuxTextView = c43273Gyb.LJLILLLLZI;
                    if (disableText == null) {
                        disableText = "";
                    }
                    String linkText = orientationInfo.getLinkText();
                    if (linkText != null) {
                        str = linkText;
                    }
                    String linkUrl = orientationInfo.getLinkUrl();
                    if (linkUrl == null) {
                        linkUrl = "https://www.tiktok.com/safety/en/ads-and-data/";
                    }
                    tuxTextView.setText(GKX.LIZ(disableText, str, linkUrl, this.LJLJJLL, this.LJLILLLLZI, this.LJLJI));
                }
                c43273Gyb.LJLJI.setText(orientationInfo.getButtonText());
                C16880lQ.LJJIZ(c43273Gyb.LJLJI, new ACListenerS24S0201000_7(i, this, orientationInfo, 4));
                if (!o.LJ(orientationInfo.isLastItem(), Boolean.TRUE)) {
                    return;
                }
                c43273Gyb.LJLJJI.setVisibility(0);
                return;
            }
            C43275Gyd c43275Gyd = (C43275Gyd) holder;
            if (a.LJIIJ().LJIIJJI() || GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
                c43275Gyd.LJLILLLLZI.setText(((OrientationInfo) ListProtector.get(this.LJLJL, i)).getFullText());
                C16880lQ.LJIJ(c43275Gyd.LJLIL, new ViewOnClickListenerC43270GyY(this));
                return;
            } else {
                c43275Gyd.LJLIL.setVisibility(8);
                return;
            }
        }
        C43274Gyc c43274Gyc = (C43274Gyc) holder;
        OrientationInfo orientationInfo2 = (OrientationInfo) ListProtector.get(this.LJLJL, i);
        if (!TextUtils.isEmpty(orientationInfo2.getTitle())) {
            c43274Gyc.LJLIL.setText(orientationInfo2.getTitle());
            c43274Gyc.LJLIL.setVisibility(0);
        }
        if (TextUtils.isEmpty(orientationInfo2.getFullText())) {
            c43274Gyc.LJLILLLLZI.setVisibility(8);
        } else if (!ORZ.LJLJJI(orientationInfo2.getInfoType(), C43271GyZ.LIZIZ) && ((infoType = orientationInfo2.getInfoType()) == null || infoType.intValue() != 1 || TextUtils.isEmpty(orientationInfo2.getLinkUrl()))) {
            c43274Gyc.LJLILLLLZI.setText(orientationInfo2.getFullText());
        } else {
            TuxTextView tuxTextView2 = c43274Gyc.LJLILLLLZI;
            String fullText = orientationInfo2.getFullText();
            if (fullText == null) {
                fullText = "";
            }
            String linkText2 = orientationInfo2.getLinkText();
            if (linkText2 != null) {
                str = linkText2;
            }
            tuxTextView2.setText(GKX.LIZ(fullText, str, orientationInfo2.getLinkUrl(), this.LJLJJLL, this.LJLILLLLZI, this.LJLJI));
            c43274Gyc.LJLILLLLZI.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (ORZ.LJLJJI(orientationInfo2.getInfoType(), C43271GyZ.LIZ)) {
            c43274Gyc.LJLJI.setVisibility(0);
            C16880lQ.LJJJ(c43274Gyc.LJLJI, new ACListenerS24S0201000_7(i, this, orientationInfo2, 2));
            C16880lQ.LJJJJI(c43274Gyc.LJLILLLLZI, new ACListenerS24S0201000_7(i, this, orientationInfo2, 3));
        }
        Integer infoType2 = orientationInfo2.getInfoType();
        if (infoType2 != null && infoType2.intValue() == 10001 && (awemeRawAd = this.LJLJJLL) != null && (aboutThisAd = awemeRawAd.getAboutThisAd()) != null && o.LJ(aboutThisAd.getShowQuestionMark(), Boolean.TRUE)) {
            TuxTextView tuxTextView3 = c43274Gyc.LJLILLLLZI;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            tuxTextView3.measure(makeMeasureSpec, makeMeasureSpec);
            if (tuxTextView3.getMeasuredWidth() <= ((int) (KL2.LJIIJJI(C78949Uyf.LJIILL(this.LJLJJL)) * 0.77d))) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c43274Gyc.LJLJI.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.removeRule(21);
                    layoutParams.addRule(17, R.id.rc);
                }
                c43274Gyc.LJLJI.setLayoutParams(layoutParams);
            }
            c43274Gyc.LJLJI.setIconRes(R.raw.icon_question_mark_circle_fill_ltr);
            c43274Gyc.LJLJI.setTintColorRes(R.attr.gp);
            C26338AVi.LJI(c43274Gyc.LJLILLLLZI, null, null, AnonymousClass391.LIZJ(5), null, false, 27);
            c43274Gyc.LJLJI.setVisibility(0);
            C16880lQ.LJJJ(c43274Gyc.LJLJI, new ACListenerS27S0100000_7(this, 94));
        }
        if (!o.LJ(orientationInfo2.isLastItem(), Boolean.TRUE)) {
            return;
        }
        c43274Gyc.LJLJJI.setVisibility(0);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c43274Gyc;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    View view = C28289B8j.LIZ(parent, R.layout.bed, parent, false);
                    o.LJIIIIZZ(view, "view");
                    c43274Gyc = new C43273Gyb(view);
                } else {
                    throw new IllegalStateException("Unknown view type");
                }
            } else {
                View view2 = C28289B8j.LIZ(parent, R.layout.bbe, parent, false);
                o.LJIIIIZZ(view2, "view");
                c43274Gyc = new C43275Gyd(view2);
            }
        } else {
            View view3 = C28289B8j.LIZ(parent, R.layout.beg, parent, false);
            o.LJIIIIZZ(view3, "view");
            c43274Gyc = new C43274Gyc(view3);
        }
        C0AX.LIZ(parent, c43274Gyc.itemView, R.id.lj7);
        View view4 = c43274Gyc.itemView;
        if (view4 != null) {
            view4.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c43274Gyc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c43274Gyc.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c43274Gyc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c43274Gyc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c43274Gyc.getClass().getName();
        return c43274Gyc;
    }

    public C43272Gya(AwemeRawAd awemeRawAd, String str, Long l, TuxSheet tuxSheet, InterfaceC43276Gye itemListener, ActivityC45651qj activity) {
        o.LJIIIZ(itemListener, "itemListener");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = str;
        this.LJLILLLLZI = l;
        this.LJLJI = tuxSheet;
        this.LJLJJI = itemListener;
        this.LJLJJL = activity;
        this.LJLJJLL = awemeRawAd;
        this.LJLJL = new ArrayList();
    }
}
