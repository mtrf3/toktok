package X;

import com.bytedance.ies.nle.editor_jni.NLEInfoStickerBufferCallbackWrapper;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEPosition;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLEStickerController;
import kotlin.jvm.internal.o;

/* renamed from: X.5J3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J3 extends C5N3 {
    public C5JJ LJ;

    public final NLEStickerController LJIILJJIL() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEStickerController) c5n2.LJIIJ.getValue();
    }

    public final int LJIJJ() {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_stopStickerAnimationPreview(LJIILJJIL.LIZ, LJIILJJIL);
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5J3(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }

    public final int LJ(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_beginInfoStickerPin(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return -1;
    }

    public final int LJFF(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_cancelInfoStickerPin(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return -1;
    }

    public final byte[] LJIIIIZZ(String str) {
        byte[] NLEStickerController_getInfoStickerPinData;
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && (NLEStickerController_getInfoStickerPinData = NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerPinData(LJIILJJIL.LIZ, LJIILJJIL, str)) != null) {
            return NLEStickerController_getInfoStickerPinData;
        }
        return new byte[0];
    }

    public final float LJIIIZ(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerRotate(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return 0.0f;
    }

    public final float LJIIJ(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerScale(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return 0.0f;
    }

    public final String LJIIJJI(String nleSlotUUID) {
        String NLEStickerController_getInfoStickerTemplateParams;
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && (NLEStickerController_getInfoStickerTemplateParams = NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerTemplateParams(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID)) != null) {
            return NLEStickerController_getInfoStickerTemplateParams;
        }
        return "";
    }

    public final boolean LJIIL(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerVisible(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return false;
    }

    public final NLEPosition LJIILIIL(String str) {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return new NLEPosition(NLEMediaPublicJniJNI.NLEStickerController_getSrtInfoStickerInitPosition(LJIILJJIL.LIZ, LJIILJJIL, str));
        }
        return new NLEPosition();
    }

    public final boolean LJIILL(String str) {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_getStickerIsDynamic(LJIILJJIL.LIZ, LJIILJJIL, str);
        }
        return false;
    }

    public final boolean LJIILLIIL(String nleSlotUUID) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_isInfoStickerAnimatable(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5JJ] */
    public final int LJIIZILJ(final C6YU c6yu) {
        if (LJIILJJIL() != null) {
            this.LJ = new NLEInfoStickerBufferCallbackWrapper() { // from class: X.5JJ
                @Override // com.bytedance.ies.nle.editor_jni.NLEInfoStickerBufferCallbackWrapper
                public final Object onGetBuffer(String str) {
                    return c6yu.LIZ(str);
                }
            };
            NLEStickerController LJIILJJIL = LJIILJJIL();
            if (LJIILJJIL != null) {
                C5JJ c5jj = this.LJ;
                NLEMediaPublicJniJNI.NLEStickerController_setInfoStickerBufferCallback(LJIILJJIL.LIZ, LJIILJJIL, NLEInfoStickerBufferCallbackWrapper.getCPtr(c5jj), c5jj);
                return 0;
            }
            return 0;
        }
        return -1;
    }

    public final int LJIJ(int i) {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_setInfoStickerRestoreMode(LJIILJJIL.LIZ, LJIILJJIL, i);
        }
        return -1;
    }

    public final int LJIJI(int i) {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_startStickerAnimationPreview(LJIILJJIL.LIZ, LJIILJJIL, 3600000L, i);
        }
        return -1;
    }

    public final int LJI(String str, boolean z) {
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return NLEMediaPublicJniJNI.NLEStickerController_enableStickerAnimationPreview(LJIILJJIL.LIZ, LJIILJJIL, str, z);
        }
        return -1;
    }

    public final NLERectF LJII(String nleSlotUUID, boolean z) {
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEStickerController LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            return new NLERectF(NLEMediaPublicJniJNI.NLEStickerController_getInfoStickerBoundingBox(LJIILJJIL.LIZ, LJIILJJIL, nleSlotUUID, z));
        }
        return new NLERectF();
    }
}
