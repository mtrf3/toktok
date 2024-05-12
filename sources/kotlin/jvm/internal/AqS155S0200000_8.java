package kotlin.jvm.internal;

import X.ASQ;
import X.AbstractC029409q;
import X.AbstractC48958JJi;
import X.AbstractC49114JPi;
import X.AbstractC49325JXl;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0A2;
import X.C16880lQ;
import X.C17N;
import X.C26045AKb;
import X.C27740Aue;
import X.C29822Bn8;
import X.C2JJ;
import X.C2P2;
import X.C2U8;
import X.C31610Cas;
import X.C43251GyF;
import X.C44938HkM;
import X.C46982IcE;
import X.C47651In1;
import X.C47653In3;
import X.C48639J7b;
import X.C48886JGo;
import X.C48887JGp;
import X.C48909JHl;
import X.C48918JHu;
import X.C48928JIe;
import X.C48929JIf;
import X.C48942JIs;
import X.C48948JIy;
import X.C48966JJq;
import X.C48X;
import X.C48Y;
import X.C49056JNc;
import X.C49058JNe;
import X.C49113JPh;
import X.C49121JPp;
import X.C49153JQv;
import X.C49218JTi;
import X.C49307JWt;
import X.C49444Jaq;
import X.C49445Jar;
import X.C49446Jas;
import X.C49447Jat;
import X.C49489JbZ;
import X.C49503Jbn;
import X.C49508Jbs;
import X.C49509Jbt;
import X.C49825Jgz;
import X.C49841JhF;
import X.C50042JkU;
import X.C50107JlX;
import X.C50652JuK;
import X.C50735Jvf;
import X.C50771JwF;
import X.C50799Jwh;
import X.C50925Jyj;
import X.C50948Jz6;
import X.C50962JzK;
import X.C56802Ku;
import X.C61899ORb;
import X.C61996OUu;
import X.C68322mC;
import X.C76800UCe;
import X.C78939UyV;
import X.C79045V0n;
import X.C7MY;
import X.C85855Xml;
import X.EnumC48916JHs;
import X.H7B;
import X.InterfaceC49057JNd;
import X.InterfaceC49148JQq;
import X.InterfaceC60761Nsz;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J7H;
import X.J7W;
import X.JGK;
import X.JHN;
import X.JHT;
import X.JIB;
import X.JJG;
import X.JK5;
import X.JKA;
import X.JKG;
import X.JLH;
import X.JLL;
import X.JLM;
import X.JON;
import X.JPH;
import X.JPJ;
import X.JPO;
import X.JPP;
import X.JPV;
import X.JQA;
import X.JQT;
import X.JSH;
import X.JSL;
import X.JSO;
import X.JSP;
import X.JT6;
import X.JTI;
import X.JTO;
import X.JTS;
import X.JWJ;
import X.JWY;
import X.JX8;
import X.JY2;
import X.JY9;
import X.JYC;
import X.KAK;
import X.KL2;
import X.KLC;
import X.KLD;
import X.KT8;
import X.OSZ;
import X.SYL;
import X.ViewOnAttachStateChangeListenerC49251JUp;
import X.W5F;
import X.W5U;
import X.X1D;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioDetailFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinTaskManager;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchTabViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.VisibilityComparisonPlayer;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS155S0200000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        W5F LJII = W5U.LJII(C78939UyV.LJ(((Aweme) this.l0).getVideo().getCover()));
        LJII.LJIILIIL(J7H.LIZ(302));
        LJII.LIZIZ("ReuseAudioDetailFragment");
        LJII.LJJIIJ = ((ReuseAudioDetailFragment) this.l1).LJLILLLLZI;
        C16880lQ.LLJJJ(LJII);
    }

    public static final Object invoke$0(AqS155S0200000_8 aqS155S0200000_8) {
        Context context = ((JTI) aqS155S0200000_8.l0).itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        JPJ jpj = (JPJ) aqS155S0200000_8.l1;
        JKA jka = new JKA(context, jpj, jpj, jpj.LJIIL().LIZ(), ((JPJ) aqS155S0200000_8.l1).LJIIL().LIZIZ(), ((JPJ) aqS155S0200000_8.l1).LJIIJJI(), (JGK) ((JPJ) aqS155S0200000_8.l1).LJLLL.getValue());
        ((JPJ) aqS155S0200000_8.l1).LJIIL().LJLJL = jka;
        return jka;
    }

    public static final Object invoke$1(AqS155S0200000_8 aqS155S0200000_8) {
        String charSequence;
        int i;
        Integer num;
        View view;
        int i2;
        LinearLayoutManager linearLayoutManager;
        CharSequence charSequence2 = (CharSequence) aqS155S0200000_8.l0;
        if (charSequence2 == null || (charSequence = charSequence2.toString()) == null) {
            return null;
        }
        int parseInt = CastIntegerProtector.parseInt(charSequence);
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) aqS155S0200000_8.l1;
        int i3 = parseInt - 1;
        SYL syl = searchTakoCardAssem.LLIIIZ;
        if (syl != null) {
            AbstractC029409q adapter = syl.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            OSZ<Integer, Integer> LIZ = C49508Jbs.LIZ(i3, i);
            SYL syl2 = searchTakoCardAssem.LLIIIZ;
            if (syl2 != null) {
                C0A2 layoutManager = syl2.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    num = Integer.valueOf(linearLayoutManager.LLIL());
                } else {
                    num = null;
                }
                SYL syl3 = searchTakoCardAssem.LLIIIZ;
                if (syl3 != null) {
                    C0A2 layoutManager2 = syl3.getLayoutManager();
                    if (layoutManager2 != null) {
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 0;
                        }
                        view = layoutManager2.LJJIJIL(i2);
                    } else {
                        view = null;
                    }
                    searchTakoCardAssem.LLIIL.LIZLLL = true;
                    C48X c48x = (C48X) searchTakoCardAssem.LLIILII.getValue();
                    if (c48x != null) {
                        View containerView = searchTakoCardAssem.getContainerView();
                        SYL syl4 = searchTakoCardAssem.LLIIIZ;
                        if (syl4 != null) {
                            c48x.LIZIZ(containerView, syl4, i3, view, num, LIZ, new C49509Jbt(searchTakoCardAssem, i3));
                        } else {
                            o.LJIJI("rvTakoVideo");
                            throw null;
                        }
                    }
                    C61996OUu c61996OUu = (C61996OUu) searchTakoCardAssem.LLIIJLIL.getValue();
                    if (c61996OUu == null) {
                        return null;
                    }
                    c61996OUu.LIZ(0);
                    return C76800UCe.LIZ;
                }
                o.LJIJI("rvTakoVideo");
                throw null;
            }
            o.LJIJI("rvTakoVideo");
            throw null;
        }
        o.LJIJI("rvTakoVideo");
        throw null;
    }

    public static final Object invoke$10(AqS155S0200000_8 aqS155S0200000_8) {
        RecyclerView recyclerView = ((JTI) aqS155S0200000_8.l0).LJLILLLLZI;
        SearchAwemeCardViewHolder searchAwemeCardViewHolder = (SearchAwemeCardViewHolder) aqS155S0200000_8.l1;
        C49153JQv c49153JQv = new C49153JQv(recyclerView, searchAwemeCardViewHolder, searchAwemeCardViewHolder);
        SearchAwemeCardViewHolder searchAwemeCardViewHolder2 = (SearchAwemeCardViewHolder) aqS155S0200000_8.l1;
        JTI jti = (JTI) aqS155S0200000_8.l0;
        JLM jlm = new JLM(jti.LJLILLLLZI);
        jlm.LJFF = C49121JPp.LIZ(jti.LJLILLLLZI);
        jlm.LJIIJJI(((ILynxSearchHorizontal.ActiveArea) searchAwemeCardViewHolder2.LJLJLLL.getValue()).getX(), ((ILynxSearchHorizontal.ActiveArea) searchAwemeCardViewHolder2.LJLJLLL.getValue()).getY(), ((ILynxSearchHorizontal.ActiveArea) searchAwemeCardViewHolder2.LJLJLLL.getValue()).getWidth(), ((ILynxSearchHorizontal.ActiveArea) searchAwemeCardViewHolder2.LJLJLLL.getValue()).getHeight());
        searchAwemeCardViewHolder2.LJLJJLL = jlm;
        c49153JQv.LJIIIIZZ = jlm;
        return c49153JQv;
    }

    public static final Object invoke$11(AqS155S0200000_8 aqS155S0200000_8) {
        Object obj;
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8((C49841JhF) aqS155S0200000_8.l1, 104);
        Iterator it = ((List) aqS155S0200000_8.l0).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Boolean) aqS174S0100000_8.invoke(obj)).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) obj;
        if (abstractC49325JXl == null) {
            return null;
        }
        return abstractC49325JXl.getAweme();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r3.length() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r3 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return new X.OSZ(r3, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AqS155S0200000_8 r4) {
        /*
            java.lang.Object r2 = r4.l0
            X.JhF r2 = (X.C49841JhF) r2
            java.lang.Object r1 = r4.l1
            X.Jgz r1 = (X.C49825Jgz) r1
            r0 = 0
            X.OSZ r0 = X.C49839JhD.LIZLLL(r2, r1, r0)
            java.lang.Object r3 = r0.getFirst()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.getSecond()
            r2 = 1
            if (r3 == 0) goto L21
            int r0 = r3.length()
            if (r0 != 0) goto L39
        L21:
            java.lang.Object r1 = r4.l0
            X.JhF r1 = (X.C49841JhF) r1
            java.lang.Object r0 = r4.l1
            X.Jgz r0 = (X.C49825Jgz) r0
            X.OSZ r0 = X.C49839JhD.LIZLLL(r1, r0, r2)
            java.lang.Object r3 = r0.getFirst()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.getSecond()
            if (r3 == 0) goto L3f
        L39:
            int r0 = r3.length()
            if (r0 != 0) goto L42
        L3f:
            java.lang.String r3 = "0"
            r1 = 0
        L42:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS155S0200000_8.invoke$12(kotlin.jvm.internal.AqS155S0200000_8):java.lang.Object");
    }

    public static final Object invoke$13(AqS155S0200000_8 aqS155S0200000_8) {
        int height = ((View) aqS155S0200000_8.l0).getHeight();
        int[] iArr = new int[2];
        ((View) aqS155S0200000_8.l0).getLocationOnScreen(iArr);
        int i = iArr[1];
        ((VisibilityComparisonPlayer) aqS155S0200000_8.l1).LJLJJLL = new C50042JkU(i, height + i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setupCenterPoint {");
        LIZ.append(((VisibilityComparisonPlayer) aqS155S0200000_8.l1).LJLJJLL.LJLIL);
        LIZ.append(", ");
        LIZ.append(((VisibilityComparisonPlayer) aqS155S0200000_8.l1).LJLJJLL.LJLILLLLZI);
        LIZ.append("} = ");
        LIZ.append(((VisibilityComparisonPlayer) aqS155S0200000_8.l1).LJLJJLL.LJLJI);
        return Integer.valueOf(Log.d("VisCompPlayer", X1D.LIZIZ(LIZ)));
    }

    public static final Object invoke$14(AqS155S0200000_8 aqS155S0200000_8) {
        ((InterfaceC88472Yns) aqS155S0200000_8.l0).invoke((SpannableStringBuilder) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS155S0200000_8 aqS155S0200000_8) {
        C47651In1 c47651In1 = (C47651In1) aqS155S0200000_8.l0;
        LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) aqS155S0200000_8.l1;
        c47651In1.getClass();
        if (C47651In1.LIZLLL(localVideoUrlModel)) {
            C47651In1 c47651In12 = (C47651In1) aqS155S0200000_8.l0;
            String sourceId = ((LocalVideoUrlModel) aqS155S0200000_8.l1).getSourceId();
            o.LJIIIIZZ(sourceId, "model.sourceId");
            c47651In12.LIZ(C47653In3.LJLIL, sourceId, ((LocalVideoUrlModel) aqS155S0200000_8.l1).localPath);
        } else {
            LocalVideoUrlModel localVideoUrlModel2 = (LocalVideoUrlModel) aqS155S0200000_8.l1;
            if (!TextUtils.isEmpty(localVideoUrlModel2.localPath) && !TextUtils.isEmpty(localVideoUrlModel2.getSourceId())) {
                LocalVideoUrlModel localVideoUrlModel3 = (LocalVideoUrlModel) aqS155S0200000_8.l1;
                C47651In1 c47651In13 = (C47651In1) aqS155S0200000_8.l0;
                File file = new File(localVideoUrlModel3.localPath);
                if (file.exists()) {
                    HashMap<String, LocalVideoUrlModel> hashMap = c47651In13.LIZ;
                    String sourceId2 = localVideoUrlModel3.getSourceId();
                    o.LJIIIIZZ(sourceId2, "model.sourceId");
                    hashMap.put(sourceId2, localVideoUrlModel3);
                    ((ArrayList) c47651In13.LIZLLL).add(localVideoUrlModel3);
                    c47651In13.LIZJ = file.length() + c47651In13.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LocalVideoCache=>add cache,fileSize:");
                    LIZ.append(file.length());
                    LIZ.append(",totalSize:");
                    LIZ.append(c47651In13.LIZJ);
                    LIZ.append(",filePath:");
                    LIZ.append(file.getPath());
                    H7B.LIZ(X1D.LIZIZ(LIZ));
                }
            }
            C47651In1 c47651In14 = (C47651In1) aqS155S0200000_8.l0;
            c47651In14.getClass();
            if (C47651In1.LIZJ() != 0 && !AVExternalServiceImpl.LIZ().publishService().enableCacheOptimize() && c47651In14.LIZJ > C47651In1.LIZJ()) {
                c47651In14.LJII(c47651In14.LIZJ - C47651In1.LIZJ());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS155S0200000_8 aqS155S0200000_8) {
        ((ArrayList) ((C47651In1) aqS155S0200000_8.l0).LIZLLL).remove((LocalVideoUrlModel) aqS155S0200000_8.l1);
        ((C47651In1) aqS155S0200000_8.l0).LIZ.remove(((LocalVideoUrlModel) aqS155S0200000_8.l1).getSourceId());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS155S0200000_8 aqS155S0200000_8) {
        ((DVideoPreloadManager) aqS155S0200000_8.l0).LIZLLL.cancelPreload((SimVideoUrlModel) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS155S0200000_8 aqS155S0200000_8) {
        if (((DVideoPreloadManager) aqS155S0200000_8.l0).LJFF.get(((SimVideoUrlModel) aqS155S0200000_8.l1).getUri()) != null) {
            ((DVideoPreloadManager) aqS155S0200000_8.l0).getClass();
            C46982IcE.LJI().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
        } else {
            ((DVideoPreloadManager) aqS155S0200000_8.l0).getClass();
            C46982IcE.LJI().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS155S0200000_8 aqS155S0200000_8) {
        ((DVideoPreloadManager) aqS155S0200000_8.l0).LIZLLL.updateDnsBackupIpMap((Map) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS155S0200000_8 aqS155S0200000_8) {
        ActivityC45651qj mo49getActivity = ((EcSearchMiddleAdapterFragment) aqS155S0200000_8.l0).mo49getActivity();
        if (mo49getActivity != null) {
            C85855Xml.LIZJ(mo49getActivity, C50652JuK.class, new AqS174S0100000_8((Word) aqS155S0200000_8.l1, 17));
        }
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL((EcSearchMiddleAdapterFragment) aqS155S0200000_8.l0);
        String word = ((Word) aqS155S0200000_8.l1).getWord();
        if (word == null) {
            word = "";
        }
        LJJJJJL.j4(new C50771JwF(word));
        C50948Jz6 LIZIZ = JTO.LIZIZ(((EcSearchMiddleAdapterFragment) aqS155S0200000_8.l0).mo49getActivity());
        if (LIZIZ != null) {
            LIZIZ.setSearchHint(((Word) aqS155S0200000_8.l1).getWord());
        }
        C50962JzK.LIZ(LIZIZ, (Word) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS155S0200000_8 aqS155S0200000_8) {
        int i = C48918JHu.LIZ[((EnumC48916JHs) aqS155S0200000_8.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                TuxIconView tuxIconView = ((JON) aqS155S0200000_8.l1).LJLIL;
                tuxIconView.setVisibility(0);
                tuxIconView.setScaleX(1.0f);
                tuxIconView.setScaleY(1.0f);
                tuxIconView.setAlpha(1.0f);
                tuxIconView.setTranslationX(0.0f);
                tuxIconView.setTranslationY(0.0f);
                ((JON) aqS155S0200000_8.l1).LJLILLLLZI.setVisibility(8);
            }
        } else {
            TuxIconView tuxIconView2 = ((JON) aqS155S0200000_8.l1).LJLILLLLZI;
            tuxIconView2.setVisibility(0);
            tuxIconView2.setScaleX(1.0f);
            tuxIconView2.setScaleY(1.0f);
            tuxIconView2.setAlpha(1.0f);
            tuxIconView2.setTranslationX(0.0f);
            tuxIconView2.setTranslationY(0.0f);
            ((JON) aqS155S0200000_8.l1).LJLIL.setVisibility(8);
        }
        ((JON) aqS155S0200000_8.l1).LJLJJL = (EnumC48916JHs) aqS155S0200000_8.l0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS155S0200000_8 aqS155S0200000_8) {
        C50107JlX c50107JlX;
        View view = (View) aqS155S0200000_8.l0;
        if (!(view instanceof C50107JlX) || (c50107JlX = (C50107JlX) view) == null) {
            return null;
        }
        JSH jsh = (JSH) aqS155S0200000_8.l1;
        JTS jts = new JTS(c50107JlX);
        jsh.getClass();
        jsh.LJLIL = jts;
        JTS jts2 = jsh.LJLIL;
        if (jts2 != null) {
            return new JSP(jts2);
        }
        o.LJIJI("bContext");
        throw null;
    }

    public static final Object invoke$22(AqS155S0200000_8 aqS155S0200000_8) {
        return new JHT((JHN) aqS155S0200000_8.l0, (Context) aqS155S0200000_8.l1);
    }

    public static final Object invoke$23(AqS155S0200000_8 aqS155S0200000_8) {
        ((InterfaceC88472Yns) aqS155S0200000_8.l0).invoke((SpannableStringBuilder) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$24(AqS155S0200000_8 aqS155S0200000_8) {
        ViewParent parent = ((View) ((InterfaceC60761Nsz) aqS155S0200000_8.l0)).getParent();
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            ((ViewGroup) parent2).removeAllViews();
        }
        ((EcDynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l1).Il().removeAllViews();
        ((EcDynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l1).Il().addView((View) parent, new ViewGroup.LayoutParams(-1, -1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS155S0200000_8 aqS155S0200000_8) {
        NextLiveData<C31610Cas> nextLiveData;
        if (!C49445Jar.LIZ()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZ().disableLiveTab) {
                Context context = GlobalContext.getContext();
                o.LJI(context);
                C49444Jaq c49444Jaq = new C49444Jaq();
                JQA jqa = (JQA) aqS155S0200000_8.l0;
                SearchMixFeed searchMixFeed = (SearchMixFeed) aqS155S0200000_8.l1;
                c49444Jaq.setSearchKeyword(jqa.LJ);
                c49444Jaq.setEnterFrom(jqa.LJFF);
                c49444Jaq.setSearchId("searchId");
                c49444Jaq.setSearchType("general");
                C49489JbZ c49489JbZ = C49489JbZ.LIZ;
                List<Aweme> list = searchMixFeed.collectionLive.lives;
                c49489JbZ.getClass();
                c49444Jaq.setRoomIdList(C49489JbZ.LIZLLL(list));
                c49444Jaq.setEnterMethod("swipe_more_general_list");
                c49444Jaq.setFromSearchSubtag("general_search");
                c49444Jaq.setPreSearchId(jqa.LJIIIIZZ);
                C49447Jat.LIZ(context, c49444Jaq, Z9N.LIZIZ.LJJLIIIJLJLI());
                return C76800UCe.LIZ;
            }
        }
        C49503Jbn.LJIIIZ = true;
        SearchTabViewModel searchTabViewModel = C49446Jas.LIZ;
        if (searchTabViewModel != null && (nextLiveData = searchTabViewModel.LJLIL) != null) {
            nextLiveData.setValue(new C31610Cas(KAK.LIVE.getTabName()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS155S0200000_8 aqS155S0200000_8) {
        return new C43251GyF((int) KL2.LIZJ(((View) aqS155S0200000_8.l0).getContext(), ((JKG) aqS155S0200000_8.l1).h0()));
    }

    public static final Object invoke$27(AqS155S0200000_8 aqS155S0200000_8) {
        return new C43251GyF((int) KL2.LIZJ(((View) aqS155S0200000_8.l0).getContext(), ((JKG) aqS155S0200000_8.l1).i0()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (X.C26338AVi.LIZJ(r0) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$28(kotlin.jvm.internal.AqS155S0200000_8 r3) {
        /*
            java.lang.Object r0 = r3.l0
            X.JPi r0 = (X.AbstractC49114JPi) r0
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L2d
            X.Vc8 r2 = new X.Vc8
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            if (r0 == 0) goto L34
            boolean r0 = X.C26338AVi.LIZJ(r0)
            r1 = 1
            if (r0 != r1) goto L34
        L19:
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            int r0 = X.C60996Nwm.LJIIIIZZ(r0)
            r2.<init>(r1, r0)
            java.lang.Object r0 = r3.l1
            X.JTI r0 = (X.JTI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.LJLILLLLZI
            r2.LIZIZ(r0)
        L2d:
            java.lang.Object r0 = r3.l1
            X.JTI r0 = (X.JTI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.LJLILLLLZI
            return r0
        L34:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS155S0200000_8.invoke$28(kotlin.jvm.internal.AqS155S0200000_8):java.lang.Object");
    }

    public static final Object invoke$29(AqS155S0200000_8 aqS155S0200000_8) {
        return new C49113JPh(((AbstractC49114JPi) aqS155S0200000_8.l0).LJIIJJI(), ((AbstractC49114JPi) aqS155S0200000_8.l0).LJIIIZ(), ((AbstractC49114JPi) aqS155S0200000_8.l0).LJLJJI, (JIB) aqS155S0200000_8.l1, true);
    }

    public static final Object invoke$3(AqS155S0200000_8 aqS155S0200000_8) {
        ActivityC45651qj mo49getActivity = ((EcDynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l0).mo49getActivity();
        if (mo49getActivity != null) {
            C85855Xml.LIZJ(mo49getActivity, C50652JuK.class, new AqS174S0100000_8((Word) aqS155S0200000_8.l1, 37));
        }
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL((EcDynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l0);
        String word = ((Word) aqS155S0200000_8.l1).getWord();
        if (word == null) {
            word = "";
        }
        LJJJJJL.j4(new C50771JwF(word));
        C50948Jz6 c50948Jz6 = JTO.LIZ(((EcDynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l0).mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            c50948Jz6.setSearchHint(((Word) aqS155S0200000_8.l1).getWord());
        }
        C50962JzK.LIZ(c50948Jz6, (Word) aqS155S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AqS155S0200000_8 aqS155S0200000_8) {
        ViewParent parent = ((View) ((InterfaceC60761Nsz) aqS155S0200000_8.l0)).getParent();
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            ((ViewGroup) parent2).removeAllViews();
        }
        ((DynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l1).Al().removeAllViews();
        ((DynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l1).Al().addView((View) parent, new ViewGroup.LayoutParams(-1, -1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS155S0200000_8 aqS155S0200000_8) {
        Context context = (Context) aqS155S0200000_8.l0;
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = (SearchFeedbackOptionalDetailFragment) aqS155S0200000_8.l1;
        if (searchFeedbackOptionalDetailFragment != null) {
            ASQ.LJ(searchFeedbackOptionalDetailFragment, KT8.LIZ);
        }
        String LIZ = C29822Bn8.LIZ(context, R.string.f49, "context.resources.getStr…it_popup_question_thanks)");
        Activity LIZ2 = C27740Aue.LIZ(context);
        if (LIZ2 != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZ2);
            c26045AKb.LJIIIZ(LIZ);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LIZLLL(3000L);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS155S0200000_8 aqS155S0200000_8) {
        ((JQT) aqS155S0200000_8.l0).LJLLI = ((View) aqS155S0200000_8.l1).getHeight();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS155S0200000_8 aqS155S0200000_8) {
        C48887JGp Q = ((AbstractC48958JJi) aqS155S0200000_8.l0).Q();
        ImageView N = ((AbstractC48958JJi) aqS155S0200000_8.l0).N();
        AbstractC48958JJi abstractC48958JJi = (AbstractC48958JJi) aqS155S0200000_8.l0;
        return new C48886JGo(Q, N, abstractC48958JJi.LJLIL, abstractC48958JJi.LJLILLLLZI, abstractC48958JJi.LJLJI, (View) aqS155S0200000_8.l1);
    }

    public static final Object invoke$34(AqS155S0200000_8 aqS155S0200000_8) {
        return new JPV((View) aqS155S0200000_8.l0, ((JPO) aqS155S0200000_8.l1).LJLJL);
    }

    public static final Object invoke$35(AqS155S0200000_8 aqS155S0200000_8) {
        Context context = ((JTI) aqS155S0200000_8.l0).itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        JPH jph = (JPH) aqS155S0200000_8.l1;
        JK5 jk5 = new JK5(context, jph, jph, jph.LJIIL().LIZ(), ((JPH) aqS155S0200000_8.l1).LJIIL().LIZIZ(), ((JPH) aqS155S0200000_8.l1).LJIIJJI(), (JGK) ((JPH) aqS155S0200000_8.l1).LJLLILLLL.getValue());
        ((JPH) aqS155S0200000_8.l1).LJIIL().LJLJL = jk5;
        return jk5;
    }

    public static final Object invoke$36(AqS155S0200000_8 aqS155S0200000_8) {
        JSL LJFF;
        Taco LIZ = C49218JTi.LIZ((View) aqS155S0200000_8.l0, false);
        if (LIZ != null && (LJFF = LIZ.LJFF(22)) != null) {
            JLH.LIZ(LJFF, ((JPP) aqS155S0200000_8.l1).T().LJIIJJI(), new JLL(((JPP) aqS155S0200000_8.l1).T().LJIIJJI()), false, 12);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$37(AqS155S0200000_8 aqS155S0200000_8) {
        aqS155S0200000_8.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS155S0200000_8 aqS155S0200000_8) {
        boolean z = false;
        Taco LIZ = C49218JTi.LIZ((View) aqS155S0200000_8.l0, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get auto player ");
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        if (LIZ != null) {
            JSL value = LIZ.LJFF(((JSO) aqS155S0200000_8.l1).q());
            if (value == null) {
                value = ((JSO) aqS155S0200000_8.l1).h();
                int q = ((JSO) aqS155S0200000_8.l1).q();
                o.LJIIIZ(value, "value");
                value.LIZLLL(LIZ.LJ());
                ((SparseArray) LIZ.LJLJL.getValue()).put(q, value);
                z = true;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ready the nest card agent ");
            LIZ3.append(value);
            LIZ3.append(" and is new create ");
            LIZ3.append(z);
            X1D.LIZIZ(LIZ3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS155S0200000_8 aqS155S0200000_8) {
        Aweme aweme;
        ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp = (ViewOnAttachStateChangeListenerC49251JUp) aqS155S0200000_8.l0;
        C44938HkM.LJ = viewOnAttachStateChangeListenerC49251JUp.LLILZLL;
        TopVideoHolderVM Q = viewOnAttachStateChangeListenerC49251JUp.Q();
        View itemView = ((ViewOnAttachStateChangeListenerC49251JUp) aqS155S0200000_8.l0).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ActivityC45651qj LIZ = C48966JJq.LIZ(itemView);
        JIB jib = ((ViewOnAttachStateChangeListenerC49251JUp) aqS155S0200000_8.l0).LLIILII;
        if (jib != null) {
            Fragment LIZ2 = jib.LIZ();
            JQA mobParam = (JQA) aqS155S0200000_8.l1;
            Q.getClass();
            o.LJIIIZ(mobParam, "mobParam");
            if (LIZ != null && LIZ2 != null && (aweme = Q.LJLZ) != null) {
                JWJ jwj = new JWJ(aweme, mobParam, LIZ, Q);
                Bundle bundle = new Bundle();
                bundle.putString("event_type", mobParam.LJFF);
                C2JJ c2jj = new C2JJ();
                String str = mobParam.LJII;
                C56802Ku c56802Ku = c2jj.LIZ;
                c56802Ku.LIZJ = str;
                c56802Ku.LIZ(bundle);
                Integer LJI = C79045V0n.LJI(R.attr.ee, LIZ);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    SearchGlobalViewModel searchGlobalViewModel = Q.LJLLLLLL;
                    if (searchGlobalViewModel != null) {
                        searchGlobalViewModel.LJLJI.postValue(Integer.valueOf(intValue));
                    } else {
                        o.LJIJI("searchGlobalVM");
                        throw null;
                    }
                }
                Object value = Q.LJLLLL.getValue();
                o.LJIIIIZZ(value, "<get-shareService>(...)");
                ((ShareService) value).LIZ(LIZ, LIZ2, aweme, false, jwj, bundle);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("containerProvider");
        throw null;
    }

    public static final Object invoke$4(AqS155S0200000_8 aqS155S0200000_8) {
        C49058JNe c49058JNe = InterfaceC49057JNd.LIZ;
        AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8((SearchCardViewHolder) aqS155S0200000_8.l0, (View) aqS155S0200000_8.l1, 8);
        c49058JNe.getClass();
        C61899ORb c61899ORb = new C61899ORb();
        aqS139S0200000_8.invoke(c61899ORb);
        c61899ORb.build();
        return new C49056JNc(c61899ORb);
    }

    public static final Object invoke$40(AqS155S0200000_8 aqS155S0200000_8) {
        TTVideoEngine tTVideoEngine = new TTVideoEngine((Context) aqS155S0200000_8.l1, 0);
        tTVideoEngine.LLFII(false);
        tTVideoEngine.LLJIJIL("TTAudioEngineImpl");
        tTVideoEngine.LJLLLL(160, 1);
        tTVideoEngine.LJLLLL(402, 1);
        tTVideoEngine.LJLLLL(27, 1);
        tTVideoEngine.LJLLLL(416, 0);
        tTVideoEngine.LJLLLL(314, 1);
        tTVideoEngine.LJLLLL(28, 6);
        tTVideoEngine.LJLLLL(18, 1);
        tTVideoEngine.LJLLLL(415, 1);
        tTVideoEngine.LJLLLL(0, ((J7W) aqS155S0200000_8.l0).LIZ);
        tTVideoEngine.LJLI();
        J7W j7w = (J7W) aqS155S0200000_8.l0;
        tTVideoEngine.LJZI(new C48639J7b(j7w, j7w.LJII));
        ((J7W) aqS155S0200000_8.l0).LIZJ = true;
        return tTVideoEngine;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$41(AqS155S0200000_8 aqS155S0200000_8) {
        ((KLC) ((C68322mC) aqS155S0200000_8.l0).element).LJLJJI = true;
        ((KLD) aqS155S0200000_8.l1).LLD = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS155S0200000_8 aqS155S0200000_8) {
        if (((InterfaceC49148JQq) aqS155S0200000_8.l0).LLIIII()) {
            JWY jwy = (JWY) aqS155S0200000_8.l1;
            InterfaceC49148JQq playData = (InterfaceC49148JQq) aqS155S0200000_8.l0;
            jwy.getClass();
            o.LJIIIZ(playData, "playData");
            jwy.LJLJJL.LIZJ(playData);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$43(AqS155S0200000_8 aqS155S0200000_8) {
        JY9 jy9 = (JY9) aqS155S0200000_8.l0;
        jy9.LIZ(jy9.LJLILLLLZI.LIZ, 0, (JYC) ((C68322mC) aqS155S0200000_8.l1).element);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS155S0200000_8 aqS155S0200000_8) {
        AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8((C48942JIs) aqS155S0200000_8.l0, (C48948JIy) aqS155S0200000_8.l1, 43);
        C48909JHl c48909JHl = new C48909JHl();
        aqS139S0200000_8.invoke(c48909JHl);
        return c48909JHl;
    }

    public static final Object invoke$45(AqS155S0200000_8 aqS155S0200000_8) {
        C2U8.LIZ(new C2P2(((JX8) aqS155S0200000_8.l0).LJLJJI));
        ((Bundle) aqS155S0200000_8.l1).putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
        ((Bundle) aqS155S0200000_8.l1).putString("video_from", "from_search_mix");
        SmartRoute buildRoute = SmartRouter.buildRoute(((JX8) aqS155S0200000_8.l0).LJLIL.LIZ.getContext(), "//aweme/detail");
        buildRoute.withParam((Bundle) aqS155S0200000_8.l1);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS155S0200000_8 aqS155S0200000_8) {
        return new JT6(new C49307JWt((JTS) aqS155S0200000_8.l0, (JX8) aqS155S0200000_8.l1));
    }

    public static final Object invoke$47(AqS155S0200000_8 aqS155S0200000_8) {
        DVideoPreloadManager dVideoPreloadManager = (DVideoPreloadManager) aqS155S0200000_8.l0;
        if (!dVideoPreloadManager.LJ) {
            boolean checkInit = dVideoPreloadManager.LIZLLL.checkInit();
            dVideoPreloadManager.LJ = checkInit;
            if (checkInit) {
                dVideoPreloadManager.LJI.countDown();
            }
        }
        ((InterfaceC65784Pro) aqS155S0200000_8.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS155S0200000_8 aqS155S0200000_8) {
        return new C48928JIe((C48929JIf) aqS155S0200000_8.l0, (Context) aqS155S0200000_8.l1);
    }

    public static final Object invoke$5(AqS155S0200000_8 aqS155S0200000_8) {
        SmartImageView smartImageView = new SmartImageView((Context) aqS155S0200000_8.l0);
        String iconViewUrl = ((C50925Jyj) aqS155S0200000_8.l1).getIconViewUrl();
        if (iconViewUrl != null) {
            smartImageView.setImageURI(iconViewUrl);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(20), C7MY.LIZIZ(20));
        layoutParams.gravity = 8388627;
        smartImageView.setLayoutParams(layoutParams);
        return smartImageView;
    }

    public static final Object invoke$6(AqS155S0200000_8 aqS155S0200000_8) {
        return new C50735Jvf((SearchCoinTaskManager) aqS155S0200000_8.l0, (ActivityC45651qj) aqS155S0200000_8.l1);
    }

    public static final Object invoke$7(AqS155S0200000_8 aqS155S0200000_8) {
        C50799Jwh c50799Jwh = ((DynamicSingleIntermediateFragmentNew) aqS155S0200000_8.l0).LLFFF;
        if (c50799Jwh != null) {
            c50799Jwh.LJFF((TemplateData) aqS155S0200000_8.l1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public static final Object invoke$8(AqS155S0200000_8 aqS155S0200000_8) {
        String charSequence;
        int i;
        Integer num;
        View view;
        int i2;
        LinearLayoutManager linearLayoutManager;
        CharSequence charSequence2 = (CharSequence) aqS155S0200000_8.l0;
        if (charSequence2 == null || (charSequence = charSequence2.toString()) == null) {
            return null;
        }
        int parseInt = CastIntegerProtector.parseInt(charSequence);
        SearchBotHolder searchBotHolder = (SearchBotHolder) aqS155S0200000_8.l1;
        int i3 = parseInt - 1;
        AbstractC029409q adapter = searchBotHolder.LJLLLLLL.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        OSZ LIZ = C49508Jbs.LIZ(i3, i);
        C0A2 layoutManager = searchBotHolder.LJLLLLLL.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            num = Integer.valueOf(linearLayoutManager.LLIL());
        } else {
            num = null;
        }
        C0A2 layoutManager2 = searchBotHolder.LJLLLLLL.getLayoutManager();
        if (layoutManager2 != null) {
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            view = layoutManager2.LJJIJIL(i2);
        } else {
            view = null;
        }
        C48X c48x = (C48X) searchBotHolder.LLFF.getValue();
        if (c48x != null) {
            C48Y.LIZ(c48x, searchBotHolder.itemView, searchBotHolder.LJLLLLLL, i3, view, num, LIZ);
        }
        C61996OUu c61996OUu = (C61996OUu) searchBotHolder.LLF.getValue();
        if (c61996OUu == null) {
            return null;
        }
        c61996OUu.LIZ(0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS155S0200000_8 aqS155S0200000_8) {
        Context context = ((JTI) aqS155S0200000_8.l0).itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        SearchAwemeCardViewHolder searchAwemeCardViewHolder = (SearchAwemeCardViewHolder) aqS155S0200000_8.l1;
        View view = ((JTI) aqS155S0200000_8.l0).itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        return new JJG(context, searchAwemeCardViewHolder, JY2.LIZ(view), ((JTI) aqS155S0200000_8.l0).LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS155S0200000_8(C68322mC c68322mC, C68322mC<KLC> c68322mC2, KLD kld) {
        super(0);
        this.$t = kld;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(C47651In1 c47651In1, LocalVideoUrlModel localVideoUrlModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c47651In1;
        this.l1 = localVideoUrlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(J7W j7w, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = j7w;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JHN jhn, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = jhn;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(EnumC48916JHs enumC48916JHs, JON jon, int i) {
        super(0);
        this.$t = i;
        this.l0 = enumC48916JHs;
        this.l1 = jon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(C48929JIf c48929JIf, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c48929JIf;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(C48942JIs c48942JIs, C48948JIy c48948JIy, int i) {
        super(0);
        this.$t = i;
        this.l0 = c48942JIs;
        this.l1 = c48948JIy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(AbstractC48958JJi abstractC48958JJi, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC48958JJi;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(AbstractC49114JPi abstractC49114JPi, JIB jib, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC49114JPi;
        this.l1 = jib;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(AbstractC49114JPi abstractC49114JPi, JTI jti, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC49114JPi;
        this.l1 = jti;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JQA jqa, SearchMixFeed searchMixFeed, int i) {
        super(0);
        this.$t = i;
        this.l0 = jqa;
        this.l1 = searchMixFeed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JQT jqt, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = jqt;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(InterfaceC49148JQq interfaceC49148JQq, JWY jwy, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC49148JQq;
        this.l1 = jwy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JTI jti, JPH jph, int i) {
        super(0);
        this.$t = i;
        this.l0 = jti;
        this.l1 = jph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JTI jti, JPJ jpj, int i) {
        super(0);
        this.$t = i;
        this.l0 = jti;
        this.l1 = jpj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JTI jti, SearchAwemeCardForUser searchAwemeCardForUser, int i) {
        super(0);
        this.$t = i;
        this.l0 = jti;
        this.l1 = searchAwemeCardForUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JTS jts, JX8 jx8, int i) {
        super(0);
        this.$t = i;
        this.l0 = jts;
        this.l1 = jx8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp, JQA jqa, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC49251JUp;
        this.l1 = jqa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(JX8 jx8, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = jx8;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS155S0200000_8(JY9 jy9, JY9 jy92, C68322mC<JYC> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = jy9;
        this.l1 = jy92;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(C49841JhF c49841JhF, C49825Jgz c49825Jgz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c49841JhF;
        this.l1 = c49825Jgz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(C50107JlX c50107JlX, JSH jsh, int i) {
        super(0);
        this.$t = i;
        this.l0 = c50107JlX;
        this.l1 = jsh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(InterfaceC60761Nsz interfaceC60761Nsz, EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC60761Nsz;
        this.l1 = ecDynamicSingleIntermediateFragmentNew;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(InterfaceC60761Nsz interfaceC60761Nsz, DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC60761Nsz;
        this.l1 = dynamicSingleIntermediateFragmentNew;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(Context context, C50925Jyj c50925Jyj, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c50925Jyj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(Context context, SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = searchFeedbackOptionalDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(View view, JKG jkg, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = jkg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(View view, JPO jpo, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = jpo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(View view, JPP jpp, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = jpp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(View view, JSO jso, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = jso;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(View view, VisibilityComparisonPlayer visibilityComparisonPlayer, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = visibilityComparisonPlayer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(EcSearchMiddleAdapterFragment ecSearchMiddleAdapterFragment, Word word, int i) {
        super(0);
        this.$t = i;
        this.l0 = ecSearchMiddleAdapterFragment;
        this.l1 = word;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew, Word word, int i) {
        super(0);
        this.$t = i;
        this.l0 = ecDynamicSingleIntermediateFragmentNew;
        this.l1 = word;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(Aweme aweme, ReuseAudioDetailFragment reuseAudioDetailFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = reuseAudioDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(SearchCardViewHolder searchCardViewHolder, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchCardViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(SearchCoinTaskManager searchCoinTaskManager, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchCoinTaskManager;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, TemplateData templateData, int i) {
        super(0);
        this.$t = i;
        this.l0 = dynamicSingleIntermediateFragmentNew;
        this.l1 = templateData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS155S0200000_8(DVideoPreloadManager dVideoPreloadManager, DVideoPreloadManager dVideoPreloadManager2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = dVideoPreloadManager;
        this.l1 = dVideoPreloadManager2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(DVideoPreloadManager dVideoPreloadManager, SimVideoUrlModel simVideoUrlModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = dVideoPreloadManager;
        this.l1 = simVideoUrlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS155S0200000_8(DVideoPreloadManager dVideoPreloadManager, DVideoPreloadManager dVideoPreloadManager2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = dVideoPreloadManager;
        this.l1 = dVideoPreloadManager2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(CharSequence charSequence, SearchBotHolder searchBotHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = charSequence;
        this.l1 = searchBotHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(CharSequence charSequence, SearchTakoCardAssem searchTakoCardAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = charSequence;
        this.l1 = searchTakoCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS155S0200000_8(List list, List<? extends SearchMixFeed> list2, C49841JhF c49841JhF) {
        super(0);
        this.$t = c49841JhF;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS155S0200000_8(AqS57S0201000_8 aqS57S0201000_8, SpannableStringBuilder spannableStringBuilder, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS57S0201000_8;
        this.l1 = spannableStringBuilder;
    }
}
