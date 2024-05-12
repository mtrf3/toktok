package X;

import Y.ARunnableS23S0200000_4;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.NewReleaseAnchorExtra;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.SUw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72190SUw extends C8IM {
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final SmartImageView LJLJL;
    public final LinearLayout LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public InterfaceC44105HSr LJLLI;
    public AnchorCommonStruct LJLLILLLL;
    public long LJLLJ;
    public NewReleaseAnchorExtra LJLLL;
    public final C73318Sq2 LJLLLL;

    @Override // X.C8IM
    public final void LJI(float f) {
    }

    @Override // X.C8IM
    public final void LJIIIZ() {
    }

    @Override // X.C8IG
    public final void LIZIZ() {
        this.LJLLLL.LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72190SUw(Context context) {
        super(context);
        int i;
        a1.LJFF(context, "context");
        this.LJLLLL = new C73318Sq2();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ae_, C16880lQ.LLZIL(context), this);
        this.LJLJLJ = (LinearLayout) findViewById(R.id.g6o);
        this.LJLJJL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLJL = (SmartImageView) findViewById(R.id.f51);
        this.LJLJJLL = (TuxTextView) findViewById(R.id.mlr);
        C110614Vt c110614Vt = new C110614Vt();
        if (C87026YDm.LIZIZ()) {
            i = R.attr.l2;
        } else {
            i = R.attr.ch;
        }
        c110614Vt.LIZIZ = Integer.valueOf(i);
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        LLLZIIL.setBackground(c110614Vt.LIZ(context));
    }

    @Override // X.C8IM
    public final void LJFF(double d) {
        TTMStoreLink tTMStoreLink;
        InterfaceC44105HSr interfaceC44105HSr;
        Aweme LJJLL;
        String aid;
        TuxTextView tuxTextView;
        CharSequence text;
        this.LJLJI = d;
        C72193SUz.LIZ.getClass();
        if (d > C72193SUz.LIZJ.getAnimationDelay() && !this.LJLJLLL && (tuxTextView = this.LJLJJLL) != null && (text = tuxTextView.getText()) != null && text.length() > 0) {
            this.LJLJLLL = true;
            LinearLayout linearLayout = this.LJLJLJ;
            if (linearLayout != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(linearLayout, new ARunnableS23S0200000_4(linearLayout, this, 30));
            }
        }
        NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLLL;
        if (newReleaseAnchorExtra != null && newReleaseAnchorExtra.isTtm()) {
            SV9.LIZ.getClass();
            if (d > SV9.LIZ() && !this.LJLL) {
                this.LJLL = true;
                SVA sva = SVA.TIKTOK_MUSIC;
                SV7.LIZ.getClass();
                if (SV7.LJFF(false)) {
                    Context context = getContext();
                    EnumC72191SUx enumC72191SUx = EnumC72191SUx.NEW_RELEASE_ANCHOR_MAJOR;
                    NewReleaseAnchorExtra newReleaseAnchorExtra2 = this.LJLLL;
                    if (newReleaseAnchorExtra2 == null || (tTMStoreLink = newReleaseAnchorExtra2.store) == null || (interfaceC44105HSr = this.LJLLI) == null || (LJJLL = interfaceC44105HSr.LJJLL()) == null || (aid = LJJLL.getAid()) == null) {
                        return;
                    }
                    o.LJIIIIZZ(context, "context");
                    this.LJLLLL.LIZ(SV6.LIZ(new C72192SUy(enumC72191SUx, context, tTMStoreLink, aid).LIZ(), sva));
                }
            }
        }
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        boolean z;
        InterfaceC44105HSr interfaceC44105HSr;
        Aweme LJJLL;
        String aid;
        String str;
        String str2;
        Aweme LJJLL2;
        NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLLL;
        if (newReleaseAnchorExtra != null && newReleaseAnchorExtra.isTtm()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SV7.LIZ.getClass();
            if (SV7.LJFF(false)) {
                SVA sva = SVA.TIKTOK_MUSIC;
                InterfaceC44105HSr interfaceC44105HSr2 = this.LJLLI;
                if (interfaceC44105HSr2 == null || (LJJLL2 = interfaceC44105HSr2.LJJLL()) == null || (str2 = LJJLL2.getAid()) == null) {
                    str2 = "";
                }
                SV6.LIZIZ(sva, str2, EnumC72191SUx.NEW_RELEASE_ANCHOR_MAJOR);
            }
        }
        NewReleaseAnchorExtra newReleaseAnchorExtra2 = this.LJLLL;
        if (newReleaseAnchorExtra2 != null && (interfaceC44105HSr = this.LJLLI) != null && (LJJLL = interfaceC44105HSr.LJJLL()) != null && (aid = LJJLL.getAid()) != null) {
            if (newReleaseAnchorExtra2.isNewRelease()) {
                String str3 = newReleaseAnchorExtra2.ttmTrackId;
                if (str3 != null) {
                    SVF.LJIIIZ(str3, aid);
                }
            } else if (newReleaseAnchorExtra2.isPreRelease() && (str = newReleaseAnchorExtra2.ttmTrackId) != null) {
                SVF.LJIIJJI(str, aid);
            }
        }
        return true;
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        InterfaceC44105HSr interfaceC44105HSr;
        Aweme LJJLL;
        String aid;
        String str;
        o.LJIIIZ(useCustomAction, "useCustomAction");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.LJLLJ > 300) {
            this.LJLLJ = elapsedRealtime;
            NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLLL;
            if (newReleaseAnchorExtra != null) {
                InterfaceC44105HSr interfaceC44105HSr2 = this.LJLLI;
                if (interfaceC44105HSr2 == null || (LJJLL = interfaceC44105HSr2.LJJLL()) == null || (aid = LJJLL.getAid()) == null) {
                    return;
                }
                if (newReleaseAnchorExtra.isNewRelease()) {
                    String str2 = newReleaseAnchorExtra.ttmTrackId;
                    if (str2 != null) {
                        SVF.LJIIIIZZ(str2, aid);
                    }
                } else if (newReleaseAnchorExtra.isPreRelease() && (str = newReleaseAnchorExtra.ttmTrackId) != null) {
                    SVF.LJIIJ(str, aid);
                }
            }
            AnchorCommonStruct anchorCommonStruct = this.LJLLILLLL;
            if (anchorCommonStruct == null || (interfaceC44105HSr = this.LJLLI) == null) {
                return;
            }
            C72178SUk.LIZIZ(anchorCommonStruct, interfaceC44105HSr, this.LJLLL);
        }
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        Object obj;
        String str;
        o.LJIIIZ(commonClickAction, "commonClickAction");
        this.LJLLI = interfaceC44105HSr;
        this.LJLLILLLL = anchorCommonStruct;
        String str2 = null;
        try {
            obj = ((Gson) C25742A8k.LIZ.getValue()).LJI(anchorCommonStruct.getExtra(), NewReleaseAnchorExtra.class);
        } catch (Exception unused) {
            obj = null;
        }
        this.LJLLL = (NewReleaseAnchorExtra) obj;
        C72178SUk.LIZ(anchorCommonStruct.getLogExtra());
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            AnchorCommonStruct anchorCommonStruct2 = this.LJLLILLLL;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getKeyword();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            NewReleaseAnchorExtra newReleaseAnchorExtra = this.LJLLL;
            if (newReleaseAnchorExtra != null) {
                str2 = newReleaseAnchorExtra.subTitle;
            }
            tuxTextView2.setText(str2);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(anchorCommonStruct.getIcon()));
        LJII.LJJIIJ = this.LJLJL;
        C16880lQ.LLJJJ(LJII);
    }
}
