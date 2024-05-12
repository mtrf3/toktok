package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentSubtitleSticker;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS121S0300000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.52B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52B {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(NLEModel nLEModel) {
        NLESegment nLESegment;
        EnumC123874tb enumC123874tb;
        NLESegment nLESegment2;
        NLEResourceNode LJI;
        NLEResourceNode LJI2;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (C79057V0z.LJJIJIL(nLETrack) == EnumC123864ta.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILLIIL());
                EnumC123874tb enumC123874tb2 = null;
                if (nLETrackSlot != null) {
                    nLESegment = nLETrackSlot.LJI();
                } else {
                    nLESegment = null;
                }
                NLESegmentSubtitleSticker LJFF = NLESegmentSubtitleSticker.LJFF(nLESegment);
                if (LJFF != null && (LJI2 = LJFF.LJI()) != null) {
                    enumC123874tb = LJI2.LJFF();
                } else {
                    enumC123874tb = null;
                }
                if (enumC123874tb != EnumC123874tb.SUBTITLE_STICKER) {
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILLIIL());
                    if (nLETrackSlot2 != null) {
                        nLESegment2 = nLETrackSlot2.LJI();
                    } else {
                        nLESegment2 = null;
                    }
                    NLESegmentSubtitleSticker LJFF2 = NLESegmentSubtitleSticker.LJFF(nLESegment2);
                    if (LJFF2 != null && (LJI = LJFF2.LJI()) != null) {
                        enumC123874tb2 = LJI.LJFF();
                    }
                    if (enumC123874tb2 == EnumC123874tb.AUTOSUBTITLE_STICKER) {
                    }
                }
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setEnable(false);
        }
    }

    public static String LIZLLL(float f) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        String format = decimalFormat.format(Float.valueOf(f));
        o.LJIIIIZZ(format, "format.format(number)");
        return format;
    }

    public static boolean LJI(NLETrackSlot nLETrackSlot) {
        if (C124614un.LJIILIIL(nLETrackSlot) && C124614un.LJIIL(nLETrackSlot.LJIIIIZZ())) {
            return true;
        }
        Iterator<NLEVideoEffect> it = nLETrackSlot.LJIIJ().iterator();
        while (it.hasNext()) {
            NLEVideoEffect effect = it.next();
            o.LJIIIIZZ(effect, "effect");
            if (C124614un.LJIIJ(effect)) {
                return true;
            }
        }
        Iterator<NLEFilter> it2 = nLETrackSlot.LJ().iterator();
        while (it2.hasNext()) {
            NLEFilter filter = it2.next();
            o.LJIIIIZZ(filter, "filter");
            if (C124614un.LJIIJJI(filter)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJII(Context context) {
        if (context == null || C81184Vtc.LIZIZ(context) > C7MY.LIZIZ(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
            if (!LJIILL.isEmpty()) {
                Iterator<NLETrackSlot> it = LJIILL.iterator();
                while (it.hasNext()) {
                    NLETrackSlot it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    if (LJI(it2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJIIIZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null) {
            return false;
        }
        VecNLETrackSlotSPtr LJIILLIIL = mainTrack.LJIILLIIL();
        if (LJIILLIIL.isEmpty()) {
            return false;
        }
        Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
        while (it.hasNext()) {
            if (it.next().LIZLLL() != null) {
                return true;
            }
        }
        return false;
    }

    public static Integer LIZJ(List list, NLETrackSlot addedSlot) {
        Object obj;
        Object obj2;
        o.LJIIIZ(addedSlot, "addedSlot");
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(LLJILJILJ, new IDComparatorS30S0000000_2(37));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((NLETimeSpaceNode) obj).getLayer() == 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            Iterator<NLETrackSlot> it2 = nLETrack.LJIILL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrackSlot slot = it2.next();
                o.LJIIIIZZ(slot, "slot");
                if (AnonymousClass636.LJIIL(slot)) {
                    if (!AnonymousClass636.LJIIL(addedSlot)) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((NLETimeSpaceNode) obj2).getLayer() == 0) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C65777Prh.LIZ(LLJILJILJ).remove(obj2);
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it4.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(nLETrack2.LJIILL());
            if (arrayList2.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList2, new IDComparatorS30S0000000_2(38));
            }
            if (arrayList2.isEmpty()) {
                return Integer.valueOf(nLETrack2.getLayer());
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() <= addedSlot.getStartTime() || nLETimeSpaceNode.getStartTime() >= addedSlot.getEndTime())) {
                    return Integer.valueOf(nLETrack2.getLayer());
                }
                if (i == 0 && nLETimeSpaceNode.getStartTime() >= addedSlot.getEndTime()) {
                    return Integer.valueOf(nLETrack2.getLayer());
                }
                if (i == arrayList2.size() - 1) {
                    if (nLETimeSpaceNode.getEndTime() <= addedSlot.getStartTime()) {
                        return Integer.valueOf(nLETrack2.getLayer());
                    }
                } else {
                    NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                    if (nLETimeSpaceNode.getEndTime() <= addedSlot.getStartTime() && addedSlot.getEndTime() <= nLETimeSpaceNode2.getStartTime()) {
                        return Integer.valueOf(nLETrack2.getLayer());
                    }
                }
            }
        }
        return null;
    }

    public static boolean LJFF(long j, EditorProContext editContext) {
        o.LJIIIZ(editContext, "editContext");
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() && (C124574uj.LIZLLL(C79057V0z.LJJI(editContext)) - j) / 1000 < ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        if (r6 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52B.LJIIJJI(com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.content.Context):void");
    }

    public static SY9 LJIIL(int i, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = true;
        return c2068389v.LIZ(activity);
    }

    public static SY9 LJIILJJIL(int i, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJFF = true;
        return c2068389v.LIZ(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[LOOP:1: B:21:0x007f->B:23:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(com.bytedance.ies.nle.editor_jni.NLEModel r15, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r16, android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52B.LJIIJ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Context):void");
    }

    public static SY9 LJIILIIL(int i, int i2, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_right_in_rec_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.dl);
        c2068389v.LJFF = true;
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i2;
        return c2068389v.LIZ(activity);
    }

    public static NLETrack LJ(NLEModel nleModel, NLETrackSlot addedSlot, List list, InterfaceC65784Pro interfaceC65784Pro) {
        Object obj;
        o.LJIIIZ(nleModel, "nleModel");
        o.LJIIIZ(addedSlot, "addedSlot");
        Integer LIZJ = LIZJ(list, addedSlot);
        if (LIZJ != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((NLETimeSpaceNode) obj).getLayer() == LIZJ.intValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) obj;
            if (nLETrack != null) {
                nLETrack.LIZIZ(addedSlot);
            }
            return nLETrack;
        }
        NLETrack nLETrack2 = (NLETrack) interfaceC65784Pro.invoke();
        nLETrack2.LIZIZ(addedSlot);
        nleModel.addTrack(nLETrack2);
        return nLETrack2;
    }

    public static void LIZ(ActivityC45651qj activity, TokenCert cert, AqS152S0100000_2 aqS152S0100000_2, AqS7S0401000_2 aqS7S0401000_2, int i) {
        final InterfaceC65784Pro onDismissed = aqS152S0100000_2;
        if ((i & 4) != 0) {
            onDismissed = C52D.LJLIL;
        }
        final InterfaceC65784Pro afterAllow = aqS7S0401000_2;
        if ((i & 8) != 0) {
            afterAllow = C52E.LJLIL;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cert, "cert");
        o.LJIIIZ(onDismissed, "onDismissed");
        o.LJIIIZ(afterAllow, "afterAllow");
        if (V2B.LJ()) {
            afterAllow.invoke();
            onDismissed.invoke();
            return;
        }
        HPI hpi = new HPI() { // from class: X.52C
            @Override // X.HPI
            public final void LIZ(int[] iArr, String[] strArr) {
                afterAllow.invoke();
                onDismissed.invoke();
            }
        };
        AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(afterAllow, (InterfaceC65784Pro<C76800UCe>) onDismissed, (InterfaceC65784Pro<C76800UCe>) 83);
        C52F onSettingCancelled = C52F.LJLIL;
        o.LJIIIZ(onSettingCancelled, "onSettingCancelled");
        HPJ.LIZIZ(activity, (String[]) C73994T2g.LJIIJ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}), new AqS121S0300000_2(activity, (ActivityC45651qj) onSettingCancelled, (InterfaceC65784Pro<C76800UCe>) aqS149S0200000_2, (InterfaceC65784Pro<C76800UCe>) 5), hpi, cert);
    }
}
