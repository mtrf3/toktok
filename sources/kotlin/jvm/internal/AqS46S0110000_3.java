package kotlin.jvm.internal;

import X.AbstractC177926ya;
import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.C176996x5;
import X.C177256xV;
import X.C177336xd;
import X.C177616y5;
import X.C177876yV;
import X.C177906yY;
import X.C177916yZ;
import X.C186957Vj;
import X.C190187dG;
import X.C192027gE;
import X.C192217gX;
import X.C197827pa;
import X.C203577yr;
import X.C215238cZ;
import X.C234509Ig;
import X.C32I;
import X.C43I;
import X.C61878OQg;
import X.C71Y;
import X.C72912tb;
import X.C76800UCe;
import X.C77H;
import X.C7AH;
import X.C7HV;
import X.C7KB;
import X.C7MK;
import X.C7ML;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryManagerAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS46S0110000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 state = (C177616y5) obj;
        o.LJIIIZ(state, "state");
        ((KeyboardInputV2Assem) aqS46S0110000_3.l0).Z3(aqS46S0110000_3.z1, state.LLD);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        CommentVideoModel.Type LJIJ;
        C177336xd source = (C177336xd) obj;
        o.LJIIIZ(source, "source");
        C176996x5 L1 = ((KeyboardInputV2Assem) aqS46S0110000_3.l0).L1();
        if (L1 != null) {
            source.LJLL = Integer.valueOf(L1.LJLJJI.getCommentInputViewType()).intValue();
        }
        C176996x5 L12 = ((KeyboardInputV2Assem) aqS46S0110000_3.l0).L1();
        if (L12 != null && (LJIJ = L12.LJIJ()) != null) {
            source.LJLJLLL = LJIJ;
        }
        if (!aqS46S0110000_3.z1) {
            source.LJLIL = "";
            source.LJLJJL = "";
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, new C177256xV((Comment) aqS46S0110000_3.l0, null, aqS46S0110000_3.z1, 2), false, false, null, null, null, null, null, null, false, null, null, new C43I(Boolean.TRUE), false, false, false, false, false, false, null, -134217985, 31);
    }

    public static final Object invoke$11(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        Context context;
        String string;
        Context context2;
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        C234509Ig c234509Ig = (C234509Ig) it;
        if (!aqS46S0110000_3.z1 ? (context = ((WatchHistoryManagerAssem) aqS46S0110000_3.l0).getContext()) == null || (string = context.getString(R.string.tuy)) == null : (context2 = ((WatchHistoryManagerAssem) aqS46S0110000_3.l0).getContext()) == null || (string = context2.getString(R.string.tuh)) == null) {
            string = "";
        }
        c234509Ig.LIZJ = string;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C77H it = (C77H) obj;
        o.LJIIIZ(it, "it");
        Aweme aweme = it.LJLILLLLZI;
        if (aweme != null) {
            aweme.handleInteractionBubbleLike(Boolean.valueOf(aqS46S0110000_3.z1), (User) aqS46S0110000_3.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        C197827pa.LJIIIIZZ(sendEventTrackingAsync, (C197827pa) aqS46S0110000_3.l0, aqS46S0110000_3.z1, "show");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        C197827pa.LJIIIIZZ(sendEventTrackingAsync, (C197827pa) aqS46S0110000_3.l0, aqS46S0110000_3.z1, "click");
        sendEventTrackingAsync.put("click_position", "download");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        C197827pa.LJIIIIZZ(sendEventTrackingAsync, (C197827pa) aqS46S0110000_3.l0, aqS46S0110000_3.z1, "click");
        sendEventTrackingAsync.put("click_position", "no");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS46S0110000_3 aqS46S0110000_3, Object it) {
        o.LJIIIZ(it, "it");
        C7MK.LJII("now_button_action", new AqS46S0110000_3((C197827pa) aqS46S0110000_3.l0, aqS46S0110000_3.z1, 15));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        Long l;
        List<C192217gX> LIZ;
        C192027gE setState = (C192027gE) obj;
        o.LJIIIZ(setState, "$this$setState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get videos in allfavorites: cursor = ");
        LIZ2.append(setState.LJLJI);
        LIZ2.append(", maxCursor = ");
        LIZ2.append(((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", X1D.LIZIZ(LIZ2));
        Long l2 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
        long j = setState.LJLJI;
        long j2 = 0;
        if (l2 == null || l2.longValue() != j || ((l = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor) != null && l.longValue() == 0)) {
            if (aqS46S0110000_3.z1) {
                LIZ = C61878OQg.INSTANCE;
            } else {
                LIZ = setState.LJLILLLLZI.LIZ();
                if (LIZ == null) {
                    LIZ = C61878OQg.INSTANCE;
                }
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            if (LIZ != null && !LIZ.isEmpty()) {
                arrayList.addAll(LIZ);
            }
            List<Aweme> list = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
            if (list != null && !list.isEmpty()) {
                List<Aweme> list2 = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<Aweme> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C192217gX(0, it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            C72912tb c72912tb = new C72912tb(arrayList);
            Long l3 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
            if (l3 != null) {
                j2 = l3.longValue();
            }
            Boolean bool = ((CollectionContentResponse) aqS46S0110000_3.l0).hasMore;
            if (bool != null) {
                z = bool.booleanValue();
            }
            setState = new C192027gE(c72912tb, j2, z, 1);
        }
        return setState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if ((r1 instanceof X.C3C1) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AqS46S0110000_3 r6, java.lang.Object r7) {
        /*
            X.7gE r7 = (X.C192027gE) r7
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r6.z1
            if (r0 != 0) goto L1c
            boolean r0 = r7.LJLJJI
            if (r0 != 0) goto L12
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.2td<java.util.List<X.7gX>> r1 = r7.LJLILLLLZI
            boolean r0 = r1 instanceof X.C33X
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof X.C3C1
            if (r0 == 0) goto L25
        L1c:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r1 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r1
            X.7gt r0 = X.C192437gt.LJLIL
            r1.setState(r0)
        L25:
            boolean r0 = r6.z1
            if (r0 == 0) goto L64
            r1 = 0
        L2b:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.8as r0 = r5.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r0 = r0.getOperator()
            X.7gv r0 = (X.InterfaceC192457gv) r0
            X.Sri r1 = r0.LLD(r1)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r4 = r1.LJJL(r0)
            Y.AfS23S0110000_3 r3 = new Y.AfS23S0110000_3
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 3
            r3.<init>(r2, r1, r0)
            Y.AfS55S0100000_3 r1 = new Y.AfS55S0100000_3
            r0 = 51
            r1.<init>(r2, r0)
            X.3kP r0 = r4.LJJJLIIL(r3, r1)
            r5.disposeOnClear(r0)
            goto Lf
        L64:
            long r1 = r7.LJLJI
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS46S0110000_3.invoke$18(kotlin.jvm.internal.AqS46S0110000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$19(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        Long l;
        List<C192217gX> LIZ;
        boolean z;
        C192027gE setState = (C192027gE) obj;
        o.LJIIIZ(setState, "$this$setState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get videos in candidate: cursor = ");
        LIZ2.append(setState.LJLJI);
        LIZ2.append(", maxCursor = ");
        LIZ2.append(((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", X1D.LIZIZ(LIZ2));
        Long l2 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
        long j = setState.LJLJI;
        long j2 = 0;
        if (l2 == null || l2.longValue() != j || ((l = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor) != null && l.longValue() == 0)) {
            if (aqS46S0110000_3.z1) {
                LIZ = C61878OQg.INSTANCE;
            } else {
                LIZ = setState.LJLILLLLZI.LIZ();
                if (LIZ == null) {
                    LIZ = C61878OQg.INSTANCE;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (LIZ != null && !LIZ.isEmpty()) {
                arrayList.addAll(LIZ);
            }
            List<Aweme> list = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
            if (list != null && !list.isEmpty()) {
                List<Aweme> list2 = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<Aweme> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C192217gX(1, it.next()));
                }
                arrayList.addAll(arrayList2);
            }
            C72912tb c72912tb = new C72912tb(arrayList);
            Long l3 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
            if (l3 != null) {
                j2 = l3.longValue();
            }
            Boolean bool = ((CollectionContentResponse) aqS46S0110000_3.l0).hasMore;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            setState = new C192027gE(c72912tb, j2, z, 1);
        }
        return setState;
    }

    public static final Object invoke$2(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 state = (C177616y5) obj;
        o.LJIIIZ(state, "state");
        ((KeyboardInputV2Assem) aqS46S0110000_3.l0).Z3(state.LJLLJ, aqS46S0110000_3.z1);
        ((KeyboardInputV2Assem) aqS46S0110000_3.l0).a4(state.LLI, aqS46S0110000_3.z1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if ((r1 instanceof X.C3C1) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AqS46S0110000_3 r6, java.lang.Object r7) {
        /*
            X.7gE r7 = (X.C192027gE) r7
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = r6.z1
            if (r0 != 0) goto L1c
            boolean r0 = r7.LJLJJI
            if (r0 != 0) goto L12
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.2td<java.util.List<X.7gX>> r1 = r7.LJLILLLLZI
            boolean r0 = r1 instanceof X.C33X
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof X.C3C1
            if (r0 == 0) goto L25
        L1c:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r1 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r1
            X.7gu r0 = X.C192447gu.LJLIL
            r1.setState(r0)
        L25:
            boolean r0 = r6.z1
            if (r0 == 0) goto L64
            r1 = 0
        L2b:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.8as r0 = r5.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r0 = r0.getOperator()
            X.7gv r0 = (X.InterfaceC192457gv) r0
            X.Sri r1 = r0.LJLJLLL(r1)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r4 = r1.LJJL(r0)
            Y.AfS23S0110000_3 r3 = new Y.AfS23S0110000_3
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 4
            r3.<init>(r2, r1, r0)
            Y.AfS55S0100000_3 r1 = new Y.AfS55S0100000_3
            r0 = 52
            r1.<init>(r2, r0)
            X.3kP r0 = r4.LJJJLIIL(r3, r1)
            r5.disposeOnClear(r0)
            goto Lf
        L64:
            long r1 = r7.LJLJI
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS46S0110000_3.invoke$20(kotlin.jvm.internal.AqS46S0110000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C203577yr setState = (C203577yr) obj;
        o.LJIIIZ(setState, "$this$setState");
        VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) aqS46S0110000_3.l0;
        return C203577yr.LIZ(setState, videoFavoriteVM.kv0(videoFavoriteVM.lv0(), ((VideoFavoriteVM) aqS46S0110000_3.l0).ov0(), ((VideoFavoriteVM) aqS46S0110000_3.l0).LJLLI), new C43I(Boolean.valueOf(aqS46S0110000_3.z1)), null, 4);
    }

    public static final Object invoke$22(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C203577yr setState = (C203577yr) obj;
        o.LJIIIZ(setState, "$this$setState");
        VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) aqS46S0110000_3.l0;
        return C203577yr.LIZ(setState, videoFavoriteVM.kv0(videoFavoriteVM.lv0(), ((VideoFavoriteVM) aqS46S0110000_3.l0).ov0(), ((VideoFavoriteVM) aqS46S0110000_3.l0).LJLLI), new C43I(Boolean.valueOf(aqS46S0110000_3.z1)), null, 4);
    }

    public static final Object invoke$23(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C215238cZ setState = (C215238cZ) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C215238cZ.LIZ(setState, null, null, new OSZ(Boolean.valueOf(aqS46S0110000_3.z1), ((Aweme) aqS46S0110000_3.l0).getAid()), 3);
    }

    public static final Object invoke$24(AqS46S0110000_3 aqS46S0110000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        ((InterfaceC88472Yns) aqS46S0110000_3.l0).invoke(Boolean.valueOf(!aqS46S0110000_3.z1));
        return new C190187dG(!aqS46S0110000_3.z1);
    }

    public static final Object invoke$3(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        ((KeyboardInputV2Assem) aqS46S0110000_3.l0).a4(aqS46S0110000_3.z1, it.LLD);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if ((r1 instanceof X.C3C1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS46S0110000_3 r6, java.lang.Object r7) {
        /*
            X.7gE r7 = (X.C192027gE) r7
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            java.lang.String r3 = r2.LJLIL
            if (r3 != 0) goto L12
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            boolean r0 = r6.z1
            if (r0 != 0) goto L25
            boolean r0 = r7.LJLJJI
            if (r0 != 0) goto L1b
            goto Lf
        L1b:
            X.2td<java.util.List<X.7gX>> r1 = r7.LJLILLLLZI
            boolean r0 = r1 instanceof X.C33X
            if (r0 != 0) goto L25
            boolean r0 = r1 instanceof X.C3C1
            if (r0 == 0) goto L2a
        L25:
            X.7gs r0 = X.C192427gs.LJLIL
            r2.setState(r0)
        L2a:
            boolean r0 = r6.z1
            if (r0 == 0) goto L69
            r1 = 0
        L30:
            java.lang.Object r5 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r5 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r5
            X.8as r0 = r5.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r0 = r0.getOperator()
            X.7gv r0 = (X.InterfaceC192457gv) r0
            X.Sri r1 = r0.LJIILJJIL(r1, r3)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r4 = r1.LJJL(r0)
            Y.AfS23S0110000_3 r3 = new Y.AfS23S0110000_3
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r2 = (com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel) r2
            boolean r1 = r6.z1
            r0 = 2
            r3.<init>(r2, r1, r0)
            Y.AfS55S0100000_3 r1 = new Y.AfS55S0100000_3
            r0 = 25
            r1.<init>(r2, r0)
            X.3kP r0 = r4.LJJJLIIL(r3, r1)
            r5.disposeOnClear(r0)
            goto Lf
        L69:
            long r1 = r7.LJLJI
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS46S0110000_3.invoke$4(kotlin.jvm.internal.AqS46S0110000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        Long l;
        List<C192217gX> LIZ;
        int i;
        boolean z;
        C192027gE setState = (C192027gE) obj;
        o.LJIIIZ(setState, "$this$setState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get videos in collection: cursor = ");
        LIZ2.append(setState.LJLJI);
        LIZ2.append(", maxCursor = ");
        LIZ2.append(((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Collections", X1D.LIZIZ(LIZ2));
        Long l2 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
        long j = setState.LJLJI;
        long j2 = 0;
        if (l2 == null || l2.longValue() != j || ((l = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor) != null && l.longValue() == 0)) {
            if (aqS46S0110000_3.z1) {
                LIZ = C61878OQg.INSTANCE;
            } else {
                LIZ = setState.LJLILLLLZI.LIZ();
                if (LIZ == null) {
                    LIZ = C61878OQg.INSTANCE;
                }
            }
            if (!(LIZ instanceof Collection) || !LIZ.isEmpty()) {
                Iterator<C192217gX> it = LIZ.iterator();
                while (it.hasNext()) {
                    if (it.next().LJLILLLLZI != 0) {
                        i = 0;
                        break;
                    }
                }
            }
            i = 1;
            int i2 = i ^ 1;
            ArrayList arrayList = new ArrayList();
            if (!LIZ.isEmpty()) {
                arrayList.addAll(LIZ);
            }
            List<Aweme> list = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
            if (list != null && !list.isEmpty()) {
                List<Aweme> list2 = ((CollectionContentResponse) aqS46S0110000_3.l0).items;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<Aweme> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C192217gX(i2, it2.next()));
                }
                arrayList.addAll(arrayList2);
                C7HV.LIZIZ.LIZJ(((CollectionContentResponse) aqS46S0110000_3.l0).items, C7KB.OTHERS);
            }
            C72912tb c72912tb = new C72912tb(arrayList);
            Long l3 = ((CollectionContentResponse) aqS46S0110000_3.l0).maxCursor;
            if (l3 != null) {
                j2 = l3.longValue();
            }
            Boolean bool = ((CollectionContentResponse) aqS46S0110000_3.l0).hasMore;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            setState = new C192027gE(c72912tb, j2, z, 1);
        }
        return setState;
    }

    public static final Object invoke$6(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        long j;
        C7AH setState = (C7AH) obj;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(Boolean.valueOf(aqS46S0110000_3.z1));
        C7ML gv0 = ((NowLikeViewModel) aqS46S0110000_3.l0).gv0();
        if (gv0 != null) {
            ((NowLikeViewModel) aqS46S0110000_3.l0).getClass();
            j = NowLikeViewModel.iv0(gv0);
        } else {
            j = 0;
        }
        return C7AH.LIZ(setState, null, c43i, new C43I(Long.valueOf(j)), new C43I(Boolean.valueOf(aqS46S0110000_3.z1)), null, 0, 49);
    }

    public static final Object invoke$7(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        String str;
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        if (aqS46S0110000_3.z1) {
            str = "tag_people_page";
        } else {
            str = "video_post_page";
        }
        sendEventTracking.put("page_name", str);
        sendEventTracking.put("close_type", ((C186957Vj) aqS46S0110000_3.l0).getCloseType());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        ((KeyboardVMV2) aqS46S0110000_3.l0).hv0(aqS46S0110000_3.z1, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS46S0110000_3 aqS46S0110000_3, Object obj) {
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSoftKeyboardState ");
        LIZ.append(it.LJLJJI);
        C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
        AbstractC177926ya abstractC177926ya = it.LJLJJI;
        if (!(abstractC177926ya instanceof C177876yV)) {
            if (o.LJ(abstractC177926ya, C177906yY.LIZ) || o.LJ(it.LJLJJI, C177916yZ.LIZ)) {
                ((KeyboardVMV2) aqS46S0110000_3.l0).iv0(C177916yZ.LIZ, false);
                ((KeyboardVMV2) aqS46S0110000_3.l0).setState(new AqS8S0010000_3(aqS46S0110000_3.z1, 20));
            } else {
                ((KeyboardVMV2) aqS46S0110000_3.l0).setState(new AqS8S0010000_3(aqS46S0110000_3.z1, 21));
            }
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS46S0110000_3(com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS46S0110000_3.<init>(com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(C197827pa c197827pa, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c197827pa;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS46S0110000_3(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC88472Yns;
        this.z1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(KeyboardInputV2Assem keyboardInputV2Assem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keyboardInputV2Assem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keyboardVMV2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(Comment comment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = comment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(CollectionContentResponse collectionContentResponse, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = collectionContentResponse;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(VideoFavoriteVM videoFavoriteVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoFavoriteVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(User user, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(boolean z, C186957Vj c186957Vj, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c186957Vj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(boolean z, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(boolean z, NowLikeViewModel nowLikeViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = nowLikeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0110000_3(boolean z, WatchHistoryManagerAssem watchHistoryManagerAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = watchHistoryManagerAssem;
    }
}
