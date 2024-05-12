package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.o;

/* renamed from: X.4xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126474xn extends C125194vj {
    public static final float LJLLILLLL = AnonymousClass564.LIZIZ(3.0f);
    public static final float LJLLJ = AnonymousClass564.LIZIZ(1.5f);
    public static final float LJLLL = AnonymousClass564.LIZIZ(44.0f);
    public static final float LJLLLL = AnonymousClass564.LIZIZ(1.5f);
    public boolean LJLJLLL;
    public EditorProContext LJLL;
    public final C135675Ud LJLLI = new C135675Ud(new C135695Uf(LJLLLL, LJLLJ, LJLLL, -15686971, LJLLILLLL, EnumC132905Jm.PREVIEW_PANEL_AND_VE_SEQUENCE, 8207));

    @Override // X.InterfaceC132925Jo
    public final boolean LJII(NLETrack track, NLETrackSlot slot) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        if (track.LJIIZILJ() == EnumC123864ta.VIDEO && !this.LJLJLLL) {
            return true;
        }
        return false;
    }

    @Override // X.C5HL, X.InterfaceC132925Jo
    public final void LJIIL(ActivityC45651qj activity, C87230YLi viewParent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewParent, "viewParent");
        super.LJIIL(activity, viewParent);
        EditorProContext.Companion.getClass();
        this.LJLL = C124994vP.LIZ();
        C135675Ud materialEditor = this.LJLLI;
        o.LJIIIZ(materialEditor, "materialEditor");
        this.LJLJJL = materialEditor;
    }

    @Override // X.C5HL, X.C5HO
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        boolean LJIIZILJ = super.LJIIZILJ(nLETrack, nLETrackSlot, i);
        int i2 = -((int) nLETrackSlot.getRotation());
        EditorProContext editorProContext = this.LJLL;
        if (editorProContext != null) {
            C79057V0z.LJJJJL(editorProContext, "update_rotate_degree", new C125894wr(true, String.valueOf(i2)));
        }
        EditorProContext editorProContext2 = this.LJLL;
        if (editorProContext2 != null) {
            C79057V0z.LJJJJL(editorProContext2, "current_rotate_degree", Integer.valueOf(i2));
        }
        return LJIIZILJ;
    }
}
