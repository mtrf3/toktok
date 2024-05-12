package X;

import Y.ARunnableS0S2300000_1;
import Y.IDDListenerS104S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import com.ss.android.ugc.aweme.share.dislike.Keyword;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Oiw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62686Oiw implements InterfaceC62486Ofi, InterfaceC62702OjC {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_broken_heart;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_heart_broken_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.iqu;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "dislike";
    }

    public final void LJIIJ() {
        if (!o.LJ(this.LJLILLLLZI, "long_video_detail_page") && !o.LJ(this.LJLILLLLZI, "homepage_long_video") && !LIZJ(this.LJLIL)) {
            LJIIL();
        }
    }

    public final void LJIIL() {
        if (!((Boolean) C33963DUp.LIZ.getValue()).booleanValue()) {
            C2U8.LIZ(new C55045Liz(this.LJLILLLLZI, this.LJLIL, "FUNCTION_FROM_NOT_INTERESTED"));
        }
    }

    @Override // X.InterfaceC62702OjC
    public final void Cj0() {
        Context LIZIZ;
        boolean z;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        ActivityC45651qj activityC45651qj2;
        FragmentManager supportFragmentManager2;
        if (C84763XOl.LJIIIIZZ() != null) {
            LIZIZ = C84763XOl.LJIIIIZZ();
        } else {
            LIZIZ = EF7.LIZIZ();
        }
        if (((RBX) HG3.LJIILL()).isLogin() && !this.LJLIL.isAd() && DV4.LIZ() != 0 && (LIZIZ instanceof C29S)) {
            C29S activity = (C29S) LIZIZ;
            AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 444);
            if (this.LJLIL.getTextExtra() != null && this.LJLIL.getTextExtra().size() > 0) {
                ((ChooseReasonAPI.RealAPI) ChooseReasonAPI.LJIIIIZZ.getValue()).getFilteredKeywords().LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9TM
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        FilteredKeywords filteredKeywords = (FilteredKeywords) obj;
                        InterfaceC88471Ynr<? super List<Keyword>, ? super Integer, C76800UCe> interfaceC88471Ynr = ChooseReasonAPI.LIZJ;
                        if (interfaceC88471Ynr != null) {
                            interfaceC88471Ynr.invoke(filteredKeywords.getList(), Integer.valueOf(filteredKeywords.getCounts()));
                        }
                        ChooseReasonAPI.LJII = filteredKeywords;
                    }
                }, new InterfaceC64592gB() { // from class: X.9TN
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        InterfaceC88471Ynr<? super List<Keyword>, ? super Integer, C76800UCe> interfaceC88471Ynr = ChooseReasonAPI.LIZJ;
                        if (interfaceC88471Ynr != null) {
                            interfaceC88471Ynr.invoke(new ArrayList(), 0);
                        }
                        ChooseReasonAPI.LJII = null;
                    }
                });
            }
            if (DV4.LIZ() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C62876Om0 c62876Om0 = new C62876Om0(activity, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
                ASL LIZ = C249109q6.LIZ(0);
                LIZ.LIZ(c62876Om0.LJII);
                TuxSheet tuxSheet = LIZ.LIZ;
                tuxSheet.LJZI = false;
                tuxSheet.LJLILLLLZI = new IDDListenerS104S0200000_10(aqS160S0100000_10, c62876Om0, 3);
                C62876Om0.LJIIZILJ = tuxSheet;
                c62876Om0.LJIILJJIL.LIZ();
                TuxTextView tuxTextView = c62876Om0.LJ;
                tuxTextView.setVisibility(0);
                tuxTextView.setText(c62876Om0.LIZ.getString(R.string.iv4));
                c62876Om0.LJIIJJI.LIZIZ(c62876Om0.LJIILLIIL);
                c62876Om0.LIZIZ();
                c62876Om0.LJIIL.LIZJ();
                C62710OjK c62710OjK = c62876Om0.LJIIL;
                AqS157S0200000_10 aqS157S0200000_10 = new AqS157S0200000_10(tuxSheet, aqS160S0100000_10, 46);
                c62710OjK.getClass();
                c62710OjK.LJI = aqS157S0200000_10;
                c62710OjK.LJFF = new AqS99S0300000_10(c62876Om0, tuxSheet, aqS160S0100000_10, 16);
                c62876Om0.LIZ();
                Activity LIZ2 = C27740Aue.LIZ(c62876Om0.LIZ);
                if ((LIZ2 instanceof ActivityC45651qj) && (activityC45651qj2 = (ActivityC45651qj) LIZ2) != null && (supportFragmentManager2 = activityC45651qj2.getSupportFragmentManager()) != null) {
                    tuxSheet.show(supportFragmentManager2, "");
                    new C61996OUu(c62876Om0.LIZ).LIZ(0);
                    C41858Gbm.LIZIZ(c62876Om0.LIZJ, c62876Om0.LIZIZ, c62876Om0.LIZLLL);
                    c62876Om0.LJIIIZ.LJIILJJIL();
                }
            } else if (DV4.LIZ() == 2 || DV4.LIZ() == 4) {
                aqS160S0100000_10.invoke();
                Aweme aweme = this.LJLIL;
                String enterForm = this.LJLILLLLZI;
                String enterMethod = this.LJLJI;
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(enterForm, "enterForm");
                o.LJIIIZ(enterMethod, "enterMethod");
                View decorView = activity.getWindow().getDecorView();
                o.LJIIIIZZ(decorView, "activity.window.decorView");
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS0S2300000_1(activity, aweme, enterForm, enterMethod, decorView, 1), 100L);
            } else if (DV4.LIZ() == 3) {
                C62876Om0 c62876Om02 = new C62876Om0(activity, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
                ASL LIZ3 = C249109q6.LIZ(0);
                LIZ3.LIZ(c62876Om02.LJII);
                TuxSheet tuxSheet2 = LIZ3.LIZ;
                tuxSheet2.LJZI = false;
                tuxSheet2.LJLILLLLZI = new IDDListenerS104S0200000_10(aqS160S0100000_10, c62876Om02, 2);
                C62876Om0.LJIIZILJ = tuxSheet2;
                c62876Om02.LJIILJJIL.LIZ();
                TuxTextView tuxTextView2 = c62876Om02.LJ;
                tuxTextView2.setVisibility(0);
                tuxTextView2.setText(c62876Om02.LIZ.getString(R.string.iv4));
                c62876Om02.LJIIJJI.LIZIZ(c62876Om02.LJIILLIIL);
                c62876Om02.LIZJ();
                c62876Om02.LJIIL.LIZJ();
                C62710OjK c62710OjK2 = c62876Om02.LJIIL;
                AqS157S0200000_10 aqS157S0200000_102 = new AqS157S0200000_10(tuxSheet2, aqS160S0100000_10, 44);
                c62710OjK2.getClass();
                c62710OjK2.LJI = aqS157S0200000_102;
                c62710OjK2.LJFF = new AqS99S0300000_10(c62876Om02, tuxSheet2, aqS160S0100000_10, 15);
                c62876Om02.LIZ();
                Activity LIZ4 = C27740Aue.LIZ(c62876Om02.LIZ);
                if ((LIZ4 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZ4) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                    tuxSheet2.show(supportFragmentManager, "");
                    new C61996OUu(c62876Om02.LIZ).LIZ(0);
                    C41858Gbm.LIZIZ(c62876Om02.LIZJ, c62876Om02.LIZIZ, c62876Om02.LIZLLL);
                    c62876Om02.LJIIIZ.LJIILJJIL();
                }
            }
            Aweme aweme2 = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C41858Gbm.LIZ(1, aweme2, str, str2, "", "dislike", c61878OQg, c61878OQg);
            return;
        }
        LJIIJ();
        if (!this.LJLIL.isAd() && TextUtils.equals(this.LJLILLLLZI, "homepage_hot") && a.LJFF().LJIIIZ() == 1 && !LIZJ(this.LJLIL)) {
            if (LIZIZ != null) {
                a.LJFF().LJIIL(LIZIZ, this.LJLIL);
            }
        } else {
            if (LIZJ(this.LJLIL)) {
                return;
            }
            Boolean LIZ5 = SharePrefCache.inst().getHasLongPressDislike().LIZ();
            o.LJIIIIZZ(LIZ5, "inst().hasLongPressDislike.cache");
            if (LIZ5.booleanValue() || o.LJ(this.LJLILLLLZI, "long_video_detail_page") || o.LJ(this.LJLILLLLZI, "homepage_long_video")) {
                if (C59111NHv.LJ(this.LJLIL)) {
                    C05L.LIZLLL(LIZIZ, R.string.qeh);
                    return;
                } else {
                    C05L.LIZLLL(LIZIZ, R.string.te_);
                    return;
                }
            }
            C05L.LIZLLL(LIZIZ, R.string.hyj);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        if ((!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) && !this.LJLJJI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62702OjC
    public final void T60(Exception exc) {
        Context LIZIZ;
        String str;
        if (DV4.LIZ() != 0 && ((RBX) HG3.LJIILL()).isLogin()) {
            if (C84763XOl.LJIIIIZZ() != null) {
                LIZIZ = C84763XOl.LJIIIIZZ();
            } else {
                LIZIZ = EF7.LIZIZ();
            }
            if (!o.LJ(this.LJLILLLLZI, "long_video_detail_page") && !o.LJ(this.LJLILLLLZI, "homepage_long_video")) {
                LJIIL();
            }
            C05L.LIZLLL(LIZIZ, R.string.iv9);
            Aweme aweme = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            String str3 = this.LJLJI;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            if (exc == null || (str = exc.getMessage()) == null) {
                str = "";
            }
            C41858Gbm.LIZ(0, aweme, str2, str3, str, "dislike", c61878OQg, c61878OQg);
            return;
        }
        LJIIJ();
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x033e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0341, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0344, code lost:
    
        r6 = "";
        r8 = "";
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0349, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0271, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0350, code lost:
    
        if (X.DV4.LIZ() != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016c, code lost:
    
        if (r6 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0174, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0175, code lost:
    
        r8.LIZLLL(r5, r1);
        r5 = r9.LJII(r19.LJLIL, r8);
        X.C222578oP.LIZJ(r5, r19.LJLIL, null, null, 14);
        ((X.JHM) r5).LJIILIIL();
        r5 = r19.LJLIL.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x018e, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0190, code lost:
    
        r1 = com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl.LJIIJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0194, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0196, code lost:
    
        r1.LJFF(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a7, code lost:
    
        if (((java.lang.Boolean) X.C33963DUp.LIZIZ.getValue()).booleanValue() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        r1 = r19.LJLIL.getAid();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "aweme.aid");
        X.C34016DWq.LIZ = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c1, code lost:
    
        if (((java.lang.Boolean) X.C33963DUp.LIZ.getValue()).booleanValue() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c9, code lost:
    
        if (LIZJ(r19.LJLIL) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cb, code lost:
    
        X.C2U8.LIZ(new X.C55045Liz(r19.LJLILLLLZI, r19.LJLIL, "FUNCTION_FROM_NOT_INTERESTED"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01df, code lost:
    
        if (android.text.TextUtils.isEmpty(r19.LJLILLLLZI) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01eb, code lost:
    
        if (android.text.TextUtils.isEmpty(r19.LJLIL.getAid()) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ed, code lost:
    
        r15 = r19.LJLIL.getAid();
        kotlin.jvm.internal.o.LJIIIIZZ(r15, "aweme.aid");
        X.C48229IwL.LIZ(new X.C48231IwN(2, r15, r19.LJLILLLLZI, java.lang.System.currentTimeMillis()));
        r15 = r19.LJLIL.getAid();
        kotlin.jvm.internal.o.LJIIIIZZ(r15, "aweme.aid");
        X.C48229IwL.LIZ(new X.C48231IwN(3, r15, r19.LJLILLLLZI, java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0221, code lost:
    
        r7 = new X.C62701OjB();
        r5 = new X.OQG();
        r5.LJLIL = java.lang.Boolean.valueOf(r19.LJLJJI);
        r7.LJJ(r5);
        r7.LJLILLLLZI = r19;
        r7.LJIILL(r19.LJLIL, java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x024e, code lost:
    
        if (r19.LJLIL.isAd() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0254, code lost:
    
        if (X.DV4.LIZ() != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0257, code lost:
    
        r6 = r19.LJLIL;
        kotlin.jvm.internal.o.LJIIIZ(r6, "aweme");
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ = new java.util.LinkedHashMap();
        r1 = r6.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0269, code lost:
    
        if (r1 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026b, code lost:
    
        r5 = r1.getUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026f, code lost:
    
        if (r5 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0272, code lost:
    
        r1 = r6.getMusic();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0276, code lost:
    
        if (r1 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0278, code lost:
    
        r9 = java.lang.Long.valueOf(r1.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0284, code lost:
    
        if (r6.isAd() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0286, code lost:
    
        r1 = r6.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x028a, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028c, code lost:
    
        r1 = r1.getAdId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0290, code lost:
    
        r8 = java.lang.String.valueOf(r1);
        r1 = r6.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0298, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x029a, code lost:
    
        r1 = r1.getCreativeId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x029e, code lost:
    
        r7 = java.lang.String.valueOf(r1);
        r1 = r6.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a6, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a8, code lost:
    
        r4 = r1.getLogExtra();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ac, code lost:
    
        r6 = java.lang.String.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b4, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b6, code lost:
    
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("ad_id", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c1, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c3, code lost:
    
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("creative_id", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02ce, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d0, code lost:
    
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("log_extra", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02db, code lost:
    
        if (android.text.TextUtils.isEmpty("") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02dd, code lost:
    
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("commit_type", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e4, code lost:
    
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("channel_id", java.lang.String.valueOf(r11));
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("music_id", r9.toString());
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("author_id", r5);
        com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ.put("video_type", java.lang.String.valueOf(0));
        X.QJY.LJI(com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI.LIZ, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0311, code lost:
    
        r3 = r19.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0317, code lost:
    
        if (r3.isAd() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0319, code lost:
    
        r1 = r3.getAwemeRawAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x031d, code lost:
    
        if (r1 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x031f, code lost:
    
        r1 = r1.getDislikeInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0323, code lost:
    
        if (r1 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0329, code lost:
    
        if (r1.getEnable() != 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x032b, code lost:
    
        X.C59050NFm.LIZIZ.LIZ(r20, r19.LJLIL, "video", new kotlin.jvm.internal.AqS160S0100000_10(r19, 443), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x033d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    @Override // X.InterfaceC62486Ofi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r20, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r21) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62686Oiw.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C62686Oiw(String str, Aweme aweme, String str2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
