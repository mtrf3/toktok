package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass508;
import X.C113584d0;
import X.C139875eJ;
import X.C140335f3;
import X.C34K;
import X.C5LU;
import X.C5OO;
import X.C5P0;
import X.C5T9;
import X.C5UO;
import X.C6YX;
import X.C76800UCe;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.gamora.editorpro.album.EditorProAlbumService;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.List;
import v5.n;

/* loaded from: classes3.dex */
public class AqS7S0401000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S0401000_2 aqS7S0401000_2) {
        C6YX c6yx = (C6YX) aqS7S0401000_2.l0;
        Activity activity = (Activity) aqS7S0401000_2.l1;
        InterfaceC153045zY interfaceC153045zY = ((C5T9) aqS7S0401000_2.l2).LIZLLL;
        int i = aqS7S0401000_2.i4;
        final C113584d0 c113584d0 = (C113584d0) aqS7S0401000_2.l3;
        c6yx.LIZ(activity, interfaceC153045zY, i, new C5UO() { // from class: X.6LC
            @Override // X.C5UO
            public final void LIZ(List<Bitmap> list) {
                C113584d0.this.LJLLLLLL(list);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S0401000_2 aqS7S0401000_2) {
        C6YX c6yx = (C6YX) aqS7S0401000_2.l0;
        Activity activity = (Activity) aqS7S0401000_2.l1;
        InterfaceC153045zY interfaceC153045zY = ((FTCEditAudioRecordScene) aqS7S0401000_2.l2).mVEEditor;
        int i = aqS7S0401000_2.i4;
        final C113584d0 c113584d0 = (C113584d0) aqS7S0401000_2.l3;
        c6yx.LIZ(activity, interfaceC153045zY, i, new C5UO() { // from class: X.6Kf
            @Override // X.C5UO
            public final void LIZ(List<Bitmap> list) {
                C113584d0.this.LJLLLLLL(list);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS7S0401000_2 aqS7S0401000_2) {
        C6YX c6yx = (C6YX) aqS7S0401000_2.l0;
        Activity activity = (Activity) aqS7S0401000_2.l1;
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) aqS7S0401000_2.l2;
        int i = aqS7S0401000_2.i4;
        final C113584d0 c113584d0 = (C113584d0) aqS7S0401000_2.l3;
        c6yx.LIZ(activity, interfaceC153045zY, i, new C5UO() { // from class: X.5TR
            @Override // X.C5UO
            public final void LIZ(List<Bitmap> list) {
                C113584d0.this.LJLLLLLL(list);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS7S0401000_2 aqS7S0401000_2) {
        C6YX c6yx = (C6YX) aqS7S0401000_2.l0;
        Activity activity = (Activity) aqS7S0401000_2.l1;
        InterfaceC153045zY interfaceC153045zY = ((EditAudioRecordScene) aqS7S0401000_2.l2).mVEEditor;
        int i = aqS7S0401000_2.i4;
        final C113584d0 c113584d0 = (C113584d0) aqS7S0401000_2.l3;
        c6yx.LIZ(activity, interfaceC153045zY, i, new C5UO() { // from class: X.6KK
            @Override // X.C5UO
            public final void LIZ(List<Bitmap> list) {
                C113584d0.this.LJLLLLLL(list);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS7S0401000_2 aqS7S0401000_2) {
        C5P0 c5p0 = (C5P0) aqS7S0401000_2.l0;
        boolean z = false;
        c5p0.LIZIZ = false;
        c5p0.LJIIIZ.LIZ();
        String[] strArr = ((VEEditorResManager) aqS7S0401000_2.l1).mReverseVideoPath;
        if (strArr != null) {
            C5P0 c5p02 = (C5P0) aqS7S0401000_2.l0;
            if (strArr.length != 0 && strArr.length == 1) {
                C5LU LIZLLL = c5p02.LJIIIZ.LIZLLL();
                String str = strArr[0];
                o.LJIIIIZZ(str, "it[0]");
                LIZLLL.LJJII(str);
            }
            return C76800UCe.LIZ;
        }
        String[] strArr2 = ((VEEditorResManager) aqS7S0401000_2.l1).mReverseAudioPaths;
        if (strArr2 != null) {
            C5P0 c5p03 = (C5P0) aqS7S0401000_2.l0;
            if (strArr2.length != 0 && strArr2.length == 1) {
                C5LU LIZLLL2 = c5p03.LJIIIZ.LIZLLL();
                String str2 = strArr2[0];
                o.LJIIIIZZ(str2, "it[0]");
                LIZLLL2.LJIJJLI(str2);
            }
            return C76800UCe.LIZ;
        }
        ((C5P0) aqS7S0401000_2.l0).LJIIIZ.LIZIZ();
        NLEEditor nLEEditor = (NLEEditor) aqS7S0401000_2.l2;
        if (nLEEditor != null) {
            nLEEditor.addConsumer(((C5P0) aqS7S0401000_2.l0).LJIIJ);
        }
        if (aqS7S0401000_2.i4 == 0) {
            z = true;
        }
        ((n) aqS7S0401000_2.l3).LJ(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS7S0401000_2 aqS7S0401000_2) {
        C6YX c6yx = (C6YX) aqS7S0401000_2.l0;
        Activity activity = (Activity) aqS7S0401000_2.l1;
        InterfaceC153045zY interfaceC153045zY = ((C5OO) aqS7S0401000_2.l2).LJLJJLL;
        int i = aqS7S0401000_2.i4;
        final C113584d0 c113584d0 = (C113584d0) aqS7S0401000_2.l3;
        c6yx.LIZ(activity, interfaceC153045zY, i, new C5UO() { // from class: X.5OR
            @Override // X.C5UO
            public final void LIZ(List<Bitmap> list) {
                C113584d0.this.LJLLLLLL(list);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS7S0401000_2 aqS7S0401000_2) {
        if (((C34K) aqS7S0401000_2.l0).element) {
            InterfaceC153045zY LJLIIL = ((C139875eJ) aqS7S0401000_2.l1).LJLIIL();
            if (LJLIIL != null) {
                LJLIIL.LJJLIIIIJ(aqS7S0401000_2.i4);
            }
            VEEditorAutoStartStopArbiter LJJLJ = ((C139875eJ) aqS7S0401000_2.l1).LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.LIZJ(false, ((C34K) aqS7S0401000_2.l2).element);
            }
        }
        AqS0S0130000_2 aqS0S0130000_2 = ((C140335f3) aqS7S0401000_2.l3).LJII;
        if (aqS0S0130000_2 != null) {
            aqS0S0130000_2.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS7S0401000_2 aqS7S0401000_2) {
        ((EditorProAlbumService) aqS7S0401000_2.l0).afterAllow((ActivityC45651qj) aqS7S0401000_2.l1, aqS7S0401000_2.i4, (AnonymousClass508) aqS7S0401000_2.l2, (InterfaceC65784Pro) aqS7S0401000_2.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(int i, C139875eJ c139875eJ, C140335f3 c140335f3, C34K c34k, C34K c34k2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c34k;
        this.l1 = c139875eJ;
        this.i4 = i;
        this.l2 = c34k2;
        this.l3 = c140335f3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0401000_2(C5P0 c5p0, C5P0 c5p02, VEEditorResManager vEEditorResManager, NLEEditor nLEEditor, int i, n<Boolean> nVar) {
        super(0);
        this.$t = nVar;
        this.l0 = c5p0;
        this.l1 = c5p02;
        this.l2 = vEEditorResManager;
        this.i4 = nLEEditor;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(C6YX c6yx, Activity activity, C5OO c5oo, int i, C113584d0 c113584d0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6yx;
        this.l1 = activity;
        this.l2 = c5oo;
        this.i4 = i;
        this.l3 = c113584d0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(C6YX c6yx, Activity activity, C5T9 c5t9, int i, C113584d0 c113584d0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6yx;
        this.l1 = activity;
        this.l2 = c5t9;
        this.i4 = i;
        this.l3 = c113584d0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(C6YX c6yx, Activity activity, InterfaceC153045zY interfaceC153045zY, int i, C113584d0 c113584d0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6yx;
        this.l1 = activity;
        this.l2 = interfaceC153045zY;
        this.i4 = i;
        this.l3 = c113584d0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(C6YX c6yx, Activity activity, FTCEditAudioRecordScene fTCEditAudioRecordScene, int i, C113584d0 c113584d0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6yx;
        this.l1 = activity;
        this.l2 = fTCEditAudioRecordScene;
        this.i4 = i;
        this.l3 = c113584d0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0401000_2(C6YX c6yx, Activity activity, EditAudioRecordScene editAudioRecordScene, int i, C113584d0 c113584d0, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c6yx;
        this.l1 = activity;
        this.l2 = editAudioRecordScene;
        this.i4 = i;
        this.l3 = c113584d0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS7S0401000_2(EditorProAlbumService editorProAlbumService, EditorProAlbumService editorProAlbumService2, ActivityC45651qj activityC45651qj, int i, AnonymousClass508 anonymousClass508, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = editorProAlbumService;
        this.l1 = editorProAlbumService2;
        this.i4 = activityC45651qj;
        this.l2 = i;
        this.l3 = anonymousClass508;
    }
}
