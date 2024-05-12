package X;

import Y.AObserverS66S0200000_2;
import Y.ARunnableS13S0300000_2;
import Y.ARunnableS21S0200000_2;
import Y.IDLListenerS56S0200000_2;
import android.graphics.Canvas;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.IDqS181S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132005Ga extends C5HL {
    public static final float LLF = AnonymousClass564.LIZIZ(1.5f);
    public static final float LLFF = AnonymousClass564.LIZIZ(44.0f);
    public static final float LLFFF = AnonymousClass564.LIZIZ(1.0f);
    public final C5DC LJLJLLL;
    public IDqS181S0200000_2 LJLLILLLL;
    public AqS168S0100000_2 LJLLJ;
    public boolean LJLLL;
    public EditorProContext LJLLLL;
    public VideoPublishEditModel LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public final java.util.Map<String, C1551667c> LJLL = new ArrayMap();
    public final ArrayList<NLETrackSlot> LJLLI = new ArrayList<>();
    public String LJZI = "";
    public final List<InterfaceC65784Pro<C76800UCe>> LJZL = new ArrayList();
    public final C62822Ol8 LL = C221108m2.LIZIZ(C132235Gx.LJLIL);
    public final C135675Ud LLD = new C135675Ud(new C135695Uf(LLFFF, LLF, LLFF, 0, 0.0f, EnumC132905Jm.PREVIEW_PANEL_INTERNAL, 9739));

    @Override // X.C5HL, X.InterfaceC132875Jj
    public final float LJIIJJI() {
        return 1.0f;
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LJIILL() {
        super.LJIILL();
        this.LJZI = "";
    }

    @Override // X.C5HL, X.InterfaceC132875Jj
    public final EnumC132175Gr LJIJJLI() {
        return EnumC132175Gr.CLOCKWISE;
    }

    public C132005Ga(C5DC c5dc) {
        this.LJLJLLL = c5dc;
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLLL || ColorPickerFragment.LJZ) {
            return;
        }
        super.LIZ(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LIZIZ(NLEModel nleModel) {
        PreviewPanelViewModel previewPanelViewModel;
        String str;
        PreviewPanelViewModel previewPanelViewModel2;
        C1551667c c1551667c;
        MutableLiveData mutableLiveData;
        OSZ osz;
        NLENode nLENode;
        MutableLiveData<Boolean> mutableLiveData2;
        long j;
        o.LJIIIZ(nleModel, "nleModel");
        super.LIZIZ(nleModel);
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            this.LJLLI.clear();
            VecNLETrackSPtr tracks = nleModel.getTracks();
            o.LJIIIIZZ(tracks, "nleModel.tracks");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot slot = it3.next();
                    o.LJIIIIZZ(slot, "slot");
                    if (C124574uj.LJJJJZI(slot)) {
                        this.LJLLI.add(slot);
                    }
                }
            }
            H78.LIZ("TextMaterial -> updateView -> slotCache.size = " + this.LJLLI.size());
            if ((!this.LJLLI.isEmpty() || !((ArrayMap) this.LJLL).isEmpty()) && (previewPanelViewModel = this.LJLJI) != null) {
                OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(frameLayout);
                jv0.getSecond().floatValue();
                ArrayList<NLETrackSlot> arrayList2 = this.LJLLI;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator<NLETrackSlot> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(it4.next().getUUID());
                }
                Iterator it5 = ((ArrayMap) this.LJLL).entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    if (!arrayList3.contains(entry.getKey())) {
                        FrameLayout LJJIFFI = LJJIFFI(frameLayout);
                        if (LJJIFFI != null) {
                            C16880lQ.LJLLLL((View) entry.getValue(), LJJIFFI);
                        }
                        it5.remove();
                    }
                }
                if (this.LJLLI.size() > ((ArrayMap) this.LJLL).size()) {
                    ArrayList<NLETrackSlot> arrayList4 = this.LJLLI;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<NLETrackSlot> it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        NLETrackSlot next2 = it6.next();
                        if (((ArrayMap) this.LJLL).get(next2.getUUID()) != null) {
                            arrayList5.add(next2);
                        }
                    }
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        NLETrackSlot nLETrackSlot = (NLETrackSlot) it7.next();
                        C1551667c c1551667c2 = (C1551667c) ((ArrayMap) this.LJLL).get(nLETrackSlot.getUUID());
                        if (c1551667c2 != null) {
                            LJJIII(c1551667c2, nLETrackSlot, jv0);
                        }
                    }
                    ArrayList<NLETrackSlot> arrayList6 = this.LJLLI;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<NLETrackSlot> it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        NLETrackSlot next3 = it8.next();
                        if (((ArrayMap) this.LJLL).get(next3.getUUID()) == null) {
                            arrayList7.add(next3);
                        }
                    }
                    Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it9.next();
                        ActivityC45651qj activityC45651qj = this.LJLIL;
                        if (activityC45651qj == null) {
                            break;
                        }
                        C1551667c LIZJ = C5FC.LIZJ(activityC45651qj);
                        if (LIZJ != null) {
                            String uuid = nLETrackSlot2.getUUID();
                            o.LJIIIIZZ(uuid, "slot.uuid");
                            FrameLayout frameLayout2 = this.LJLILLLLZI;
                            if (frameLayout2 != null) {
                                FrameLayout LJJIFFI2 = LJJIFFI(frameLayout2);
                                if (LJJIFFI2 != null) {
                                    LJJIFFI2.addView(LIZJ);
                                }
                                ((ArrayMap) this.LJLL).put(uuid, LIZJ);
                            }
                            LJJIII(LIZJ, nLETrackSlot2, jv0);
                        }
                    }
                    H78.LIZ("TextMaterial -> updateView -> viewMap.size = " + ((ArrayMap) this.LJLL).size());
                } else {
                    if (this.LJLLI.size() == ((ArrayMap) this.LJLL).size()) {
                        PreviewPanelViewModel previewPanelViewModel3 = this.LJLJI;
                        if (previewPanelViewModel3 != null && (mutableLiveData2 = previewPanelViewModel3.LJLJL) != null && o.LJ(mutableLiveData2.getValue(), Boolean.TRUE)) {
                            Iterator<NLETrackSlot> it10 = this.LJLLI.iterator();
                            while (it10.hasNext()) {
                                NLETrackSlot next4 = it10.next();
                                C1551667c c1551667c3 = (C1551667c) ((ArrayMap) this.LJLL).get(next4.getUUID());
                                if (c1551667c3 != null) {
                                    if (AnonymousClass636.LJIIL(next4)) {
                                        long startTime = next4.getStartTime();
                                        long endTime = next4.getEndTime();
                                        EditorProContext editorProContext = this.LJLLLL;
                                        if (editorProContext != null) {
                                            j = C79057V0z.LJIJJLI(editorProContext);
                                        } else {
                                            j = 0;
                                        }
                                        long j2 = j * 1000;
                                        if (startTime <= j2 && j2 <= endTime) {
                                        }
                                    }
                                    LJJIII(c1551667c3, next4, jv0);
                                }
                            }
                        } else {
                            PreviewPanelViewModel previewPanelViewModel4 = this.LJLJI;
                            NLETrackSlot nLETrackSlot3 = null;
                            if (previewPanelViewModel4 != null && (mutableLiveData = previewPanelViewModel4.LJLLLL) != null && (osz = (OSZ) mutableLiveData.getValue()) != null && (nLENode = (NLENode) osz.getSecond()) != null) {
                                str = nLENode.getUUID();
                            } else {
                                str = null;
                            }
                            if (C78685UuP.LJJJZ(str) && (previewPanelViewModel2 = this.LJLJI) != null && !previewPanelViewModel2.LJZL) {
                                H78.LIZ("TextMaterial -> updateView -> previewPanelViewModel?.updateAllCaptionSlot == false");
                                Iterator<NLETrackSlot> it11 = this.LJLLI.iterator();
                                while (true) {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                    NLETrackSlot next5 = it11.next();
                                    if (o.LJ(next5.getUUID(), str)) {
                                        nLETrackSlot3 = next5;
                                        break;
                                    }
                                }
                                NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                                if (nLETrackSlot4 != null && (c1551667c = (C1551667c) ((ArrayMap) this.LJLL).get(str)) != null) {
                                    LJJIII(c1551667c, nLETrackSlot4, jv0);
                                }
                            } else {
                                Iterator<NLETrackSlot> it12 = this.LJLLI.iterator();
                                while (it12.hasNext()) {
                                    NLETrackSlot next6 = it12.next();
                                    C1551667c c1551667c4 = (C1551667c) ((ArrayMap) this.LJLL).get(next6.getUUID());
                                    if (c1551667c4 != null) {
                                        LJJIII(c1551667c4, next6, jv0);
                                    }
                                }
                            }
                        }
                    }
                    H78.LIZ("TextMaterial -> updateView -> viewMap.size = " + ((ArrayMap) this.LJLL).size());
                }
            }
        }
        Iterator it13 = ((ArrayList) this.LJZL).iterator();
        while (it13.hasNext()) {
            ((InterfaceC65784Pro) it13.next()).invoke();
        }
        ((ArrayList) this.LJZL).clear();
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LIZLLL(long j) {
        super.LIZLLL(j);
        Iterator<NLETrackSlot> it = this.LJLLI.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            if (next.getStartTime() <= j && next.getEndTime() >= j) {
                View view = (View) ((ArrayMap) this.LJLL).get(next.getUUID());
                if (view != null) {
                    view.setVisibility(0);
                }
            } else {
                View view2 = (View) ((ArrayMap) this.LJLL).get(next.getUUID());
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    @Override // X.InterfaceC132925Jo
    public final OSZ<Float, Float> LJI(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        if (((View) ((ArrayMap) this.LJLL).get(slot.getUUID())) != null) {
            return new OSZ<>(Float.valueOf((r5.getWidth() + 15.0f) / slot.getScale()), Float.valueOf((r5.getHeight() + 15.0f) / slot.getScale()));
        }
        return new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public final FrameLayout LJJIFFI(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.l4o);
        if (frameLayout2 == null) {
            FrameLayout frameLayout3 = this.LJLILLLLZI;
            if (frameLayout3 == null) {
                return null;
            }
            frameLayout2 = new FrameLayout(frameLayout.getContext());
            PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
            if (previewPanelViewModel != null) {
                OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(frameLayout3);
                frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams((int) jv0.getFirst().floatValue(), (int) jv0.getSecond().floatValue(), 17));
                frameLayout2.setId(R.id.l4o);
            } else {
                return frameLayout2;
            }
        }
        return frameLayout2;
    }

    @Override // X.InterfaceC132925Jo
    public final boolean LJII(NLETrack track, NLETrackSlot slot) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        if (track.LJIIZILJ() == EnumC123864ta.STICKER && C124574uj.LJJJJZI(slot) && !this.LJZ) {
            return true;
        }
        return false;
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LJIIL(ActivityC45651qj activity, C87230YLi viewParent) {
        MutableLiveData mutableLiveData;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewParent, "viewParent");
        super.LJIIL(activity, viewParent);
        EditorProContext.Companion.getClass();
        this.LJLLLL = C124994vP.LIZ();
        C135675Ud materialEditor = this.LLD;
        o.LJIIIZ(materialEditor, "materialEditor");
        this.LJLJJL = materialEditor;
        PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
        if (previewPanelViewModel != null && (mutableLiveData = previewPanelViewModel.LJLJJL) != null) {
            mutableLiveData.observe(C5G5.LIZIZ(), new AObserverS66S0200000_2(this, viewParent, 21));
        }
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LJIILJJIL(NLETrack track, NLETrackSlot slot) {
        ViewTreeObserver viewTreeObserver;
        Integer num;
        ViewTreeObserver viewTreeObserver2;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        if (AnonymousClass636.LJIIL(slot) && slot.hasExtra("is_editorpro_new_caption") && o.LJ(slot.getExtra("is_editorpro_new_caption"), "true")) {
            View view = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
            if (view != null) {
                view.postDelayed(new ARunnableS21S0200000_2(slot, this, 62), 50L);
            }
        }
        if (((Boolean) this.LL.getValue()).booleanValue()) {
            View view2 = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
            Integer num2 = null;
            if (view2 != null) {
                num = Integer.valueOf(view2.getMeasuredWidth());
            } else {
                num = null;
            }
            View view3 = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
            if (view3 != null) {
                num2 = Integer.valueOf(view3.getMeasuredHeight());
            }
            View view4 = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
            if (view4 == null) {
                return;
            }
            view4.measure(View.MeasureSpec.makeMeasureSpec(C143205jg.LJ(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(C143205jg.LIZLLL(), LiveLayoutPreloadThreadPriority.DEFAULT));
            int measuredWidth = view4.getMeasuredWidth();
            if (num != null && measuredWidth == num.intValue()) {
                int measuredHeight = view4.getMeasuredHeight();
                if (num2 != null && measuredHeight == num2.intValue()) {
                    super.LJIILJJIL(track, slot);
                    return;
                }
            }
            String uuid = slot.getUUID();
            o.LJIIIIZZ(uuid, "slot.uuid");
            ARunnableS13S0300000_2 aRunnableS13S0300000_2 = new ARunnableS13S0300000_2(this, track, slot, 18);
            C1551667c c1551667c = (C1551667c) ((ArrayMap) this.LJLL).get(uuid);
            if (c1551667c != null && (viewTreeObserver2 = c1551667c.getViewTreeObserver()) != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(c1551667c, aRunnableS13S0300000_2, 2));
                return;
            }
            return;
        }
        View view5 = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
        if (view5 == null || view5.getMeasuredWidth() != 0) {
            View view6 = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
            if (view6 == null || view6.getMeasuredHeight() != 0) {
                super.LJIILJJIL(track, slot);
                return;
            }
        }
        String uuid2 = slot.getUUID();
        o.LJIIIIZZ(uuid2, "slot.uuid");
        ARunnableS13S0300000_2 aRunnableS13S0300000_22 = new ARunnableS13S0300000_2(this, track, slot, 19);
        C1551667c c1551667c2 = (C1551667c) ((ArrayMap) this.LJLL).get(uuid2);
        if (c1551667c2 != null && (viewTreeObserver = c1551667c2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(c1551667c2, aRunnableS13S0300000_22, 2));
        }
    }

    public final void LJJII(NLETrackSlot slot, Integer num) {
        o.LJIIIZ(slot, "slot");
        View view = (View) ((ArrayMap) this.LJLL).get(slot.getUUID());
        if (view != null) {
            view.setVisibility(8);
        }
        IDqS181S0200000_2 iDqS181S0200000_2 = this.LJLLILLLL;
        if (iDqS181S0200000_2 != null) {
            iDqS181S0200000_2.invoke(slot, ((ArrayMap) this.LJLL).get(slot.getUUID()), num);
        }
        this.LJLLL = true;
        PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
        if (previewPanelViewModel != null) {
            previewPanelViewModel.lv0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5HL, X.C5HO
    public final boolean LJIILLIIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        String str;
        MutableLiveData mutableLiveData;
        OSZ osz;
        NLENode nLENode;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        super.LJIILLIIL(track, slot, e);
        if (o.LJ(this.LJZI, slot.getUUID())) {
            String str2 = this.LJZI;
            PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
            if (previewPanelViewModel != null && (mutableLiveData = previewPanelViewModel.LJLLLL) != null && (osz = (OSZ) mutableLiveData.getValue()) != null && (nLENode = (NLENode) osz.getSecond()) != null) {
                str = nLENode.getUUID();
            } else {
                str = null;
            }
            if (o.LJ(str2, str)) {
                LJJII(slot, null);
                return true;
            }
        }
        String uuid = slot.getUUID();
        o.LJIIIIZZ(uuid, "slot.uuid");
        this.LJZI = uuid;
        return true;
    }

    @Override // X.C5HL, X.C5HO
    public final boolean LJIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        super.LJIL(track, slot, e);
        String uuid = slot.getUUID();
        o.LJIIIIZZ(uuid, "slot.uuid");
        this.LJZI = uuid;
        LJJII(slot, null);
        return true;
    }

    @Override // X.C5HL, X.C5HO
    public final boolean LJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        float scale;
        float scale2 = nLETrackSlot.getScale() * f;
        float f2 = 0.4f;
        if (scale2 < 0.4f) {
            scale = nLETrackSlot.getScale();
        } else {
            f2 = 11.0f;
            if (scale2 > 11.0f) {
                scale = nLETrackSlot.getScale();
            }
            return super.LJJ(nLETrack, nLETrackSlot, f);
        }
        f = f2 / scale;
        return super.LJJ(nLETrack, nLETrackSlot, f);
    }

    public final void LJJIII(C1551667c c1551667c, NLETrackSlot nLETrackSlot, OSZ<Float, Float> osz) {
        long j;
        EditorProContext editorProContext = this.LJLLLL;
        if (editorProContext != null) {
            j = C79057V0z.LJIJJLI(editorProContext);
        } else {
            j = 0;
        }
        C6QQ.LIZ(new C132015Gb(c1551667c, j * 1000, nLETrackSlot, 1.0f, osz.getFirst().floatValue(), this.LJLZ, osz.getSecond().floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5HL, X.C5HO
    public final boolean LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        NLETrackSlot nLETrackSlot;
        String str;
        Object obj;
        float f;
        float f2;
        String str2;
        String str3;
        CreativeModel creativeModel;
        InlineCaptionModel inlineCaptionModel;
        MutableLiveData mutableLiveData;
        OSZ osz;
        super.LJ(z, z2, z3, z4, z5);
        Object obj2 = 1;
        if (!z3 && !z5 && !z4) {
            return true;
        }
        ArrayMap arrayMap = new ArrayMap();
        PreviewPanelViewModel previewPanelViewModel = this.LJLJI;
        if (previewPanelViewModel != null && (mutableLiveData = previewPanelViewModel.LJLLLL) != null && (osz = (OSZ) mutableLiveData.getValue()) != null) {
            nLETrackSlot = (NLETrackSlot) osz.getSecond();
        } else {
            nLETrackSlot = null;
        }
        if (this.LJLJLJ < 0) {
            str = "zoom_out";
        } else {
            str = "zoom_in";
        }
        arrayMap.put("action_type", str);
        StringBuilder LIZ = X1D.LIZ();
        if (nLETrackSlot != null) {
            obj = Float.valueOf(nLETrackSlot.getTransformX());
        } else {
            obj = obj2;
        }
        LIZ.append(obj);
        LIZ.append(", ");
        if (nLETrackSlot != null) {
            obj2 = Float.valueOf(nLETrackSlot.getTransformY());
        }
        LIZ.append(obj2);
        arrayMap.put("to_location", X1D.LIZIZ(LIZ));
        ArrayMap arrayMap2 = new ArrayMap();
        if (nLETrackSlot != null) {
            f = nLETrackSlot.getScale();
        } else {
            f = 1.0f;
        }
        arrayMap2.put("to_rate", Float.valueOf(f));
        if (nLETrackSlot != null) {
            f2 = nLETrackSlot.getRotation();
        } else {
            f2 = 0.0f;
        }
        arrayMap2.put("to_angle", Float.valueOf(f2));
        arrayMap.put("is_editor_pro", "1");
        if (nLETrackSlot != null && AnonymousClass636.LJIIL(nLETrackSlot)) {
            str2 = "caption";
        } else {
            str2 = "text";
        }
        arrayMap.put("text_type", str2);
        arrayMap.put("app_language", C60903NvH.LJIIJJI().LJII());
        if (nLETrackSlot != null && AnonymousClass636.LJIIL(nLETrackSlot)) {
            VideoPublishEditModel videoPublishEditModel = this.LJLLLLLL;
            if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (inlineCaptionModel = creativeModel.inlineCaptionModel) == null || (str3 = inlineCaptionModel.selectLanguageCode) == null) {
                str3 = "";
            }
            arrayMap.put("asr_model_lang", H8F.LJJJLL(str3));
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLLLLLL;
        EditorProContext editorProContext = this.LJLLLL;
        if (videoPublishEditModel2 != null && editorProContext != null) {
            C145995oB LJFF = C5QW.LJFF(videoPublishEditModel2, editorProContext);
            LJFF.LJFF(arrayMap);
            for (Map.Entry entry : arrayMap2.entrySet()) {
                LJFF.LIZJ(entry.getValue(), (String) entry.getKey());
            }
            FMX.LJIIL("edit_text", LJFF.LIZ);
        }
        return true;
    }
}
