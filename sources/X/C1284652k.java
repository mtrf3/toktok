package X;

import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.52k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1284652k extends AbstractC56012Ht<C2L2, C17N> {
    public C58D LJLIL;
    public C1284452i LJLILLLLZI;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackPanelScene#");
        LIZ.append(UUID.randomUUID());
        X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C58D c58d = this.LJLIL;
        if (c58d != null) {
            c58d.release();
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        Activity requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C58D c58d = new C58D(requireSceneContext, (C29S) requireActivity, null, 0, 12, 0 == true ? 1 : 0);
        this.LJLIL = c58d;
        c58d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c58d.init(inflater);
        TrackPanelViewModel trackPanelViewModel = (TrackPanelViewModel) C5G0.LIZ(TTrackPanelViewModel.class);
        final C1284452i c1284452i = new C1284452i(c58d, trackPanelViewModel);
        C5G5.LIZ(c1284452i);
        MutableLiveData LJII = C79057V0z.LJII(c1284452i.LJLJL, "event_user_guide_intercepted");
        if (LJII != null) {
            LJII.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 248));
        }
        c58d.setInnerListener(c1284452i.LLFF);
        ((C1303959v) c58d._$_findCachedViewById(R.id.jca)).setScaleGestureDetector(new C86941YAf(c1284452i.LLFFF));
        ((C1297357h) c58d._$_findCachedViewById(R.id.gp3)).setMultiTrackListener(c1284452i.LLFII);
        ((C1303859u) c58d._$_findCachedViewById(R.id.kn7)).setTrackGroupActionListener(c1284452i.LLFZ);
        ((C1303859u) c58d._$_findCachedViewById(R.id.kn7)).setCallback((C59G) c1284452i.LLI.getValue());
        ((C1303959v) c58d._$_findCachedViewById(R.id.jca)).setOnBlankClickListener(new ACListenerS22S0100000_2(c1284452i, 124));
        C16880lQ.LJIJI((TextView) c58d._$_findCachedViewById(R.id.lwt), new ACListenerS22S0100000_2(c1284452i, 125));
        c1284452i.LJLJLLL = C1291054w.LJ().LJJJJZ;
        trackPanelViewModel.LLIIIZ.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 255));
        C146165oS.LIZIZ(trackPanelViewModel.LLILIL).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 256));
        trackPanelViewModel.LLILII.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 257));
        trackPanelViewModel.LLILLJJLI.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 258));
        trackPanelViewModel.LLILLL.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 259));
        trackPanelViewModel.LLILZ.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 260));
        C146165oS.LIZIZ(trackPanelViewModel.LLIIL).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 261));
        trackPanelViewModel.LLILZIL.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 262));
        C146165oS.LIZIZ(trackPanelViewModel.LLIILII).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 263));
        C146165oS.LIZIZ(trackPanelViewModel.LLILLIZIL).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 249));
        C146165oS.LIZIZ(trackPanelViewModel.LLILL).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, LiveCoverMinSizeSetting.DEFAULT));
        trackPanelViewModel.LLIIJLIL.observe(c1284452i.LJIILL(), new Observer() { // from class: X.55u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TrackState trackState;
                ArrayList<C1280750x> arrayList;
                ArrayList<OSZ<Long, Float>> arrayList2;
                C5A5 c5a5;
                View view;
                Boolean it = (Boolean) obj;
                o.LJIIIIZZ(it, "it");
                if (it.booleanValue() && C1291054w.LJ().LJJJJZI) {
                    C1280250s value = C1284452i.this.LJLILLLLZI.LLILL.getValue();
                    if (value != null) {
                        trackState = value.LJLIL;
                    } else {
                        trackState = null;
                    }
                    if (trackState != TrackState.NORMAL || (arrayList = C1284452i.this.LJLILLLLZI.LLIIIJ) == null || arrayList.isEmpty()) {
                        ((C1303859u) C1284452i.this.LJLIL._$_findCachedViewById(R.id.kn7)).LJIILL(false);
                        return;
                    }
                    InterfaceC65784Pro<Boolean> interfaceC65784Pro = C1284452i.this.LJLZ;
                    if (interfaceC65784Pro == null || interfaceC65784Pro.invoke().booleanValue()) {
                        ((C1303859u) C1284452i.this.LJLIL._$_findCachedViewById(R.id.kn7)).LJIILL(true);
                        C1303859u c1303859u = (C1303859u) C1284452i.this.LJLIL._$_findCachedViewById(R.id.kn7);
                        C130535Aj audioCollectionTrack = c1303859u.getAudioCollectionTrack();
                        java.util.Map<NLETrackSlot, C1301058s> segmentParams = c1303859u.LLIIIJ;
                        audioCollectionTrack.getClass();
                        o.LJIIIZ(segmentParams, "segmentParams");
                        LinkedHashMap linkedHashMap = (LinkedHashMap) segmentParams;
                        java.util.Set keySet = linkedHashMap.keySet();
                        if ((keySet instanceof Collection) && keySet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = keySet.iterator();
                        while (it2.hasNext()) {
                            if (C124574uj.LJJIJL((NLETrackSlot) it2.next())) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    NLETrackSlot nLETrackSlot = (NLETrackSlot) entry.getKey();
                                    if (!C124574uj.LJJIJL(nLETrackSlot) || linkedHashMap.get(nLETrackSlot) == null) {
                                        arrayList2 = new ArrayList<>();
                                    } else {
                                        C1301058s c1301058s = (C1301058s) linkedHashMap.get(nLETrackSlot);
                                        if (c1301058s == null || (c5a5 = c1301058s.LJLILLLLZI) == null || (view = c5a5.getView()) == null) {
                                            arrayList2 = new ArrayList<>();
                                        } else if (!(view instanceof C130545Ak)) {
                                            arrayList2 = new ArrayList<>();
                                        } else {
                                            arrayList2 = ((C130545Ak) view).getWavePointsDataFromCache();
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        String uuid = ((NLENode) entry.getKey()).getUUID();
                                        o.LJIIIIZZ(uuid, "entry.key.uuid");
                                        linkedHashMap2.put(uuid, arrayList2);
                                    } else {
                                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZ, null, new C131095Cn(C113554cx.LJJLIL(segmentParams), audioCollectionTrack, null), 2);
                                        return;
                                    }
                                }
                                audioCollectionTrack.LIZ(segmentParams, linkedHashMap2);
                                return;
                            }
                        }
                        return;
                    }
                    ((C1303859u) C1284452i.this.LJLIL._$_findCachedViewById(R.id.kn7)).LJIILL(false);
                }
            }
        });
        trackPanelViewModel.LLIILZL.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 251));
        C146165oS.LIZIZ(trackPanelViewModel.LLIIZ).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 252));
        trackPanelViewModel.LLILZLL.observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 253));
        C146165oS.LIZIZ(trackPanelViewModel.LLIL).observe(c1284452i.LJIILL(), new AObserverS70S0100000_2(c1284452i, 254));
        this.LJLILLLLZI = c1284452i;
        return c58d;
    }
}
