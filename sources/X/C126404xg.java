package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126404xg extends C5HM implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final C5PQ LJLJLLL;

    @Override // X.InterfaceC132875Jj
    public final float LJIIJJI() {
        return 1.0f;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C126404xg(C82622Wbi c82622Wbi) {
        this.LJLJLJ = c82622Wbi;
        this.LJLJLLL = new C5PQ(c82622Wbi);
    }

    @Override // X.InterfaceC132925Jo
    public final OSZ<Float, Float> LJI(NLETrackSlot slot) {
        NLEResourceAV LJ;
        float f;
        float floatValue;
        float floatValue2;
        o.LJIIIZ(slot, "slot");
        OSZ<Float, Float> osz = this.LJLJJI;
        Float valueOf = Float.valueOf(0.0f);
        if (osz == null) {
            return new OSZ<>(valueOf, valueOf);
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
        if (LJJ == null || (LJ = LJJ.LJ()) == null) {
            return new OSZ<>(valueOf, valueOf);
        }
        OSZ osz2 = new OSZ(Float.valueOf((float) LJ.LJI()), Float.valueOf((float) LJ.LIZIZ()));
        NLEStyCrop LJJIFFI = NLESegmentVideo.LJJ(slot.LJI()).LJJIFFI();
        if (LJJIFFI != null) {
            f = NLEEditorJniJNI.NLEStyCrop_getXRightUpper(LJJIFFI.LIZ, LJJIFFI) - NLEEditorJniJNI.NLEStyCrop_getXLeft(LJJIFFI.LIZ, LJJIFFI);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            floatValue = ((Number) osz2.getFirst()).floatValue();
        } else {
            floatValue = f * ((Number) osz2.getFirst()).floatValue();
        }
        if (LJJIFFI != null) {
            float NLEStyCrop_getYLeftLower = NLEEditorJniJNI.NLEStyCrop_getYLeftLower(LJJIFFI.LIZ, LJJIFFI) - NLEEditorJniJNI.NLEStyCrop_getYUpper(LJJIFFI.LIZ, LJJIFFI);
            if (NLEStyCrop_getYLeftLower != 0.0f) {
                floatValue2 = ((Number) osz2.getSecond()).floatValue() * NLEStyCrop_getYLeftLower;
                if (!Float.isNaN(floatValue2) || Float.isInfinite(floatValue2)) {
                    floatValue2 = ((Number) osz2.getSecond()).floatValue();
                } else if (Float.isNaN(floatValue2) || Float.isInfinite(floatValue2)) {
                    floatValue = ((Number) osz2.getFirst()).floatValue();
                }
                OSZ osz3 = new OSZ(Float.valueOf(floatValue), Float.valueOf(floatValue2));
                return C132865Ji.LIZ(((Number) osz3.getFirst()).floatValue() / ((Number) osz3.getSecond()).floatValue(), osz.getFirst().floatValue(), osz.getSecond().floatValue());
            }
        }
        floatValue2 = ((Number) osz2.getSecond()).floatValue();
        if (!Float.isNaN(floatValue2)) {
        }
        floatValue2 = ((Number) osz2.getSecond()).floatValue();
        OSZ osz32 = new OSZ(Float.valueOf(floatValue), Float.valueOf(floatValue2));
        return C132865Ji.LIZ(((Number) osz32.getFirst()).floatValue() / ((Number) osz32.getSecond()).floatValue(), osz.getFirst().floatValue(), osz.getSecond().floatValue());
    }

    @Override // X.InterfaceC132925Jo
    public final boolean LJII(NLETrack track, NLETrackSlot slot) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        if (track.LJIIZILJ() == EnumC123864ta.VIDEO && !C124574uj.LJJJI(slot)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132925Jo
    public final void LJIIL(ActivityC45651qj activity, C87230YLi viewParent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewParent, "viewParent");
        this.LJLIL = activity;
        this.LJLILLLLZI = viewParent;
        C5PQ materialEditor = this.LJLJLLL;
        o.LJIIIZ(materialEditor, "materialEditor");
        this.LJLJJLL = materialEditor;
    }
}
