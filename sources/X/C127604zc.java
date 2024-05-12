package X;

import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import android.content.Intent;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.base.viewmodel.PreviewStickerViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127604zc extends C127764zs implements InterfaceC70422pa, InterfaceC127684zk {
    public final EditorProScene LJLLLLLL;
    public final MBA LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public boolean LLFF;
    public final ORV<EnumC127354zD> LLFFF;
    public long LLFII;
    public double LLFZ;
    public AqS168S0100000_2 LLI;
    public AqS152S0100000_2 LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public C5DC LLIIIILZ;
    public NLETrackSlot LLIIIJ;
    public boolean LLIIIL;
    public final C127614zd LLIIIZ;
    public final C127264z4 LLIIJI;

    public static final VideoPublishEditModel LJJIIZ() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    public final InterfaceC127634zf LJJIIZI() {
        return (InterfaceC127634zf) this.LLF.getValue();
    }

    @Override // X.C127764zs
    public final void LJJII() {
        super.LJJII();
        MutableLiveData LJII = C79057V0z.LJII(LJIILL(), "update_control_bar_time");
        if (LJII != null) {
            LJII.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 177));
        }
        MutableLiveData LJII2 = C79057V0z.LJII(LJIILL(), "update_control_bar_total");
        if (LJII2 != null) {
            LJII2.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 178));
        }
        MutableLiveData LJII3 = C79057V0z.LJII(LJIILL(), "selected_audio_track_slot");
        if (LJII3 != null) {
            LJII3.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 179));
        }
        MutableLiveData LJII4 = C79057V0z.LJII(LJIILL(), "IS_ACTIVE_TRACKPANEL");
        if (LJII4 != null) {
            LJII4.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 180));
        }
        MutableLiveData LJII5 = C79057V0z.LJII(LJIILL(), "is_bottom_panel_showing");
        if (LJII5 != null) {
            LJII5.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 181));
        }
        MutableLiveData LJII6 = C79057V0z.LJII(LJIILL(), "event_START_audio_record");
        if (LJII6 != null) {
            LJII6.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 182));
        }
        MutableLiveData LJII7 = C79057V0z.LJII(LJIILL(), "select_slot_event");
        if (LJII7 != null) {
            LJII7.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 183));
        }
        MutableLiveData LJII8 = C79057V0z.LJII(LJIILL(), "selected_nle_track");
        if (LJII8 != null) {
            LJII8.observe(this.LJLLLLLL, new Observer() { // from class: X.4wm
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    NLETrack nLETrack = ((C122724rk) obj).LIZ;
                    if (nLETrack != null) {
                        nLETrack.LJIIZILJ();
                    }
                }
            });
        }
        MutableLiveData LJII9 = C79057V0z.LJII(LJIILL(), "selected_nle_track_slot");
        if (LJII9 != null) {
            LJII9.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 167));
        }
        MutableLiveData LJII10 = C79057V0z.LJII(LJIILL(), "switch_track_style");
        if (LJII10 != null) {
            LJII10.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 169));
        }
        MutableLiveData LJII11 = C79057V0z.LJII(LJIILL(), "track_slot_move_event");
        if (LJII11 != null) {
            LJII11.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 170));
        }
        MutableLiveData LJII12 = C79057V0z.LJII(LJIILL(), "track_slot_clip_event");
        if (LJII12 != null) {
            LJII12.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 171));
        }
        MutableLiveData LJII13 = C79057V0z.LJII(LJIILL(), "select_slot_and_seek_to_start");
        if (LJII13 != null) {
            LJII13.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 172));
        }
        MutableLiveData LJII14 = C79057V0z.LJII(LJIILL(), "seek_to_slot_start");
        if (LJII14 != null) {
            LJII14.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 173));
        }
        MutableLiveData LJII15 = C79057V0z.LJII(LJIILL(), "move_track_to_position");
        if (LJII15 != null) {
            LJII15.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 174));
        }
        LJIILL().getPlayer().K9().observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 175));
        C1278850e.LIZ(this.LJLLLLLL.mView).LJLILLLLZI.observe(this.LJLLLLLL, new AObserverS70S0100000_2(this, 176));
        C1278850e.LIZ(this.LJLLLLLL.mView).LJLJI.observe(this.LJLLLLLL, new Observer() { // from class: X.58F
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int paddingTop;
                int i;
                boolean z;
                AnonymousClass514 anonymousClass514 = (AnonymousClass514) obj;
                int i2 = 0;
                if (anonymousClass514.LIZ) {
                    C1284452i LJIJ = C127604zc.this.LJIJ();
                    if (LJIJ != null) {
                        long j = anonymousClass514.LIZIZ;
                        int i3 = anonymousClass514.LIZJ;
                        LJIJ.LJLIL.startRecordAudio(j, i3);
                        C1302459g c1302459g = LJIJ.LJLIL.getMultiTrackAdapter().LJIJ;
                        if (c1302459g.LJJIJIL) {
                            return;
                        }
                        c1302459g.LJJIJIL = true;
                        c1302459g.LJJIJ.cancel();
                        c1302459g.LIZ.LJFF(true);
                        c1302459g.LIZ.setOnlyOne$editor_trackpanel_release(false);
                        c1302459g.LJIILLIIL = i3;
                        c1302459g.LJIILIIL = j;
                        c1302459g.LJIILL = c1302459g.LIZ.getPaddingTop() + ((c1302459g.LJII + AbstractC1301158t.LJIIIZ) * c1302459g.LJIILLIIL);
                        boolean z2 = false;
                        for (Map.Entry entry : ((LinkedHashMap) c1302459g.LIZ.LLIIIJ).entrySet()) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) entry.getKey();
                            C1301058s c1301058s = (C1301058s) entry.getValue();
                            C5A5 c5a5 = c1301058s.LJLILLLLZI;
                            if (c5a5 instanceof C130675Ax) {
                                boolean z3 = ((C130675Ax) c5a5).LJLJJI.LLIIL;
                                if (c1301058s.LJLIL == i3 && !z3) {
                                    if (Math.abs((nLETimeSpaceNode.getEndTime() / 1000) - j) < 5) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    ((C130675Ax) c1301058s.LJLILLLLZI).LJLJJI.setDrawEndDivider(z);
                                    if (z) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        c1302459g.LJIL = z2;
                        int height = (c1302459g.LIZ.getHeight() + C134845Qy.LIZ(64.0f)) - C134845Qy.LIZ(80.0f);
                        int i4 = c1302459g.LJII;
                        int i5 = AbstractC1301158t.LJIIIZ;
                        if (height < (i4 + i5) * 2) {
                            c1302459g.LIZ.setOnlyOne$editor_trackpanel_release(true);
                            c1302459g.LIZ.setShowTrackNum$editor_trackpanel_release((int) Math.ceil(r3.getHeight() / (c1302459g.LJII + i5)));
                        }
                        int LIZ = C0EH.LIZ(c1302459g.LJII, i5, c1302459g.LJIILLIIL, c1302459g.LIZ.getPaddingTop());
                        int scrollY = LIZ - c1302459g.LIZ.getScrollY();
                        if (scrollY < 0) {
                            i2 = scrollY;
                        } else {
                            int i6 = LIZ + c1302459g.LJII + i5;
                            C1303859u c1303859u = c1302459g.LIZ;
                            if (c1303859u.LLIIII) {
                                paddingTop = c1303859u.getPaddingTop();
                                i = c1302459g.LJII + i5;
                            } else {
                                paddingTop = c1303859u.getPaddingTop();
                                i = (c1302459g.LJII + i5) * 2;
                            }
                            int scrollY2 = (i6 - (i + paddingTop)) - c1302459g.LIZ.getScrollY();
                            if (scrollY2 > 0) {
                                i2 = scrollY2;
                            }
                        }
                        c1302459g.LIZ.LJIILLIIL(i2);
                        c1302459g.LJJIJ.start();
                        return;
                    }
                    return;
                }
                C1284452i LJIJ2 = C127604zc.this.LJIJ();
                if (LJIJ2 == null) {
                    return;
                }
                C1302459g c1302459g2 = LJIJ2.LJLIL.getMultiTrackAdapter().LJIJ;
                c1302459g2.LJJIJIL = false;
                c1302459g2.LJJIJ.cancel();
                c1302459g2.LIZ.LJFF(false);
                c1302459g2.LIZ.setOnlyOne$editor_trackpanel_release(false);
            }
        });
        final ActivityC45651qj activityC45651qj = this.LJLIL;
        AbstractC123304sg abstractC123304sg = new AbstractC123304sg(activityC45651qj) { // from class: X.4sr
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj);
                o.LJIIIZ(activityC45651qj, "activity");
            }

            @Override // X.AbstractC123304sg
            public final boolean LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
                long j = 30000;
                long startTime = nLETrackSlot2.getStartTime() - j;
                long endTime = nLETrackSlot2.getEndTime() + j;
                if (startTime <= nLETrackSlot.getStartTime() && endTime >= nLETrackSlot.getEndTime() && nLETrackSlot.getEndTime() != -2) {
                    return true;
                }
                return false;
            }
        };
        abstractC123304sg.LIZJ.addAll(C47261Igj.LJII(EnumC123874tb.VIDEO, EnumC123874tb.IMAGE, EnumC123874tb.TEXT_STICKER, EnumC123874tb.AUTOSUBTITLE_STICKER, EnumC123874tb.EFFECT, EnumC123874tb.COMPOSER));
        final ActivityC45651qj activityC45651qj2 = this.LJLIL;
        abstractC123304sg.LIZIZ.put("adjust_video_order", new AbstractC123274sd(activityC45651qj2) { // from class: X.4sk
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj2);
                o.LJIIIZ(activityC45651qj2, "activity");
            }

            @Override // X.InterfaceC123284se
            public final void LIZ(ArrayList linkageParams, java.util.Map map) {
                NLETrackSlot nLETrackSlot;
                NLENode nLENode;
                Object obj;
                C40517FvF LJJ;
                o.LJIIIZ(linkageParams, "linkageParams");
                if (linkageParams.isEmpty()) {
                    return;
                }
                Object obj2 = ListProtector.get(linkageParams, 0);
                o.LJIIIIZZ(obj2, "linkageParams[0]");
                C123434st c123434st = (C123434st) obj2;
                NLETrackSlot nLETrackSlot2 = c123434st.LIZIZ;
                if (nLETrackSlot2 == null || (nLETrackSlot = c123434st.LIZ) == null) {
                    return;
                }
                long startTime = nLETrackSlot2.getStartTime() - nLETrackSlot.getStartTime();
                OSZ<Integer, Integer> osz = c123434st.LIZJ;
                if (osz != null) {
                    int intValue = osz.getFirst().intValue();
                    OSZ<Integer, Integer> osz2 = c123434st.LIZJ;
                    if (osz2 != null) {
                        int intValue2 = osz2.getSecond().intValue();
                        NLEModel LJJI = C79057V0z.LJJI(LIZJ());
                        ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
                        Iterator LIZJ = t1.LIZJ(LJJI, "afterActionNLEModel.tracks");
                        while (true) {
                            nLENode = null;
                            if (LIZJ.hasNext()) {
                                obj = LIZJ.next();
                                NLETrack nLETrack = (NLETrack) obj;
                                if (!nLETrack.LJIIJ() && nLETrack.LJIIL() == EnumC123874tb.SUBTITLE_STICKER) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        NLENode nLENode2 = (NLENode) obj;
                        if (nLENode2 != null) {
                            nLENode = nLENode2.deepClone(true);
                        }
                        NLETrack LJFF = NLETrack.LJFF(nLENode);
                        VecNLETrackSPtr tracks = LJJI.getTracks();
                        ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
                        Iterator<NLETrack> it = tracks.iterator();
                        while (it.hasNext()) {
                            NLETrack next = it.next();
                            if (C124574uj.LJJJJJL(next)) {
                                LIZ.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LIZ, 10));
                        Iterator it2 = LIZ.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(NLETrack.LJFF(((NLENode) it2.next()).deepClone(true)));
                        }
                        ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) map).get(nLETrackSlot2.getUUID());
                        if (arrayList3 != null) {
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                NLETrackSlot nLETrackSlot3 = (NLETrackSlot) it3.next();
                                nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() + startTime);
                                nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() + startTime);
                                arrayList.add(nLETrackSlot3);
                                if (nLETrackSlot3.LJI().LIZJ() == EnumC123874tb.TEXT_STICKER) {
                                    C134215On.LIZ.LIZ(nLETrackSlot3, LIZJ());
                                }
                            }
                        }
                        if (intValue > intValue2) {
                            LJJ = new C40517FvF(intValue2 + 1, intValue);
                        } else {
                            LJJ = C78842Uww.LJJ(intValue, intValue2);
                        }
                        long duration = nLETrackSlot2.getDuration();
                        if (intValue <= intValue2) {
                            duration = -duration;
                        }
                        LIZLLL(LJJ, duration, arrayList, map, null);
                        LIZIZ(map, arrayList, LJFF, arrayList2);
                    }
                }
            }
        });
        final ActivityC45651qj activityC45651qj3 = this.LJLIL;
        abstractC123304sg.LIZIZ.put("delete_video", new AbstractC123274sd(activityC45651qj3) { // from class: X.4sl
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj3);
                o.LJIIIZ(activityC45651qj3, "activity");
            }

            @Override // X.InterfaceC123284se
            public final void LIZ(ArrayList linkageParams, java.util.Map map) {
                OSZ<Integer, Integer> osz;
                NLENode nLENode;
                Object obj;
                o.LJIIIZ(linkageParams, "linkageParams");
                if (linkageParams.isEmpty()) {
                    return;
                }
                Object obj2 = ListProtector.get(linkageParams, 0);
                o.LJIIIIZZ(obj2, "linkageParams[0]");
                C123434st c123434st = (C123434st) obj2;
                NLETrackSlot nLETrackSlot = c123434st.LIZ;
                if (nLETrackSlot != null && (osz = c123434st.LIZJ) != null) {
                    int intValue = osz.getFirst().intValue();
                    NLEModel LJJI = C79057V0z.LJJI(LIZJ());
                    ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator LIZJ = t1.LIZJ(LJJI, "afterActionNLEModel.tracks");
                    while (true) {
                        nLENode = null;
                        if (LIZJ.hasNext()) {
                            obj = LIZJ.next();
                            NLETrack nLETrack = (NLETrack) obj;
                            if (!nLETrack.LJIIJ() && nLETrack.LJIIL() == EnumC123874tb.SUBTITLE_STICKER) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NLENode nLENode2 = (NLENode) obj;
                    if (nLENode2 != null) {
                        nLENode = nLENode2.deepClone(true);
                    }
                    NLETrack LJFF = NLETrack.LJFF(nLENode);
                    VecNLETrackSPtr tracks = LJJI.getTracks();
                    ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (C124574uj.LJJJJJL(next)) {
                            LIZ.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(LIZ, 10));
                    Iterator it2 = LIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(NLETrack.LJFF(((NLENode) it2.next()).deepClone(true)));
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        arrayList2.addAll((ArrayList) it3.next());
                    }
                    ArrayList arrayList4 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                    if (arrayList4 != null) {
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it4.next();
                            NLETrack trackBySlot = LJJI.getTrackBySlot(nLETrackSlot2);
                            trackBySlot.LJIJJLI(nLETrackSlot2);
                            if (nLETrackSlot2.LJI().LIZJ() == EnumC123874tb.TEXT_STICKER) {
                                C134215On.LIZIZ(nLETrackSlot2, LIZJ());
                            }
                            if (trackBySlot.LJIILL().isEmpty()) {
                                LJJI.removeTrack(trackBySlot);
                            }
                        }
                    }
                    LIZLLL(C78842Uww.LJJ(intValue, LJJI.getMainTrack().LJIILL().size()), -nLETrackSlot.getDuration(), arrayList, map, null);
                    LIZIZ(map, arrayList, LJFF, arrayList3);
                }
            }
        });
        final ActivityC45651qj activityC45651qj4 = this.LJLIL;
        abstractC123304sg.LIZIZ.put("add_video", new AbstractC123274sd(activityC45651qj4) { // from class: X.4sj
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj4);
                o.LJIIIZ(activityC45651qj4, "activity");
            }

            @Override // X.InterfaceC123284se
            public final void LIZ(ArrayList linkageParams, java.util.Map map) {
                NLENode nLENode;
                Object obj;
                OSZ<Integer, Integer> osz;
                o.LJIIIZ(linkageParams, "linkageParams");
                if (linkageParams.isEmpty()) {
                    return;
                }
                ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                NLEModel LJJI = C79057V0z.LJJI(LIZJ());
                Iterator LIZJ = t1.LIZJ(LJJI, "afterActionNLEModel.tracks");
                while (true) {
                    nLENode = null;
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        NLETrack nLETrack = (NLETrack) obj;
                        if (!nLETrack.LJIIJ() && nLETrack.LJIIL() == EnumC123874tb.SUBTITLE_STICKER) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLENode nLENode2 = (NLENode) obj;
                if (nLENode2 != null) {
                    nLENode = nLENode2.deepClone(true);
                }
                NLETrack LJFF = NLETrack.LJFF(nLENode);
                VecNLETrackSPtr tracks = LJJI.getTracks();
                ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    if (C124574uj.LJJJJJL(next)) {
                        LIZ.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(LIZ, 10));
                Iterator it2 = LIZ.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(NLETrack.LJFF(((NLENode) it2.next()).deepClone(true)));
                }
                Iterator it3 = ((LinkedHashMap) map).values().iterator();
                while (it3.hasNext()) {
                    arrayList2.addAll((ArrayList) it3.next());
                }
                C123434st c123434st = (C123434st) ORZ.LLFII(linkageParams);
                if (c123434st != null && (osz = c123434st.LIZJ) != null) {
                    int intValue = osz.getSecond().intValue();
                    int size = LJJI.getMainTrack().LJIILL().size();
                    Iterator it4 = linkageParams.iterator();
                    long j = 0;
                    while (it4.hasNext()) {
                        NLETrackSlot nLETrackSlot = ((C123434st) it4.next()).LIZIZ;
                        if (nLETrackSlot != null) {
                            j += nLETrackSlot.getDuration();
                        } else {
                            return;
                        }
                    }
                    LIZLLL(C78842Uww.LJJ(intValue + 1, size), j, arrayList, map, null);
                    LIZIZ(map, arrayList, LJFF, arrayList3);
                }
            }
        });
        final ActivityC45651qj activityC45651qj5 = this.LJLIL;
        abstractC123304sg.LIZIZ.put("clip_video", new AbstractC123274sd(activityC45651qj5) { // from class: X.4sn
            public boolean LIZJ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj5);
                o.LJIIIZ(activityC45651qj5, "activity");
            }

            @Override // X.InterfaceC123284se
            public final void LIZ(ArrayList linkageParams, java.util.Map map) {
                NLESegmentAudio nLESegmentAudio;
                NLETrackSlot nLETrackSlot;
                NLESegmentAudio nLESegmentAudio2;
                Integer num;
                Object obj;
                NLENode nLENode;
                long LJIILIIL;
                o.LJIIIZ(linkageParams, "linkageParams");
                if (linkageParams.isEmpty()) {
                    return;
                }
                boolean z = false;
                Object obj2 = ListProtector.get(linkageParams, 0);
                o.LJIIIIZZ(obj2, "linkageParams[0]");
                C123434st c123434st = (C123434st) obj2;
                NLETrackSlot nLETrackSlot2 = c123434st.LIZIZ;
                if (nLETrackSlot2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot2.LJI())) != null && (nLETrackSlot = c123434st.LIZ) != null && (nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot.LJI())) != null && (num = c123434st.LIZLLL) != null) {
                    int intValue = num.intValue();
                    NLEModel LJJI = C79057V0z.LJJI(LIZJ());
                    ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
                    Iterator LIZJ = t1.LIZJ(LJJI, "afterActionNLEModel.tracks");
                    while (true) {
                        if (LIZJ.hasNext()) {
                            obj = LIZJ.next();
                            NLETrack nLETrack = (NLETrack) obj;
                            if (!nLETrack.LJIIJ() && nLETrack.LJIIL() == EnumC123874tb.SUBTITLE_STICKER) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NLENode nLENode2 = (NLENode) obj;
                    if (nLENode2 != null) {
                        nLENode = nLENode2.deepClone(true);
                    } else {
                        nLENode = null;
                    }
                    NLETrack LJFF = NLETrack.LJFF(nLENode);
                    VecNLETrackSPtr tracks = LJJI.getTracks();
                    ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (C124574uj.LJJJJJL(next)) {
                            LIZ.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(LIZ, 10));
                    Iterator it2 = LIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(NLETrack.LJFF(((NLENode) it2.next()).deepClone(true)));
                    }
                    ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) map).get(nLETrackSlot2.getUUID());
                    if (arrayList3 != null) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) it3.next();
                            this.LIZJ = z;
                            if (intValue == 0) {
                                float absSpeed = nLESegmentAudio.getAbsSpeed();
                                if (C124574uj.LJJJJ(nLETrackSlot)) {
                                    LJIILIIL = nLESegmentAudio2.LJIIL() - nLESegmentAudio.LJIIL();
                                } else {
                                    LJIILIIL = ((float) (nLESegmentAudio.LJIILIIL() - nLESegmentAudio2.LJIILIIL())) / absSpeed;
                                }
                                long startTime = nLETrackSlot3.getStartTime() - nLETrackSlot.getStartTime();
                                if (LJIILIIL > 0) {
                                    long duration = (nLETrackSlot3.getDuration() + startTime) - 100000;
                                    if (LJIILIIL <= startTime) {
                                        nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() - LJIILIIL);
                                        nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() - LJIILIIL);
                                        intValue = 0;
                                    } else if (startTime + 1 <= LJIILIIL && LJIILIIL <= duration) {
                                        long j = LJIILIIL - startTime;
                                        long duration2 = nLETrackSlot3.getDuration() - j;
                                        LIZJ().getEditor().LJIIIZ(nLETrackSlot3, j, duration2, EnumC124724uy.NONE);
                                        nLETrackSlot3.setDuration(duration2);
                                        intValue = 0;
                                        nLETrackSlot3.setStartTime(nLETrackSlot2.getStartTime());
                                        nLETrackSlot3.setEndTime(nLETrackSlot3.getStartTime() + duration2);
                                    } else {
                                        intValue = 0;
                                        if (LJIILIIL > duration) {
                                            C79057V0z.LJJI(LIZJ()).getTrackBySlot(nLETrackSlot3).LJIJJLI(nLETrackSlot3);
                                            this.LIZJ = true;
                                        }
                                    }
                                } else {
                                    intValue = 0;
                                    nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() - LJIILIIL);
                                    nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() - LJIILIIL);
                                }
                            } else {
                                long LJIIL = ((float) (nLESegmentAudio.LJIIL() - nLESegmentAudio2.LJIIL())) / nLESegmentAudio.getAbsSpeed();
                                if (LJIIL < 0) {
                                    long endTime = nLETrackSlot.getEndTime() - nLETrackSlot3.getEndTime();
                                    long duration3 = (nLETrackSlot3.getDuration() + endTime) - 100000;
                                    long j2 = -LJIIL;
                                    if (endTime + 1 <= j2 && j2 <= duration3) {
                                        long duration4 = nLETrackSlot3.getDuration() - (j2 - endTime);
                                        LIZJ().getEditor().LJIIIZ(nLETrackSlot3, 0L, duration4, EnumC124724uy.NONE);
                                        nLETrackSlot3.setDuration(duration4);
                                    } else if (j2 > duration3) {
                                        C79057V0z.LJJI(LIZJ()).getTrackBySlot(nLETrackSlot3).LJIJJLI(nLETrackSlot3);
                                        this.LIZJ = true;
                                    }
                                }
                            }
                            arrayList.add(nLETrackSlot3);
                            if (nLETrackSlot3.LJI().LIZJ() == EnumC123874tb.TEXT_STICKER) {
                                if (this.LIZJ) {
                                    C134215On.LIZIZ(nLETrackSlot3, LIZJ());
                                } else {
                                    C134215On.LIZ.LIZ(nLETrackSlot3, LIZJ());
                                }
                            }
                            z = false;
                        }
                    }
                    int LJIILJJIL = LJJI.getMainTrack().LJIILJJIL(nLETrackSlot2);
                    int size = LJJI.getMainTrack().LJIILL().size();
                    if (LJIILJJIL != -1 && LJIILJJIL != size - 1) {
                        LIZLLL(C78842Uww.LJJ(LJIILJJIL + 1, size), nLETrackSlot2.getDuration() - nLETrackSlot.getDuration(), arrayList, map, null);
                    }
                    LIZIZ(map, arrayList, LJFF, arrayList2);
                }
            }
        });
        final ActivityC45651qj activityC45651qj6 = this.LJLIL;
        abstractC123304sg.LIZIZ.put("speed_video", new AbstractC123274sd(activityC45651qj6) { // from class: X.4sm
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activityC45651qj6);
                o.LJIIIZ(activityC45651qj6, "activity");
            }

            @Override // X.InterfaceC123284se
            public final void LIZ(ArrayList linkageParams, java.util.Map map) {
                Object obj;
                NLENode nLENode;
                NLESegmentVideo nLESegmentVideo;
                NLETrackSlot nLETrackSlot;
                NLESegmentVideo nLESegmentVideo2;
                NLESegmentVideo nLESegmentVideo3;
                NLETrackSlot nLETrackSlot2;
                NLESegmentVideo nLESegmentVideo4;
                o.LJIIIZ(linkageParams, "linkageParams");
                if (linkageParams.isEmpty()) {
                    return;
                }
                NLEModel LJJI = C79057V0z.LJJI(LIZJ());
                Iterator LIZJ = t1.LIZJ(LJJI, "afterActionNLEModel.tracks");
                while (true) {
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        NLETrack nLETrack = (NLETrack) obj;
                        if (!nLETrack.LJIIJ() && nLETrack.LJIIL() == EnumC123874tb.SUBTITLE_STICKER) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLENode nLENode2 = (NLENode) obj;
                if (nLENode2 != null) {
                    nLENode = nLENode2.deepClone(true);
                } else {
                    nLENode = null;
                }
                NLETrack LJFF = NLETrack.LJFF(nLENode);
                VecNLETrackSPtr tracks = LJJI.getTracks();
                ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    if (C124574uj.LJJJJJL(next)) {
                        LIZ.add(next);
                    }
                }
                ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
                Iterator it2 = LIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(NLETrack.LJFF(((NLENode) it2.next()).deepClone(true)));
                }
                ArrayList<NLETrackSlot> arrayList2 = new ArrayList<>();
                if (linkageParams.size() > 1) {
                    Iterator it3 = linkageParams.iterator();
                    while (it3.hasNext()) {
                        C123434st c123434st = (C123434st) it3.next();
                        NLETrackSlot nLETrackSlot3 = c123434st.LIZIZ;
                        if (nLETrackSlot3 != null && (nLESegmentVideo3 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot3.LJI())) != null && (nLETrackSlot2 = c123434st.LIZ) != null && (nLESegmentVideo4 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot2.LJI())) != null) {
                            LJFF(map, nLETrackSlot3, nLESegmentVideo3, nLESegmentVideo4, nLETrackSlot2, arrayList2);
                        }
                    }
                } else {
                    Object obj2 = ListProtector.get(linkageParams, 0);
                    o.LJIIIIZZ(obj2, "linkageParams[0]");
                    C123434st c123434st2 = (C123434st) obj2;
                    NLETrackSlot nLETrackSlot4 = c123434st2.LIZIZ;
                    if (nLETrackSlot4 == null || (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot4.LJI())) == null || (nLETrackSlot = c123434st2.LIZ) == null || (nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot.LJI())) == null) {
                        return;
                    }
                    LJFF(map, nLETrackSlot4, nLESegmentVideo, nLESegmentVideo2, nLETrackSlot, arrayList2);
                    int LJIILJJIL = C79057V0z.LJJI(LIZJ()).getMainTrack().LJIILJJIL(nLETrackSlot4);
                    int size = C79057V0z.LJJI(LIZJ()).getMainTrack().LJIILL().size();
                    if (LJIILJJIL != -1 && LJIILJJIL != size - 1) {
                        LIZLLL(C78842Uww.LJJ(LJIILJJIL + 1, size), nLETrackSlot4.getDuration() - nLETrackSlot.getDuration(), arrayList2, map, C123384so.LJLIL);
                    }
                }
                LIZIZ(map, arrayList2, LJFF, arrayList);
            }

            public final void LJFF(java.util.Map<String, ? extends ArrayList<NLETrackSlot>> map, NLETrackSlot nLETrackSlot, NLESegmentVideo nLESegmentVideo, NLESegmentVideo nLESegmentVideo2, NLETrackSlot nLETrackSlot2, ArrayList<NLETrackSlot> arrayList) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) map).get(nLETrackSlot.getUUID());
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        NLETrackSlot nLETrackSlot3 = (NLETrackSlot) it.next();
                        if (!C78596Usy.LJJJJI(nLETrackSlot3)) {
                            long duration = ((float) nLETrackSlot3.getDuration()) / (nLESegmentVideo.getAbsSpeed() / nLESegmentVideo2.getAbsSpeed());
                            if (duration < 100000) {
                                duration = 100000;
                            }
                            nLETrackSlot3.setStartTime(nLETrackSlot.getStartTime() + (((float) (nLETrackSlot3.getStartTime() - nLETrackSlot2.getStartTime())) / r7));
                            nLETrackSlot3.setEndTime(nLETrackSlot3.getStartTime() + duration);
                            nLETrackSlot3.setDuration(duration);
                            arrayList.add(nLETrackSlot3);
                            if (nLETrackSlot3.LJI().LIZJ() == EnumC123874tb.TEXT_STICKER) {
                                C134215On.LIZ.LIZ(nLETrackSlot3, LIZJ());
                            }
                        }
                    }
                }
            }
        });
        C124944vK c124944vK = TrackLinkageManagerProvider.Companion;
        ActivityC45651qj activity = this.LJLIL;
        c124944vK.getClass();
        o.LJIIIZ(activity, "activity");
        ((TrackLinkageManagerProvider) C5G0.LIZ(TrackLinkageManagerProvider.class)).setBusinessTrackLinkageManager(abstractC123304sg);
    }

    public final void LJJIJL() {
        C79057V0z.LJJJJL(LJIILL(), "change_ratio_event", Float.valueOf(LJIJI().getCanvasRatio()));
        NLEModel LJJI = C79057V0z.LJJI(LJIILL());
        NLEVideoFrameModel nLEVideoFrameModel = new NLEVideoFrameModel();
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.LIZ(EnumC123894td.VIDEO_FRAME);
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIIIZ("");
        nLEResourceNode.LJIILIIL(EnumC123874tb.IMAGE);
        NLEEditorJniJNI.NLEStyCanvas_setImage(nLEStyCanvas.LIZ, nLEStyCanvas, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        NLEEditorJniJNI.NLEVideoFrameModel_setCoverMaterial(nLEVideoFrameModel.LIZ, nLEVideoFrameModel, nLEStyCanvas.LIZ, nLEStyCanvas);
        NLEEditorJniJNI.NLEVideoFrameModel_setVideoFrameTime(nLEVideoFrameModel.LIZ, nLEVideoFrameModel, 0L);
        NLEEditorJniJNI.NLEVideoFrameModel_setCanvasRatio(nLEVideoFrameModel.LIZ, nLEVideoFrameModel, 0.5625f);
        nLEVideoFrameModel.setEnable(false);
        LJJI.setCover(nLEVideoFrameModel);
    }

    public final void LJJIJLIJ() {
        C5G5.LIZ(this);
        LJIILL().addNLEListener(this.LJLLLL);
        if (!this.LJLLILLLL && LJIL() != null && LJIJJ() != null && LJIILJJIL() != null && LJIILLIIL() != null) {
            InterfaceC1278950f LJIJJ = LJIJJ();
            if (LJIJJ != null) {
                LJJIJIIJI(LJIJJ);
            }
            LJIILJJIL();
            C58D LJIL = LJIL();
            if (LJIL != null) {
                LJJIJIIJIL(LJIL);
            }
            C50Q LJIILLIIL = LJIILLIIL();
            if (LJIILLIIL != null) {
                LJJIJ(LJIILLIIL);
            }
            LJJII();
            this.LJLLILLLL = true;
        }
        ((PreviewStickerViewModel) this.LJZ.getValue()).init();
        LJIILL().addNLEListener(this.LLIIIZ);
    }

    public final void LJJIL() {
        if (System.currentTimeMillis() - this.LLFII < 500) {
            return;
        }
        ActivityC45651qj activityC45651qj = this.LJLIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.fms);
        C78915Uy7.LJJIIZI(activityC45651qj, 1066, creativeToastBuilder);
        VideoPublishEditModel LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            EditorProContext editorContext = LJIILL();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJJIIZ, editorContext);
            LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
            FMX.LJIIL("material_too_short_popup", LJFF.LIZ);
        }
        this.LLFII = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0074, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127604zc.LJJIZ():void");
    }

    @Override // X.C127764zs, X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        super.onDestroy();
        C5OG.LIZJ(C135085Rw.LJLIL);
        EditorProScene editorProScene = this.LJLLLLLL;
        if ((editorProScene instanceof InterfaceC127674zj) && editorProScene != null) {
            editorProScene.unregisterActivityResultListener(this);
        }
        C48841JEv.LIZJ(this, null);
    }

    @Override // X.C127764zs, X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onHide() {
        super.onHide();
        LJIILL().removeNLEListener(this.LLIIIZ);
        C79057V0z.LJJIL(LJIILL(), this.LLIIJI);
        EditorProScene editorProScene = this.LJLLLLLL;
        if ((editorProScene instanceof InterfaceC127674zj) && editorProScene != null) {
            editorProScene.unregisterActivityResultListener(this);
        }
    }

    @Override // X.C127764zs, X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onShow() {
        super.onShow();
        C79057V0z.LJFF(LJIILL(), this.LLIIJI);
        EditorProScene editorProScene = this.LJLLLLLL;
        if ((editorProScene instanceof InterfaceC127674zj) && editorProScene != null) {
            editorProScene.registerActivityResultListener(this);
        }
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLZ;
    }

    public final void LJJIIJZLJL(boolean z) {
        boolean z2 = !z;
        C1284452i LJIJ = LJIJ();
        if (LJIJ != null) {
            if (!this.LLII) {
                LJIJ.LJLLL = z;
                LJIJ.LJLLJ = z2;
                C58D LJIL = LJIL();
                if (LJIL != null) {
                    LJIL.enableTrackPanelButton(z2);
                }
                LJIJ.LJLILLLLZI.LJLLL = z;
            }
            TrackPanelViewModel trackPanelViewModel = LJIJ.LJLILLLLZI;
            trackPanelViewModel.LJLLJ = z2;
            trackPanelViewModel.LJLLLL = z2;
            ((C1303859u) LJIJ.LJLIL._$_findCachedViewById(R.id.kn7)).setEnableClip$editor_trackpanel_release(z2);
            LJIJ.LJIJJ(z2);
            C58D LJIL2 = LJIL();
            if (LJIL2 != null) {
                LJIL2.setPipDropClickable(z2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.50M] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.4zh] */
    public final void LJJIJ(final C50Q c50q) {
        c50q.LIZLLL(new C50O() { // from class: X.50M
            @Override // X.AnonymousClass533
            public final void LIZ() {
                C1284452i LJIJ = C127604zc.this.LJIJ();
                if (LJIJ != null) {
                    C1284452i.LJIL(LJIJ, false, 3);
                }
                C127604zc c127604zc = C127604zc.this;
                if (c127604zc.LLII) {
                    C58D LJIL = c127604zc.LJIL();
                    if (LJIL != null) {
                        LJIL.showOrHideNullAudioTrack(false);
                    }
                    C58D LJIL2 = C127604zc.this.LJIL();
                    if (LJIL2 != null) {
                        LJIL2.showOrHideNullEffectTrack(C124574uj.LJIILIIL(C79057V0z.LJJI(C127604zc.this.LJIILL())).isEmpty());
                    }
                    C1284452i LJIJ2 = C127604zc.this.LJIJ();
                    if (LJIJ2 != null) {
                        LJIJ2.LJIJJLI(TrackState.VIDEOEFFECT);
                        return;
                    }
                    return;
                }
                C58D LJIL3 = c127604zc.LJIL();
                if (LJIL3 != null) {
                    LJIL3.showOrHideNullAudioTrack(C124604um.LJIIIZ(C127604zc.this.LJIILL()));
                }
                C58D LJIL4 = C127604zc.this.LJIL();
                if (LJIL4 != null) {
                    LJIL4.showOrHideNullEffectTrack(false);
                }
                C1284452i LJIJ3 = C127604zc.this.LJIJ();
                if (LJIJ3 != null) {
                    LJIJ3.LJIJJLI(TrackState.NORMAL);
                }
                AqS152S0100000_2 aqS152S0100000_2 = C127604zc.this.LLIFFJFJJ;
                if (aqS152S0100000_2 != null) {
                    aqS152S0100000_2.invoke();
                }
                C79057V0z.LJJJJL(C127604zc.this.LJIILL(), "check_effect_func_event", C76800UCe.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AnonymousClass533
            public final void LIZIZ(AnonymousClass523 funcItem) {
                C1284452i LJIJ;
                C50N value;
                NLETrack nLETrack;
                NLETrackSlot nLETrackSlot;
                C1284452i LJIJ2;
                C58D c58d;
                C58D c58d2;
                o.LJIIIZ(funcItem, "funcItem");
                String str = funcItem.LJ;
                Objects.requireNonNull(str);
                boolean z = false;
                switch (str.hashCode()) {
                    case -459287747:
                        if (!str.equals("bottom_item_root_effects")) {
                            return;
                        }
                        C127604zc.this.LJIILL().getPlayer().pause();
                        if (!(!C124574uj.LJIILIIL(C79057V0z.LJJI(C127604zc.this.LJIILL())).isEmpty()) || AnonymousClass515.LIZ()) {
                            return;
                        }
                        C1284452i LJIJ3 = C127604zc.this.LJIJ();
                        if (LJIJ3 != null) {
                            LJIJ3.LJIJJLI(TrackState.VIDEOEFFECT);
                        }
                        C58D LJIL = C127604zc.this.LJIL();
                        if (LJIL != null) {
                            LJIL.showOrHideNullAudioTrack(false);
                        }
                        C58D LJIL2 = C127604zc.this.LJIL();
                        if (LJIL2 == null) {
                            return;
                        }
                        LJIL2.showOrHideNullEffectTrack(false);
                        return;
                    case -143690230:
                        if (!str.equals("bottom_item_root_sound")) {
                            return;
                        }
                        C127604zc.this.LJIILL().getPlayer().pause();
                        if (!AnonymousClass515.LIZ()) {
                            VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
                            if (LJJIIZ == null || !LJJIIZ.creativeModel.soundEffectInfoModel.enableStatus) {
                                VecNLETrackSPtr tracks = C79057V0z.LJJI(C127604zc.this.LJIILL()).getTracks();
                                o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
                                Iterator<NLETrack> it = tracks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        nLETrack = it.next();
                                        NLETrack it2 = nLETrack;
                                        if (C79057V0z.LJJIJIL(it2) == EnumC123864ta.AUDIO) {
                                            o.LJIIIIZZ(it2, "it");
                                            if (!C124574uj.LJJJJIZL(it2)) {
                                            }
                                        }
                                    } else {
                                        nLETrack = null;
                                    }
                                }
                                NLETrack nLETrack2 = nLETrack;
                                if (nLETrack2 != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILLIIL())) != null && (LJIJ2 = C127604zc.this.LJIJ()) != null) {
                                    C1284452i.LJIJ(LJIJ2, nLETrackSlot, null, false, 30);
                                }
                            }
                            C1284452i LJIJ4 = C127604zc.this.LJIJ();
                            if (LJIJ4 != null) {
                                LJIJ4.LJIJJLI(TrackState.AUDIO);
                            }
                            C1284452i LJIJ5 = C127604zc.this.LJIJ();
                            if (LJIJ5 != null && (c58d2 = LJIJ5.LJLIL) != null) {
                                c58d2.showOrHideNullAudioTrack(C124604um.LJIIIZ(C127604zc.this.LJIILL()));
                            }
                            C1284452i LJIJ6 = C127604zc.this.LJIJ();
                            if (LJIJ6 != null && (c58d = LJIJ6.LJLIL) != null) {
                                c58d.showOrHideNullEffectTrack(false);
                            }
                        }
                        VideoPublishEditModel LJJIIZ2 = C127604zc.LJJIIZ();
                        if (LJJIIZ2 == null) {
                            return;
                        }
                        C5QW.LJIJ(LJJIIZ2, C127604zc.this.LJIILL(), "click_button");
                        return;
                    case 283352715:
                        if (!str.equals("bottom_item_root_overlay")) {
                            return;
                        }
                        EditorProContext LJIILL = C127604zc.this.LJIILL();
                        if (!C52B.LJFF(C79057V0z.LJIJJLI(LJIILL) * 1000, LJIILL)) {
                            return;
                        }
                        C127604zc.this.LJIILL().getPlayer().pause();
                        if (!AnonymousClass515.LIZ() && C124574uj.LJIJ(C79057V0z.LJJI(C127604zc.this.LJIILL())) > 0) {
                            InterfaceC1278950f LJIJJ = C127604zc.this.LJIJJ();
                            if (LJIJJ != null) {
                                LJIJJ.k6("video_material");
                            }
                            C1284452i LJIJ7 = C127604zc.this.LJIJ();
                            if (LJIJ7 != null) {
                                LJIJ7.LJIJJLI(TrackState.PIP);
                            }
                            C58D LJIL3 = C127604zc.this.LJIL();
                            if (LJIL3 != null) {
                                LJIL3.showOrHideNullAudioTrack(false);
                            }
                            C58D LJIL4 = C127604zc.this.LJIL();
                            if (LJIL4 != null) {
                                LJIL4.showOrHideNullEffectTrack(false);
                            }
                        }
                        VideoPublishEditModel LJJIIZ3 = C127604zc.LJJIIZ();
                        if (LJJIIZ3 == null) {
                            return;
                        }
                        EditorProContext editorContext = C127604zc.this.LJIILL();
                        o.LJIIIZ(editorContext, "editorContext");
                        FMX.LJIIL("click_overlay_tab", C5QW.LJFF(LJJIIZ3, editorContext).LIZ);
                        return;
                    case 2073146799:
                        if (!str.equals("bottom_item_root_edit")) {
                            return;
                        }
                        C127604zc.this.LJIILL().getPlayer().pause();
                        C1284452i LJIJ8 = C127604zc.this.LJIJ();
                        if (LJIJ8 != null) {
                            EnumC127354zD style = EnumC127354zD.LINE;
                            long curTimeStamp = LJIJ8.LJLIL.getCurTimeStamp();
                            o.LJIIIZ(style, "style");
                            NLETrack nLETrack3 = (NLETrack) LJIJ8.LJLILLLLZI.LLIIIZ.getValue();
                            if (nLETrack3 != null) {
                                Iterator<NLETrackSlot> it3 = nLETrack3.LJIILLIIL().iterator();
                                int i = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        NLETrackSlot next = it3.next();
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            NLETrackSlot nLETrackSlot2 = next;
                                            long j = 1000;
                                            long startTime = nLETrackSlot2.getStartTime() / j;
                                            if (curTimeStamp <= nLETrackSlot2.getMeasuredEndTime() / j && startTime <= curTimeStamp) {
                                                LJIJ8.LJLILLLLZI.qv0(new C1279550l(true, nLETrack3, nLETrackSlot2, Integer.valueOf(i), style, null, z, z, z, 480), false);
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            C47261Igj.LJJJJJ();
                                            throw null;
                                        }
                                    } else if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, Boolean.FALSE)).booleanValue() && (value = LJIJ8.LJLILLLLZI.LLILIL.getValue()) != null) {
                                        long j2 = 1000;
                                        long j3 = value.LJLILLLLZI / j2;
                                        if (curTimeStamp <= value.LJLIL / j2 && j3 <= curTimeStamp) {
                                            LJIJ8.LJLILLLLZI.qv0(new C1279550l(true, nLETrack3, ((InterfaceC1289354f) LJIJ8.LJZ.getValue()).LIZLLL(), Integer.valueOf(nLETrack3.LJIILL().size()), style, null, z, z, z, 480), false);
                                        }
                                    }
                                }
                            }
                        }
                        C1284452i LJIJ9 = C127604zc.this.LJIJ();
                        if (LJIJ9 != null) {
                            LJIJ9.LJIJJLI(TrackState.NORMAL);
                        }
                        C58D LJIL5 = C127604zc.this.LJIL();
                        if (LJIL5 != null) {
                            LJIL5.showOrHideNullAudioTrack(C124604um.LJIIIZ(C127604zc.this.LJIILL()));
                        }
                        C58D LJIL6 = C127604zc.this.LJIL();
                        if (LJIL6 != null) {
                            LJIL6.showOrHideNullEffectTrack(false);
                        }
                        if (C79057V0z.LJIJJLI(C127604zc.this.LJIILL()) * 1000 > C127604zc.this.LJIILL().getMainTrack().getMeasuredEndTime() && (LJIJ = C127604zc.this.LJIJ()) != null) {
                            LJIJ.LJIIZILJ(C127604zc.this.LJIILL().getMainTrack());
                        }
                        VideoPublishEditModel LJJIIZ4 = C127604zc.LJJIIZ();
                        if (LJJIIZ4 == null) {
                            return;
                        }
                        EditorProContext editorContext2 = C127604zc.this.LJIILL();
                        o.LJIIIZ(editorContext2, "editorContext");
                        C43045Guv.LIZIZ(new C5QY(LJJIIZ4, editorContext2, true, true));
                        return;
                    case 2073595090:
                        if (!str.equals("bottom_item_root_text")) {
                            return;
                        }
                        C127604zc.this.LJIILL().getPlayer().pause();
                        if (!AnonymousClass515.LIZ()) {
                            InterfaceC1278950f LJIJJ2 = C127604zc.this.LJIJJ();
                            if (LJIJJ2 != null) {
                                LJIJJ2.k6("text_sticker_material");
                            }
                            C1284452i LJIJ10 = C127604zc.this.LJIJ();
                            if (LJIJ10 != null) {
                                LJIJ10.LJIJJLI(TrackState.TEXT);
                            }
                            C58D LJIL7 = C127604zc.this.LJIL();
                            if (LJIL7 != null) {
                                LJIL7.showOrHideNullAudioTrack(false);
                            }
                            C58D LJIL8 = C127604zc.this.LJIL();
                            if (LJIL8 != null) {
                                LJIL8.showOrHideNullEffectTrack(false);
                            }
                        }
                        VideoPublishEditModel LJJIIZ5 = C127604zc.LJJIIZ();
                        if (LJJIIZ5 == null) {
                            return;
                        }
                        C5QW.LJIJJ(LJJIIZ5, C127604zc.this.LJIILL(), "click_button");
                        return;
                    default:
                        return;
                }
            }

            @Override // X.AnonymousClass533
            public final void LIZJ(AnonymousClass523 anonymousClass523) {
                String str;
                C1284452i LJIJ;
                if (anonymousClass523 != null) {
                    str = anonymousClass523.LJ;
                } else {
                    str = null;
                }
                if (!o.LJ(str, "bottom_item_root_edit") && (LJIJ = C127604zc.this.LJIJ()) != null) {
                    C1284452i.LJIL(LJIJ, false, 3);
                }
            }
        });
        c50q.LJIIJJI(new InterfaceC127724zo() { // from class: X.4zh
            @Override // X.InterfaceC127724zo
            public final boolean LIZ(String str) {
                NLETrack selectedTrack;
                boolean z;
                NLETrackSlot selectedTrackSlot = C127604zc.this.LJIILL().getSelectedTrackSlot();
                if (selectedTrackSlot == null || (selectedTrack = C127604zc.this.LJIILL().getSelectedTrack()) == null) {
                    return false;
                }
                if (C78596Usy.LJJIIJZLJL(C79057V0z.LJJI(C127604zc.this.LJIILL()), selectedTrackSlot.getUUID()) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (C127644zg.LIZ() && C127604zc.this.LLIIIL && !z) {
                    c50q.LJFF();
                    return true;
                }
                if (!C127644zg.LIZIZ() || selectedTrack.LJIIJ() || !o.LJ(str, "root_item") || z) {
                    return false;
                }
                c50q.LJFF();
                return true;
            }
        });
    }

    public final void LJJIJIIJI(InterfaceC1278950f interfaceC1278950f) {
        MutableLiveData LJII = C79057V0z.LJII(LJIILL(), "selected_track_slot_event");
        if (LJII != null) {
            LJII.observe(this.LJLLLLLL, new AObserverS66S0200000_2(this, interfaceC1278950f, 14));
        }
        InterfaceC1278950f LJIJJ = LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.iW(new C1278650c(this));
        }
    }

    public final void LJJIJIIJIL(final C58D c58d) {
        final C127774zt c127774zt = new C127774zt(this, c58d);
        C1284452i LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LJLIL.setOnDropClick(new AqS168S0100000_2(this, 350));
        }
        C1284452i LJIJ2 = LJIJ();
        if (LJIJ2 != null) {
            LJIJ2.LJLZ = new AqS152S0100000_2(this, 603);
        }
        C1284452i LJIJ3 = LJIJ();
        if (LJIJ3 != null) {
            LJIJ3.LJLLI = new InterfaceC1278550b() { // from class: X.50P
                public String LIZ = "";

                @Override // X.InterfaceC1278550b
                public final void LIZIZ() {
                    VideoPublishEditModel LJJIIZ;
                    if (!((Boolean) C79057V0z.LJJIII(this.LJIILL(), "event_open_audio_record", Boolean.FALSE)).booleanValue() && (LJJIIZ = C127604zc.LJJIIZ()) != null) {
                        C127604zc c127604zc = this;
                        ((AudioRecordActivityViewModel) c127604zc.LLD.getValue()).lv0(c127604zc.LJIILL(), LJJIIZ, 1000L);
                    }
                }

                @Override // X.InterfaceC1278550b
                public final void LIZLLL() {
                    C79057V0z.LJJJJL(this.LJIILL(), "status_show_null_audio_track", Boolean.valueOf(C124604um.LJIIIZ(this.LJIILL())));
                    C79057V0z.LJJJJL(this.LJIILL(), "update_status_null_effect_track", C76800UCe.LIZ);
                }

                @Override // X.InterfaceC1278550b
                public final void LIZJ(NLETrackSlot slot) {
                    AnonymousClass525 LJI;
                    AnonymousClass525 LJI2;
                    AnonymousClass525 LJI3;
                    o.LJIIIZ(slot, "slot");
                    NLETrack trackBySlot = C79057V0z.LJJI(this.LJIILL()).getTrackBySlot(slot);
                    if (trackBySlot != null) {
                        C127604zc c127604zc = this;
                        if (C124574uj.LJJJLIIL(trackBySlot)) {
                            C1284452i LJIJ4 = c127604zc.LJIJ();
                            if (LJIJ4 != null) {
                                C1284452i.LJIL(LJIJ4, false, 3);
                            }
                            C1284452i LJIJ5 = c127604zc.LJIJ();
                            if (LJIJ5 != null) {
                                LJIJ5.LJIJJLI(TrackState.TEXT);
                            }
                            C50Q LJIILLIIL = c127604zc.LJIILLIIL();
                            if (LJIILLIIL != null && (LJI3 = LJIILLIIL.LJI()) != null) {
                                LJI3.LJII("bottom_item_root_text");
                            }
                            VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
                            if (LJJIIZ != null) {
                                C5QW.LJIJJ(LJJIIZ, c127604zc.LJIILL(), "click_track");
                                C5QW.LJJIZ(LJJIIZ, c127604zc.LJIILL(), "click_track");
                                return;
                            }
                            return;
                        }
                        if (C124574uj.LJJIJLIJ(trackBySlot)) {
                            C1284452i LJIJ6 = c127604zc.LJIJ();
                            if (LJIJ6 != null) {
                                C1284452i.LJIL(LJIJ6, false, 3);
                            }
                            C1284452i LJIJ7 = c127604zc.LJIJ();
                            if (LJIJ7 != null) {
                                LJIJ7.LJIJJLI(TrackState.AUDIO);
                            }
                            C50Q LJIILLIIL2 = c127604zc.LJIILLIIL();
                            if (LJIILLIIL2 != null && (LJI2 = LJIILLIIL2.LJI()) != null) {
                                LJI2.LJII("bottom_item_root_sound");
                            }
                            VideoPublishEditModel LJJIIZ2 = C127604zc.LJJIIZ();
                            if (LJJIIZ2 == null) {
                                return;
                            }
                            C5QW.LJIJ(LJJIIZ2, c127604zc.LJIILL(), "click_track");
                            C5QW.LJJIJLIJ(LJJIIZ2, c127604zc.LJIILL(), "click_track");
                            return;
                        }
                        if (!C124574uj.LJJJIL(trackBySlot)) {
                            return;
                        }
                        C1284452i LJIJ8 = c127604zc.LJIJ();
                        if (LJIJ8 != null) {
                            C1284452i.LJIL(LJIJ8, false, 3);
                        }
                        C1284452i LJIJ9 = c127604zc.LJIJ();
                        if (LJIJ9 != null) {
                            LJIJ9.LJIJJLI(TrackState.VIDEOEFFECT);
                        }
                        C50Q LJIILLIIL3 = c127604zc.LJIILLIIL();
                        if (LJIILLIIL3 == null || (LJI = LJIILLIIL3.LJI()) == null) {
                            return;
                        }
                        LJI.LJII("bottom_item_root_effects");
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:220:0x01a8, code lost:
                
                    if (r0 == false) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
                
                    if (r26 == X.EnumC1280050q.NORMAL) goto L73;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x02e3  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x02c1  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x02c7  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x02cd  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x02d3  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x02d6  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x02dc  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x02df  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x0263  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0276  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0339 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:179:0x0372  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x03b4 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:202:0x03ec A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0400  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x032c  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
                @Override // X.InterfaceC1278550b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.ies.nle.editor_jni.NLETrack r24, com.bytedance.ies.nle.editor_jni.NLETrackSlot r25, X.EnumC1280050q r26, boolean r27, boolean r28) {
                    /*
                        Method dump skipped, instructions count: 1058
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C50P.LIZ(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.50q, boolean, boolean):void");
                }
            };
            LJIJ3.LJLL = c127774zt;
            LJIJ3.LJLIL.setTrackPanelActionListener(c127774zt);
        }
    }

    @Override // X.C127764zs, X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onExitEditPage(boolean z) {
        super.onExitEditPage(z);
        this.LLFF = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.4zd] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.4z4] */
    public C127604zc(final C29S activity, EditorProScene rootScene) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(rootScene, "rootScene");
        this.LJLLLLLL = rootScene;
        this.LJLZ = C36636EZk.LIZ.plus(T2R.LJIIJJI());
        this.LJZ = C221108m2.LIZIZ(C125734wb.LJLIL);
        this.LJZI = C221108m2.LIZIZ(AnonymousClass500.LJLIL);
        this.LJZL = C221108m2.LIZIZ(AnonymousClass507.LJLIL);
        this.LL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 607));
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 567));
        this.LLF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 598));
        this.LLFF = true;
        this.LLFFF = new ORV<>();
        this.LLFZ = 1.0d;
        this.LLIIIZ = new NLEEditorListener() { // from class: X.4zd
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                try {
                    System.currentTimeMillis();
                    C124864vC.LIZJ(this.LJIJI(), activity);
                    C127604zc c127604zc = this;
                    if (c127604zc.LLFF) {
                        c127604zc.LJJIJL();
                        C120864ok.LIZJ(C79057V0z.LJJ(this.LJIILL()));
                        C52B.LIZIZ(this.LJIJI());
                        AqS152S0100000_2 aqS152S0100000_2 = this.LLIFFJFJJ;
                        if (aqS152S0100000_2 != null) {
                            aqS152S0100000_2.invoke();
                        }
                        C79057V0z.LJJJJL(this.LJIILL(), "check_effect_func_event", C76800UCe.LIZ);
                        C127604zc c127604zc2 = this;
                        c127604zc2.LLFF = false;
                        c127604zc2.LJJIZ();
                    }
                    InterfaceC127634zf LJJIIZI = this.LJJIIZI();
                    if (LJJIIZI != null) {
                        LJJIIZI.LJZ(this.LJIJI());
                    }
                } catch (Exception e) {
                    H7C.LIZLLL(C5HX.LIZIZ, H7C.LJ(e), null, null, 12);
                }
            }
        };
        this.LLIIJI = new InterfaceC126664y6() { // from class: X.4z4
            public String LIZ;
            public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C126834yN.LJLIL);

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC126664y6
            public final void LIZ(EnumC126674y7 op) {
                C1279550l c1279550l;
                o.LJIIIZ(op, "op");
                C1284452i LJIJ = this.LJIJ();
                if (LJIJ == null || (c1279550l = (C1279550l) LJIJ.LJLILLLLZI.LLIILZL.getValue()) == null || c1279550l.LJ == null) {
                    EnumC127354zD enumC127354zD = EnumC127354zD.LINE;
                }
                EnumC127354zD enumC127354zD2 = EnumC127354zD.NONE;
                if (op == EnumC126674y7.UNDO) {
                    LIZJ(op);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.EnumC126674y7 r15) {
                /*
                    Method dump skipped, instructions count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C127264z4.LIZJ(X.4y7):void");
            }

            @Override // X.InterfaceC126664y6
            public final void LIZIZ(EnumC126674y7 op, boolean z) {
                TrackState trackState;
                C1280250s value;
                C50Q LJIILLIIL;
                C53H LJIILIIL;
                o.LJIIIZ(op, "op");
                if (this.LJIILL().getSelectedTrackSlot() != null && (LJIILLIIL = this.LJIILLIIL()) != null && (LJIILIIL = LJIILLIIL.LJIILIIL()) != null) {
                    LJIILIIL.LIZJ();
                }
                if (op == EnumC126674y7.REDO) {
                    LIZJ(op);
                }
                C1284452i LJIJ = this.LJIJ();
                if (LJIJ != null && (value = LJIJ.LJLILLLLZI.LLILL.getValue()) != null) {
                    trackState = value.LJLIL;
                } else {
                    trackState = null;
                }
                if (trackState == TrackState.NORMAL) {
                    AqS152S0100000_2 aqS152S0100000_2 = this.LLIFFJFJJ;
                    if (aqS152S0100000_2 != null) {
                        aqS152S0100000_2.invoke();
                    }
                    C79057V0z.LJJJJL(this.LJIILL(), "check_effect_func_event", C76800UCe.LIZ);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC127684zk
    public final boolean LJIIJ(int i, Intent intent) {
        Boolean bool;
        Boolean bool2;
        boolean z;
        AqS152S0100000_2 aqS152S0100000_2;
        List LIZ;
        AnonymousClass525 LJI;
        NLETrackSlot selectedTrackSlot;
        W8E.LJII().LJI().LIZ();
        int[] t5 = LJIILL().getPlayer().t5();
        Boolean bool3 = null;
        if (i != 3001) {
            if (i != 3002) {
                if (i == 3008 && (LIZ = C127804zw.LIZ(this.LJLIL, intent, null)) != null && !LIZ.isEmpty()) {
                    EditMedia editMedia = (EditMedia) ListProtector.get(LIZ, 0);
                    if (ujb.o.LJJJJ(editMedia.getPath(), ".mp4", false) && VEUtils.isCanImport(editMedia.getPath()) != 0) {
                        H7C.LIZLLL(C5HU.LIZIZ, null, "The selected material is not supported for import", null, 10);
                    } else {
                        InterfaceC125004vQ editor = LJIILL().getEditor();
                        C1284452i LJIJ = LJIJ();
                        if (LJIJ != null) {
                            Boolean bool4 = (Boolean) LJIJ.LJLILLLLZI.LLIIL.getValue();
                            if (bool4 == null) {
                                bool4 = Boolean.FALSE;
                            }
                            bool3 = Boolean.valueOf(bool4.booleanValue());
                        }
                        editor.LJIJI(LIZ, bool3, new AqS152S0100000_2(this, 561));
                        FrameCacheViewModel.jv0((FrameCacheViewModel) this.LL.getValue());
                        C50Q LJIILLIIL = LJIILLIIL();
                        if (LJIILLIIL != null && (LJI = LJIILLIIL.LJI()) != null && (selectedTrackSlot = LJIILL().getSelectedTrackSlot()) != null) {
                            if (!C124574uj.LJJIJIIJI(selectedTrackSlot)) {
                                LJI.LJIIIIZZ("bottom_item_edit_volume", false);
                            } else {
                                LJI.LJFF("bottom_item_edit_volume");
                            }
                            if (C124574uj.LJJJJ(selectedTrackSlot)) {
                                LJI.LJIIIIZZ("bottom_item_edit_speed", false);
                            } else {
                                LJI.LJFF("bottom_item_edit_speed");
                            }
                        }
                        z = true;
                    }
                }
                z = false;
                break;
            }
            VideoPublishEditModel LJJIIZ = LJJIIZ();
            if (LJJIIZ != null) {
                C5QW.LJIIJJI("from_photo_page", "pip", null, LJJIIZ, LJIILL());
            }
            List LIZ2 = C127804zw.LIZ(this.LJLIL, intent, null);
            if (LIZ2 != null && LIZ2.size() > 0) {
                EditMedia editMedia2 = (EditMedia) ListProtector.get(LIZ2, 0);
                if (ujb.o.LJJJJ(editMedia2.getPath(), ".mp4", false) && VEUtils.isCanImport(editMedia2.getPath()) != 0) {
                    C132105Gk.LIZJ("The selected material is not supported for import");
                } else {
                    C1284452i LJIJ2 = LJIJ();
                    if (LJIJ2 != null) {
                        LJIJ2.LJIJJLI(TrackState.PIP);
                    }
                    boolean isEmpty = C124574uj.LJIJI(C79057V0z.LJJI(LJIILL())).isEmpty();
                    long H9 = LJIILL().getPlayer().H9() * 1000;
                    NLETrackSlot LJIIJ = LJIILL().getEditor().LJIIJ(editMedia2, new C124884vE(Long.valueOf(H9), (Long) C5BA.LIZ(EnumC127484zQ.PICTURE_TRACK_TIME, 4000L), null, null, 28));
                    String libraryId = editMedia2.getLibraryId();
                    if (libraryId == null || libraryId.length() == 0) {
                        if (LJIIJ != null) {
                            LJIIJ.setExtra("is_editorpro_add_video_material", "1");
                        }
                    } else if (LJIIJ != null) {
                        LJIIJ.setExtra("is_editorpro_add_library_material", "1");
                    }
                    String libraryId2 = editMedia2.getLibraryId();
                    if (libraryId2 != null && LJIIJ != null) {
                        LJIIJ.setExtra("library_id", libraryId2);
                    }
                    if (isEmpty && (aqS152S0100000_2 = this.LLIFFJFJJ) != null) {
                        aqS152S0100000_2.invoke();
                    }
                    C58D LJIL = LJIL();
                    if (LJIL != null) {
                        LJIL.showOrHideNullAudioTrack(false);
                    }
                    C58D LJIL2 = LJIL();
                    if (LJIL2 != null) {
                        LJIL2.showOrHideNullEffectTrack(false);
                    }
                    InterfaceC1278950f LJIJJ = LJIJJ();
                    if (LJIJJ != null) {
                        LJIJJ.k6("video_material");
                    }
                    InterfaceC1278950f LJIJJ2 = LJIJJ();
                    if (LJIJJ2 != null) {
                        LJIJJ2.Z8(H9, false);
                    }
                    InterfaceC127634zf LJJIIZI = LJJIIZI();
                    if (LJJIIZI != null) {
                        LJJIIZI.Cv(H9);
                    }
                    C1284452i LJIJ3 = LJIJ();
                    if (LJIJ3 != null) {
                        o.LJI(LJIIJ);
                        C1284452i.LJIJ(LJIJ3, LJIIJ, null, false, 30);
                    }
                    LJIILL().getPlayer().M9(H9);
                    z = true;
                }
            } else {
                C58D LJIL3 = LJIL();
                if (LJIL3 != null) {
                    LJIL3.showOrHideNullAudioTrack(C124604um.LJIIIZ(LJIILL()));
                }
                C1284452i LJIJ4 = LJIJ();
                if (LJIJ4 != null) {
                    LJIJ4.LJIJJLI(TrackState.NORMAL);
                }
            }
            z = false;
            break;
        }
        VideoPublishEditModel LJJIIZ2 = LJJIIZ();
        if (LJJIIZ2 != null) {
            bool = null;
            C5QW.LJIIJJI("from_photo_page", "video", null, LJJIIZ2, LJIILL());
        } else {
            bool = null;
        }
        List<EditMedia> LIZ3 = C127804zw.LIZ(this.LJLIL, intent, Integer.valueOf(LJIJJLI()));
        if (LIZ3 != null && LIZ3.size() > 0) {
            for (EditMedia editMedia3 : LIZ3) {
                if (ujb.o.LJJJJ(editMedia3.getPath(), ".mp4", false) && VEUtils.isCanImport(editMedia3.getPath()) != 0) {
                    C132105Gk.LIZJ("The selected material is not supported for import");
                }
            }
            if (AnonymousClass504.LIZIZ) {
                C43045Guv.LIZIZ(new AqS149S0200000_2((List) LIZ3, (List<EditMedia>) this, (C127604zc) 60));
            }
            long longValue = ((Number) C5BA.LIZ(EnumC127484zQ.PICTURE_TRACK_TIME, 4000L)).longValue();
            int LJIJJLI = LJIJJLI();
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC125004vQ editor2 = LJIILL().getEditor();
            C1284452i LJIJ5 = LJIJ();
            if (LJIJ5 != null) {
                Boolean bool5 = (Boolean) LJIJ5.LJLILLLLZI.LLIIL.getValue();
                if (bool5 == null) {
                    bool5 = Boolean.FALSE;
                }
                bool2 = Boolean.valueOf(bool5.booleanValue());
            } else {
                bool2 = bool;
            }
            editor2.LJIJ(LIZ3, new C124884vE(bool, Long.valueOf(longValue), Integer.valueOf(LJIJJLI), bool2, 17));
            FMX.LJIIL("acc_advanced_edit_add_video_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_add_video_clip_duration").LIZ);
            FrameCacheViewModel.jv0((FrameCacheViewModel) this.LL.getValue());
            for (EditMedia editMedia4 : LIZ3) {
                if (LJIJJLI >= LJIILL().getMainTrack().LJIILL().size()) {
                    break;
                }
                NLETrackSlot LJIILIIL = LJIILL().getMainTrack().LJIILIIL(LJIJJLI);
                String libraryId3 = editMedia4.getLibraryId();
                if (libraryId3 == null || libraryId3.length() == 0) {
                    LJIILIIL.setExtra("is_editorpro_add_video_material", "1");
                } else {
                    LJIILIIL.setExtra("is_editorpro_add_library_material", "1");
                    LJIILIIL.setExtra("library_id", editMedia4.getLibraryId());
                }
                String libraryId4 = editMedia4.getLibraryId();
                if (libraryId4 != null) {
                    LJIILIIL.setExtra("library_id", libraryId4);
                }
                LJIJJLI++;
            }
            C5QW.LIZ(C79057V0z.LJJI(LJIILL()), "enter_add_video_time", "add_video_material_duration");
            C5DC c5dc = this.LLIIIILZ;
            if (c5dc != null) {
                c5dc.LJ(true);
            }
            z = true;
        }
        z = false;
        break;
        if (C127694zl.LIZ && t5 != null) {
            LJIILL().getPlayer().LIZ(t5[0], t5[1], t5[2], t5[3]);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(long r11, com.bytedance.ies.nle.editor_jni.NLEEditor r13, long r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127604zc.LJJIJIL(long, com.bytedance.ies.nle.editor_jni.NLEEditor, long):void");
    }
}
