package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C110614Vt;
import X.C17N;
import X.C26338AVi;
import X.C32151Nz;
import X.C32I;
import X.C43I;
import X.C48819JDz;
import X.C49543JcR;
import X.C50948Jz6;
import X.C51360KDs;
import X.C51361KDt;
import X.C51364KDw;
import X.C72912tb;
import X.C74053T4n;
import X.C76800UCe;
import X.C78685UuP;
import X.C78927UyJ;
import X.C79045V0n;
import X.C8ZV;
import X.C8ZW;
import X.InterfaceC213398Zb;
import X.InterfaceC222788ok;
import X.InterfaceC88473Ynt;
import X.JE0;
import X.JE9;
import X.JJG;
import X.K96;
import X.KAK;
import X.KED;
import X.KEG;
import X.KEH;
import X.KOV;
import X.O6R;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.LynxVideoManagerLite;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.xelements.UISingleVideo;
import com.ss.android.ugc.aweme.ecommerce.search.result.EcSearchResultContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel.VerticalPagerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class IDqS433S0100000_8 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(JE9 je9, int i) {
        super(3);
        this.$t = i;
        this.l0 = je9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(JJG jjg, int i) {
        super(3);
        this.$t = i;
        this.l0 = jjg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(LynxVideoManager lynxVideoManager, int i) {
        super(3);
        this.$t = i;
        this.l0 = lynxVideoManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(LynxVideoManagerLite lynxVideoManagerLite, int i) {
        super(3);
        this.$t = i;
        this.l0 = lynxVideoManagerLite;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(UISingleVideo uISingleVideo, int i) {
        super(3);
        this.$t = i;
        this.l0 = uISingleVideo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(EcSearchResultContainerAssem ecSearchResultContainerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = ecSearchResultContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(SearchBotHolder searchBotHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = searchBotHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(TakoPollingVM takoPollingVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoPollingVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS433S0100000_8(PhotoSearchResultFragment photoSearchResultFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = photoSearchResultFragment;
    }

    public static final Object invoke$0(IDqS433S0100000_8 iDqS433S0100000_8, Object selectSubscribe, Object resp, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(resp, "resp");
        if (o.LJ(obj, Boolean.TRUE)) {
            C17N.LJJLIIIJJI(((SearchBotHolder) iDqS433S0100000_8.l0).LJLJLJ);
            if (resp instanceof C72912tb) {
                if (C78685UuP.LJJJZ(C49543JcR.LIZJ())) {
                    C17N.LJJLIIIJJI(((SearchBotHolder) iDqS433S0100000_8.l0).LJLJLLL);
                }
            } else {
                C17N.LJJIIJZLJL(((SearchBotHolder) iDqS433S0100000_8.l0).LJLJLLL);
            }
        } else {
            C17N.LJJIIJZLJL(((SearchBotHolder) iDqS433S0100000_8.l0).LJLJLLL);
            C17N.LJJIIJZLJL(((SearchBotHolder) iDqS433S0100000_8.l0).LJLJLJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS433S0100000_8 iDqS433S0100000_8, Object selectSubscribe, Object obj, Object obj2) {
        Boolean bool;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PollingInfo pollingInfo = (PollingInfo) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clientTrigger : ");
        LIZ.append(booleanValue);
        LIZ.append(" , pollingInfo enable = ");
        if (pollingInfo != null) {
            bool = pollingInfo.getEnable();
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        TakoPollingVM takoPollingVM = (TakoPollingVM) iDqS433S0100000_8.l0;
        takoPollingVM.getClass();
        takoPollingVM.withState(new AqS174S0100000_8(takoPollingVM, 214));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        JJG jjg = (JJG) iDqS433S0100000_8.l0;
        jjg.LJLIL.LIZJ(intValue, view, aweme, jjg.LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        List<? extends Aweme> list = ((JJG) iDqS433S0100000_8.l0).LJLJJI;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            if (!aweme2.isLive()) {
                arrayList.add(aweme2);
            }
        }
        ((JJG) iDqS433S0100000_8.l0).LJLIL.LIZJ(intValue, view, aweme, arrayList);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r2 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.IDqS433S0100000_8 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            android.view.View r8 = (android.view.View) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.floatValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r6 = r10.floatValue()
            java.lang.String r0 = "target"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment r0 = (com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment) r0
            com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel r0 = r0.LJLJL
            r2 = 0
            if (r0 == 0) goto L21
            int r0 = r0.LJLJI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L21:
            r5 = 0
            r4 = 1
            if (r2 != 0) goto L76
        L25:
            r2 = 0
        L26:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment r0 = (com.ss.android.ugc.aweme.vision.result.PhotoSearchResultFragment) r0
            X.Ve1 r1 = r0.LJLIL
            boolean r0 = r1 instanceof X.VWV
            if (r0 == 0) goto L74
            X.VWV r1 = (X.VWV) r1
            if (r1 == 0) goto L74
            boolean r0 = r1.LJII()
            if (r0 != 0) goto L74
            r0 = 1
        L3b:
            r3 = r0 ^ 1
            boolean r0 = r8 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L6b
            if (r2 == 0) goto L62
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L69
            r0 = -1
            boolean r0 = r8.canScrollVertically(r0)
            if (r0 == 0) goto L69
            r1 = 1
        L50:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            boolean r0 = r8.canScrollVertically(r4)
            if (r0 == 0) goto L67
            r0 = 1
        L5b:
            if (r1 != 0) goto L61
            if (r0 != 0) goto L61
            if (r3 != 0) goto L62
        L61:
            r5 = 1
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L67:
            r0 = 0
            goto L5b
        L69:
            r1 = 0
            goto L50
        L6b:
            boolean r0 = r8 instanceof X.C80217Ve1
            if (r0 == 0) goto L62
            if (r3 != 0) goto L62
            if (r2 == 0) goto L62
            goto L61
        L74:
            r0 = 0
            goto L3b
        L76:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 == r0) goto L84
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L25
        L84:
            r2 = 1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS433S0100000_8.invoke$12(kotlin.jvm.internal.IDqS433S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r6.equals("onPlayFailed") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        r1 = "error";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r6.equals("onError") != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.IDqS433S0100000_8 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIJ(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.lang.String r0 = "<anonymous parameter 2>"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r6.hashCode()
            switch(r0) {
                case -2068899678: goto Ld3;
                case -1581427716: goto Lc7;
                case -1433717972: goto Lbb;
                case -1349867671: goto Laf;
                case -1340212393: goto La3;
                case -1138330660: goto L98;
                case -1013054029: goto L8d;
                case 30726275: goto L82;
                case 238891984: goto L79;
                case 569577765: goto L6e;
                case 1492186070: goto L63;
                default: goto L1f;
            }
        L1f:
            java.lang.String r1 = ""
        L21:
            r7 = r2
        L22:
            java.lang.Object r0 = r5.l0
            com.bytedance.ies.xelement.LynxVideoManager r0 = (com.bytedance.ies.xelement.LynxVideoManager) r0
            X.VNU r0 = r0.mContext
            if (r0 == 0) goto Le2
            X.VNL r4 = r0.LJLJJL
            if (r4 == 0) goto Le2
            int r0 = r1.length()
            if (r0 <= 0) goto Le2
            X.Jdb r3 = new X.Jdb
            java.lang.Object r0 = r5.l0
            com.bytedance.ies.xelement.LynxVideoManager r0 = (com.bytedance.ies.xelement.LynxVideoManager) r0
            int r0 = r0.getSign()
            r3.<init>(r0, r1)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L49:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ldf
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r3.LIZJ(r0, r1)
            goto L49
        L63:
            java.lang.String r0 = "onSeeked"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "seek"
            goto L22
        L6e:
            java.lang.String r0 = "onDeviceChange"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "devicechange"
            goto L22
        L79:
            java.lang.String r0 = "onPlayFailed"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            goto Lb7
        L82:
            java.lang.String r0 = "onBuffering"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "bufferingchange"
            goto L22
        L8d:
            java.lang.String r0 = "onPlay"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "play"
            goto L21
        L98:
            java.lang.String r0 = "onFirstFrame"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "firstframe"
            goto L22
        La3:
            java.lang.String r0 = "onPause"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "pause"
            goto L21
        Laf:
            java.lang.String r0 = "onError"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
        Lb7:
            java.lang.String r1 = "error"
            goto L21
        Lbb:
            java.lang.String r0 = "onCompleted"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "ended"
            goto L22
        Lc7:
            java.lang.String r0 = "onProgressChange"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "timeupdate"
            goto L22
        Ld3:
            java.lang.String r0 = "onZoomChange"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r1 = "fullscreenchange"
            goto L22
        Ldf:
            r4.LIZIZ(r3)
        Le2:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS433S0100000_8.invoke$2(kotlin.jvm.internal.IDqS433S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r6.equals("onPlayFailed") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        r1 = "error";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        if (r6.equals("onError") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.IDqS433S0100000_8 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS433S0100000_8.invoke$3(kotlin.jvm.internal.IDqS433S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r4.equals("onPlayFailed") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r4.equals("onError") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.IDqS433S0100000_8 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS433S0100000_8.invoke$4(kotlin.jvm.internal.IDqS433S0100000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(IDqS433S0100000_8 iDqS433S0100000_8, Object selectSubscribe, Object obj, Object obj2) {
        int i;
        C74053T4n c74053T4n;
        ECSearchEntranceData ecSearchEntranceData;
        View _$_findCachedViewById;
        Integer LJI;
        List<KAK> list = (List) obj;
        C43I currentTab = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(currentTab, "currentTab");
        EcSearchResultContainerAssem ecSearchResultContainerAssem = (EcSearchResultContainerAssem) iDqS433S0100000_8.l0;
        if (!ecSearchResultContainerAssem.LJLLJ) {
            Integer num = (Integer) currentTab.LIZ;
            SearchResultParam searchResultParam = ecSearchResultContainerAssem.LJLL;
            KAK kak = null;
            if (searchResultParam != null) {
                Context context = ecSearchResultContainerAssem.getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
                    int intValue = LJI.intValue();
                    View _$_findCachedViewById2 = ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09);
                    if (_$_findCachedViewById2 != null) {
                        _$_findCachedViewById2.setBackgroundColor(intValue);
                    }
                }
                InterfaceC213398Zb fragmentItemOperator = ((KOV) ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09)).getFragmentItemOperator();
                C8ZV c8zv = new C8ZV();
                C8ZW c8zw = C8ZW.FRAGMENTS_NO_DESTROY;
                o.LJIIIZ(c8zw, "<set-?>");
                c8zv.LJFF = c8zw;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                c8zv.LJ = i;
                fragmentItemOperator.LIZIZ(c8zv);
                ((KOV) ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09)).setSmoothScrollEnabled(false);
                C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
                ecSearchResultContainerAssem.LJLLI = new C51360KDs(searchEnterParam);
                if (searchEnterParam != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
                    if (C78685UuP.LJJJZ(ecSearchEntranceData.getResultBgUrl()) && (_$_findCachedViewById = ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09)) != null) {
                        _$_findCachedViewById.setBackgroundColor(0);
                    }
                    if (C78685UuP.LJJJZ(ecSearchEntranceData.getSingleTabType())) {
                        View _$_findCachedViewById3 = ecSearchResultContainerAssem._$_findCachedViewById(R.id.gko);
                        if (_$_findCachedViewById3 != null) {
                            _$_findCachedViewById3.setVisibility(8);
                        }
                        View _$_findCachedViewById4 = ecSearchResultContainerAssem._$_findCachedViewById(R.id.jgt);
                        if (_$_findCachedViewById4 != null) {
                            _$_findCachedViewById4.setVisibility(8);
                        }
                    }
                }
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LJI = 0;
                Context context2 = ecSearchResultContainerAssem.getContext();
                if (context2 != null && (c74053T4n = (C74053T4n) ecSearchResultContainerAssem._$_findCachedViewById(R.id.h0f)) != null) {
                    c74053T4n.setTabSelectedIndicator(c110614Vt.LIZ(context2));
                }
                View _$_findCachedViewById5 = ecSearchResultContainerAssem._$_findCachedViewById(R.id.h0f);
                if (_$_findCachedViewById5 != null) {
                    _$_findCachedViewById5.setBackgroundColor(0);
                }
                C74053T4n new_tab_layout = (C74053T4n) ecSearchResultContainerAssem._$_findCachedViewById(R.id.h0f);
                o.LJIIIIZZ(new_tab_layout, "new_tab_layout");
                KOV power_viewpager = (KOV) ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09);
                o.LJIIIIZZ(power_viewpager, "power_viewpager");
                KEH keh = new KEH(new_tab_layout, power_viewpager, new C51364KDw(ecSearchResultContainerAssem));
                if (!keh.LJ) {
                    InterfaceC222788ok currentOperator = power_viewpager.getCurrentOperator();
                    keh.LIZLLL = currentOperator;
                    if (currentOperator != null) {
                        keh.LJ = true;
                        power_viewpager.LJLJJL.LIZIZ(new K96(new_tab_layout));
                        new_tab_layout.LIZ(new KED(power_viewpager));
                        KEG keg = new KEG(keh);
                        InterfaceC222788ok interfaceC222788ok = keh.LIZLLL;
                        if (interfaceC222788ok != null) {
                            interfaceC222788ok.LIZJ(keg);
                        }
                        keh.LIZJ();
                        new_tab_layout.LJIILIIL(power_viewpager.getCurrentItem(), 0.0f, true, true);
                        ecSearchResultContainerAssem._$_findCachedViewById(R.id.h0f).setHorizontalFadingEdgeEnabled(false);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                            for (KAK kak2 : list) {
                                arrayList.add(new VerticalPagerData(kak2, list.indexOf(kak2)));
                            }
                            ((KOV) ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09)).getFragmentItemOperator().getState().LJIILLIIL(arrayList);
                        }
                        ((KOV) ecSearchResultContainerAssem._$_findCachedViewById(R.id.i09)).LJLJJL.LIZIZ(new C51361KDt(ecSearchResultContainerAssem, searchResultParam));
                        ecSearchResultContainerAssem.LJLLJ = true;
                    } else {
                        "TabLayoutMediator attached before PowerViewPager has an operator".toString();
                        throw new IllegalStateException("TabLayoutMediator attached before PowerViewPager has an operator");
                    }
                } else {
                    "TabLayoutMediator is already attached".toString();
                    throw new IllegalStateException("TabLayoutMediator is already attached");
                }
            }
            SearchResultParam searchResultParam2 = ((EcSearchResultContainerAssem) iDqS433S0100000_8.l0).LJLL;
            if (searchResultParam2 != null) {
                if (list != null) {
                    kak = (KAK) ListProtector.get(list, ((Number) currentTab.LIZ).intValue());
                }
                searchResultParam2.setEcomTargetTab(kak);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object start, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        JE0 end = (JE0) obj2;
        o.LJIIIZ(start, "start");
        o.LJIIIZ(end, "end");
        int i = C48819JDz.LIZ[end.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (floatValue == 1.0f && start == end) {
                    TuxTextView tuxTextView = ((JE9) iDqS433S0100000_8.l0).LJLJLJ;
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(92);
                    } else {
                        o.LJIJI("commonStatusViewPrompt");
                        throw null;
                    }
                } else {
                    TuxIconView tuxIconView = ((JE9) iDqS433S0100000_8.l0).LJLJL;
                    if (tuxIconView != null) {
                        int LJJIIZ = O6R.LJJIIZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)) - ((C32151Nz.LJIIZILJ(52) - C32151Nz.LJIIZILJ(32)) * floatValue));
                        C78927UyJ.LJFF(tuxIconView, Integer.valueOf(LJJIIZ), Integer.valueOf(LJJIIZ));
                        C26338AVi.LJI(tuxIconView, null, null, null, Integer.valueOf(O6R.LJJIIZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) - ((C32151Nz.LJIIZILJ(8) - C32151Nz.LJIIZILJ(5)) * floatValue))), false, 23);
                        TuxTextView tuxTextView2 = ((JE9) iDqS433S0100000_8.l0).LJLJLJ;
                        if (tuxTextView2 != null) {
                            float f = 16 - (6 * floatValue);
                            tuxTextView2.setTextSize(f);
                            int LJJIIZ2 = O6R.LJJIIZ(f);
                            C26338AVi.LJIIIZ(tuxTextView2, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
                        } else {
                            o.LJIJI("commonStatusViewPrompt");
                            throw null;
                        }
                    } else {
                        o.LJIJI("commonStatusViewIcon");
                        throw null;
                    }
                }
            }
        } else if (floatValue == 1.0f && start == end) {
            TuxTextView tuxTextView3 = ((JE9) iDqS433S0100000_8.l0).LJLJLJ;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(103);
            } else {
                o.LJIJI("commonStatusViewPrompt");
                throw null;
            }
        } else {
            TuxIconView tuxIconView2 = ((JE9) iDqS433S0100000_8.l0).LJLJL;
            if (tuxIconView2 != null) {
                int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32) + ((C32151Nz.LJIIZILJ(52) - C32151Nz.LJIIZILJ(32)) * floatValue));
                C78927UyJ.LJFF(tuxIconView2, Integer.valueOf(LJJIIZ3), Integer.valueOf(LJJIIZ3));
                C26338AVi.LJI(tuxIconView2, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5) + ((C32151Nz.LJIIZILJ(8) - C32151Nz.LJIIZILJ(5)) * floatValue))), false, 23);
                TuxTextView tuxTextView4 = ((JE9) iDqS433S0100000_8.l0).LJLJLJ;
                if (tuxTextView4 != null) {
                    float f2 = (6 * floatValue) + 10;
                    tuxTextView4.setTextSize(f2);
                    int LJJIIZ4 = O6R.LJJIIZ(f2);
                    C26338AVi.LJIIIZ(tuxTextView4, Integer.valueOf(LJJIIZ4), null, Integer.valueOf(LJJIIZ4), null, 26);
                } else {
                    o.LJIJI("commonStatusViewPrompt");
                    throw null;
                }
            } else {
                o.LJIJI("commonStatusViewIcon");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        JJG jjg = (JJG) iDqS433S0100000_8.l0;
        jjg.LJLIL.LIZJ(intValue, view, aweme, jjg.LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        List<? extends Aweme> list = ((JJG) iDqS433S0100000_8.l0).LJLJJI;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            if (!aweme2.isLive()) {
                arrayList.add(aweme2);
            }
        }
        ((JJG) iDqS433S0100000_8.l0).LJLIL.LIZJ(intValue, view, aweme, arrayList);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS433S0100000_8 iDqS433S0100000_8, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        Aweme aweme = (Aweme) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        JJG jjg = (JJG) iDqS433S0100000_8.l0;
        jjg.LJLIL.LIZJ(intValue, view, aweme, jjg.LJLJJI);
        return C76800UCe.LIZ;
    }
}
