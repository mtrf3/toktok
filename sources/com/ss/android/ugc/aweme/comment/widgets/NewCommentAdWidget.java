package com.ss.android.ugc.aweme.comment.widgets;

import X.C16880lQ;
import X.C17N;
import X.C207668Da;
import X.C221108m2;
import X.C58655N0h;
import X.C58704N2e;
import X.C5H3;
import X.C61845OOz;
import X.C62846OlW;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C74R;
import X.C76800UCe;
import X.C78765Uvh;
import X.C78983UzD;
import X.C87L;
import X.C87N;
import X.EnumC221088m0;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.KL2;
import X.KP0;
import X.NN1;
import X.NOE;
import X.NPC;
import X.O8Z;
import X.OSZ;
import X.TBT;
import Y.AObjectS52S0101000_7;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class NewCommentAdWidget extends BaseCommentWidget implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final InterfaceC65784Pro<C76800UCe> LJLL;
    public final C87N LJLLI = new C87N(R.id.bjj);
    public final C87N LJLLILLLL = new C87N(R.id.bji);
    public final C87N LJLLJ = new C87N(R.id.bjg);
    public final C87N LJLLL = new C87N(R.id.bjk);
    public final C87N LJLLLL = new C87N(R.id.bjf);
    public final C5H3 LJLLLLLL = C221108m2.LIZ(EnumC221088m0.NONE, C87L.LJLIL);
    public boolean LJLZ = true;
    public boolean LJZ;
    public int LJZI;
    public boolean LJZL;
    public int LL;

    static {
        TBT tbt = new TBT(NewCommentAdWidget.class, "mCommentAdLayout", "getMCommentAdLayout()Landroid/widget/LinearLayout;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLD = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NewCommentAdWidget.class, "mCommentAdSourceTv", "getMCommentAdSourceTv()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(NewCommentAdWidget.class, "mCommentAdDesTv", "getMCommentAdDesTv()Landroid/widget/TextView;", 0, c65351Pkp), C61845OOz.LIZJ(NewCommentAdWidget.class, "mCommentAdUserIv", "getMCommentAdUserIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0, c65351Pkp), C61845OOz.LIZJ(NewCommentAdWidget.class, "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.du9;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout LJJI() {
        return (LinearLayout) this.LJLLI.LIZ(this, LLD[0]);
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void LJIIZILJ() {
        C16880lQ.LJIIZILJ(LJJI(), this);
        C87N c87n = this.LJLLLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLD;
        C16880lQ.LJIIJ(this, c87n.LIZ(this, interfaceC74236TBoArr[4]));
        this.LJLLLL.LIZ(this, interfaceC74236TBoArr[4]).setAlpha(0.5f);
    }

    public final void LJIL() {
        if (!LJIJ() || !C63081OpJ.LJJLIIIJLLLLLLLZ(LJIILJJIL()) || C63081OpJ.LLJILJILJ(LJIILJJIL()) || this.LJZ) {
            return;
        }
        this.LJZ = true;
    }

    public final void LJJII() {
        if (LJIJ() && C63081OpJ.LJJLIIIJLLLLLLLZ(LJIILJJIL()) && LJIILJJIL().getAwemeRawAd() != null && this.LJZ) {
            this.LJZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("comment_ad_struct", this, true);
        dataCenter.iv0("comment_ad_view_state", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        LJJII();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        LJIL();
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    public NewCommentAdWidget(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        this.LJLL = aObjectS52S0101000_7;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: LJIJI */
    public final void onChanged(C207668Da c207668Da) {
        Aweme aweme;
        LiveData liveData;
        LiveData liveData2;
        int i;
        int i2;
        super.onChanged(c207668Da);
        if (c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        boolean z = false;
        Object obj = null;
        switch (str.hashCode()) {
            case -1106422991:
                if (!str.equals("comment_shown")) {
                    return;
                }
                Object obj2 = c207668Da.LIZIZ;
                if (obj2 == null) {
                    obj2 = Boolean.FALSE;
                }
                if (!o.LJ(obj2, 0) || (i = this.LJZI) <= 0 || !this.LJZL || (i2 = this.LL) >= i) {
                    return;
                }
                int i3 = i2 + 1;
                this.LL = i3;
                if (i3 != i || !this.LJLZ) {
                    return;
                }
                LJJ(LJJI(), C17N.LJIILL(16.0d), 300, true);
                return;
            case 566175283:
                if (!str.equals("comment_ad_view_state")) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 == null) {
                    obj3 = Boolean.FALSE;
                }
                if (o.LJ(obj3, 0)) {
                    LJJ(LJJI(), this.LJLIL.getResources().getDimensionPixelOffset(R.dimen.dj), 0, false);
                    return;
                } else {
                    if (!o.LJ(obj3, 1)) {
                        return;
                    }
                    LJJ(LJJI(), this.LJLIL.getResources().getDimensionPixelOffset(R.dimen.dj), 300, false);
                    return;
                }
            case 584899985:
                if (!str.equals("comment_ad_struct")) {
                    return;
                }
                Object obj4 = c207668Da.LIZIZ;
                if (obj4 != null) {
                    obj = obj4;
                }
                CommentStruct commentStruct = (CommentStruct) obj;
                if (commentStruct == null) {
                    return;
                }
                int showButtonNumber = commentStruct.getShowButtonNumber();
                if (showButtonNumber == 0) {
                    if (this.LJZI != 0) {
                        DataCenter dataCenter = this.LJLJJI;
                        dataCenter.getClass();
                        if (!TextUtils.isEmpty("comment_shown") && (liveData2 = (LiveData) ((HashMap) dataCenter.LJLILLLLZI).get("comment_shown")) != null) {
                            liveData2.removeObserver(this);
                        }
                    }
                } else if (showButtonNumber > 0) {
                    this.LJLJJI.iv0("comment_shown", this, true);
                }
                this.LJZI = showButtonNumber;
                C87N c87n = this.LJLLILLLL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLD;
                ((TextView) c87n.LIZ(this, interfaceC74236TBoArr[1])).setText(commentStruct.getSource());
                ((TextView) this.LJLLJ.LIZ(this, interfaceC74236TBoArr[2])).setText(commentStruct.getTitle());
                C78765Uvh.LJFF((C62846OlW) this.LJLLL.LIZ(this, interfaceC74236TBoArr[3]), commentStruct.getAvatarIcon());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(KL2.LIZJ(this.LJLIL, 4.0f));
                gradientDrawable.setColor(NPC.LIZIZ(this.LJLIL, LJIILJJIL()));
                LJJI().setBackground(gradientDrawable);
                return;
            case 2016314694:
                if (!str.equals("comment_aweme_and_params")) {
                    return;
                }
                this.LJLZ = true;
                this.LL = 0;
                if (this.LJZI != 0) {
                    DataCenter dataCenter2 = this.LJLJJI;
                    dataCenter2.getClass();
                    if (!TextUtils.isEmpty("comment_shown") && (liveData = (LiveData) ((HashMap) dataCenter2.LJLILLLLZI).get("comment_shown")) != null) {
                        liveData.removeObserver(this);
                    }
                }
                this.LJZI = 0;
                LJJ(LJJI(), this.LJLIL.getResources().getDimensionPixelOffset(R.dimen.dj), 0, false);
                Object obj5 = c207668Da.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                OSZ osz = (OSZ) obj;
                if (osz == null || (aweme = (Aweme) osz.getFirst()) == null) {
                    return;
                }
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    z = awemeRawAd.isCommentAreaSwitch();
                }
                this.LJZL = z;
                LJJII();
                LJIL();
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AwemeRawAd awemeRawAd;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.bottomMargin < 0 || !LJIJ() || (awemeRawAd = LJIILJJIL().getAwemeRawAd()) == null) {
            return;
        }
        int id = view.getId();
        boolean z = true;
        if (id == R.id.bjj) {
            String type = awemeRawAd.getType();
            if (type == null || type.length() == 0) {
                return;
            }
            Aweme LJIILJJIL = LJIILJJIL();
            if (LJIILJJIL.isAd()) {
                C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_end_ad", "click", LJIILJJIL.getAwemeRawAd());
                LIZLLL.LIZJ("button", "refer");
                LIZLLL.LIZIZ(NN1.LJI(LJIILJJIL), "anchor_id");
                LIZLLL.LIZIZ(NN1.LJIIZILJ(LJIILJJIL), "room_id");
                LIZLLL.LJI();
                AwemeRawAd awemeRawAd2 = LJIILJJIL.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    O8Z.LIZ("click", awemeRawAd2.getClickTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra());
                }
            }
            if (NOE.LJJIIJ(this.LJLIL, LJIILJJIL(), 6, (C74R) this.LJLLLLLL.getValue())) {
                this.LJLL.invoke();
                return;
            }
            return;
        }
        if (id == R.id.bjf) {
            this.LJLZ = false;
            Context context = this.LJLIL;
            JSONObject LJIILIIL = NN1.LJIILIIL(context, awemeRawAd, true, null);
            if (!TextUtils.isEmpty("button")) {
                try {
                    LJIILIIL.put("refer", "button");
                } catch (JSONException e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
            if (context == null) {
                z = false;
            }
            if (z) {
                NN1.LJJJJJL(context, awemeRawAd, "comment_end_ad", "close", LJIILIIL);
            }
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("comment_end_ad", "close", awemeRawAd);
            LIZLLL2.LIZJ("button", "refer");
            LIZLLL2.LJII();
            LJJ(LJJI(), this.LJLIL.getResources().getDimensionPixelOffset(R.dimen.dj), 300, false);
        }
    }

    public final void LJJ(View view, int i, int i2, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        int i3 = marginLayoutParams.bottomMargin;
        boolean z3 = true;
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2) {
                Context context = this.LJLIL;
                AwemeRawAd awemeRawAd = LJIILJJIL().getAwemeRawAd();
                JSONObject LJIILIIL = NN1.LJIILIIL(context, awemeRawAd, false, null);
                if (context == null || awemeRawAd == null) {
                    z3 = false;
                }
                if (z3) {
                    NN1.LJJJJJL(context, awemeRawAd, "comment_end_ad", "othershow", LJIILIIL);
                }
                C58704N2e.LIZLLL("comment_end_ad", "othershow", LJIILJJIL().getAwemeRawAd()).LJII();
                KP0.LIZIZ(view, i3, i, i2).start();
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        KP0.LIZIZ(view, i3, i, i2).start();
    }
}
