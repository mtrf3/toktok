package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEmojiSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.ss.ugc.android.editor.core.api.params.TextStyleInfo;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.4ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124654ur extends C124704uw implements InterfaceC125324vw {
    public final long LJLJJLL;

    public final void LJJLIIIJILLIZJL() {
        if (this.LJLJJL.isPlaying()) {
            this.LJLJJL.pause();
        }
        this.LJLJJL.seek(this.LJLJJL.H9());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124654ur(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLJJLL = TimeUnit.SECONDS.toMicros(3L);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJIIJJI(EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || LJJLI() == null || !C124574uj.LJJJLL(LJJL)) {
                return false;
            }
            NLEVideoFrameModel cover = r9().getCover();
            NLEEditorJniJNI.NLEVideoFrameModel_removeTrack(cover.LIZ, cover, NLETrack.LJI(LJJL), LJJL);
            LJJJZ(enumC124724uy, null);
            return true;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ)) {
            return false;
        }
        LJJLIIIIJ.LJIJJLI(LJJLIIIJ);
        LJJJZ(enumC124724uy, null);
        LJJLIIIJILLIZJL();
        return true;
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIL(EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLETrackSlot LJJLI;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || (LJJLI = LJJLI()) == null || !C124574uj.LJJJLL(LJJL) || NLESegmentSticker.LIZLLL(LJJLI.LJI()) == null) {
                return null;
            }
            LJJJZ(enumC124724uy, null);
            return LJJLI;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ) || NLESegmentSticker.LIZLLL(LJJLIIIJ.LJI()) == null) {
            return null;
        }
        LJJJZ(enumC124724uy, null);
        return LJJLIIIJ;
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJIL(C124664us c124664us, EnumC124724uy enumC124724uy) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setLayer(r9().getLayerMax() + 1);
        String iconPath = c124664us.LIZ;
        o.LJIIIZ(iconPath, "iconPath");
        nLETrackSlot.setExtra("previewIconPath", iconPath);
        nLETrackSlot.setStartTime(TimeUnit.MILLISECONDS.toMicros(this.LJLIL.getPlayer().H9()));
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + this.LJLJJLL);
        NLESegmentInfoSticker nLESegmentInfoSticker = new NLESegmentInfoSticker();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIIIZ(c124664us.LIZIZ);
        nLEResourceNode.LJIILIIL(EnumC123874tb.INFO_STICKER);
        String str = c124664us.LIZJ;
        if (str != null) {
            nLEResourceNode.LJIIJ(str);
        }
        NLEEditorJniJNI.NLESegmentInfoSticker_setEffectSDKFile(nLESegmentInfoSticker.LJ, nLESegmentInfoSticker, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        nLETrackSlot.LJIIL(nLESegmentInfoSticker);
        NLEModel r9 = r9();
        NLETrack nLETrack = new NLETrack();
        C124574uj.LJJLIIIJILLIZJL(nLETrack, "sticker");
        nLETrack.setLayer(C124574uj.LJFF(r9()));
        nLETrack.LJIL(EnumC123864ta.STICKER);
        nLETrack.LIZIZ(nLETrackSlot);
        C124574uj.LJJLI(nLETrack);
        r9.addTrack(nLETrack);
        LJJJZ(enumC124724uy, null);
        LJJLIIIJILLIZJL();
        return nLETrackSlot;
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIIJ(EnumC124724uy enumC124724uy, String utf8Code) {
        o.LJIIIZ(utf8Code, "utf8Code");
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setLayer(r9().getLayerMax() + 1);
        nLETrackSlot.setStartTime(TimeUnit.MILLISECONDS.toMicros(this.LJLIL.getPlayer().H9()));
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + this.LJLJJLL);
        nLETrackSlot.LJIIL(new NLESegmentEmojiSticker());
        NLEModel r9 = r9();
        NLETrack nLETrack = new NLETrack();
        C124574uj.LJJLIIIJILLIZJL(nLETrack, "sticker");
        nLETrack.setLayer(C124574uj.LJFF(r9()));
        nLETrack.LJIL(EnumC123864ta.STICKER);
        nLETrack.LIZIZ(nLETrackSlot);
        C124574uj.LJJLI(nLETrack);
        r9.addTrack(nLETrack);
        LJJJZ(enumC124724uy, null);
        LJJLIIIJILLIZJL();
        return nLETrackSlot;
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIIJZLJL(C124674ut c124674ut, EnumC124724uy enumC124724uy) {
        float f;
        float f2;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setLayer(r9().getLayerMax() + 1);
        Float f3 = c124674ut.LIZLLL;
        if (f3 != null) {
            f = f3.floatValue();
        } else {
            f = 0.5f;
        }
        float f4 = 2;
        nLETrackSlot.setTransformX((f - 0.5f) * f4);
        Float f5 = c124674ut.LJ;
        if (f5 != null) {
            f2 = f5.floatValue();
        } else {
            f2 = 0.5f;
        }
        nLETrackSlot.setTransformY((0.5f - f2) * f4);
        nLETrackSlot.setStartTime(TimeUnit.MILLISECONDS.toMicros(this.LJLIL.getPlayer().H9()));
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + this.LJLJJLL);
        NLESegmentImageSticker nLESegmentImageSticker = new NLESegmentImageSticker();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIIIZ(c124674ut.LIZ);
        nLEResourceNode.LJIILIIL(EnumC123874tb.IMAGE);
        nLEResourceNode.LJIILJJIL(c124674ut.LIZIZ);
        nLEResourceNode.LJIIIIZZ(c124674ut.LIZJ);
        NLEEditorJniJNI.NLESegmentImageSticker_setImageFile(nLESegmentImageSticker.LJ, nLESegmentImageSticker, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        nLETrackSlot.LJIIL(nLESegmentImageSticker);
        nLETrackSlot.setScale(0.4f);
        NLEModel r9 = r9();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setLayer(C124574uj.LJFF(r9()));
        C124574uj.LJJLIIIJILLIZJL(nLETrack, "sticker");
        nLETrack.LJIL(EnumC123864ta.STICKER);
        nLETrack.LIZIZ(nLETrackSlot);
        C124574uj.LJJLI(nLETrack);
        r9.addTrack(nLETrack);
        LJJJZ(enumC124724uy, null);
        LJJLIIIJILLIZJL();
        return nLETrackSlot;
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJIIZI(Float f, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLETrackSlot LJJLI;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || (LJJLI = LJJLI()) == null || !C124574uj.LJJJLL(LJJL) || f == null) {
                return false;
            }
            LJJLI.setScale(f.floatValue() * LJJLI.getScale());
            this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
            LJJJZ(enumC124724uy, null);
            return true;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ) || f == null) {
            return false;
        }
        LJJLIIIJ.setScale(f.floatValue() * LJJLIIIJ.getScale());
        LJJJZ(enumC124724uy, null);
        return true;
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIJLIJ(boolean z, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLETrackSlot LJJLI;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || (LJJLI = LJJLI()) == null || !C124574uj.LJJJLL(LJJL) || NLESegmentTextSticker.LJFF(LJJLI.LJI()) == null) {
                return null;
            }
            LJJJZ(enumC124724uy, null);
            return LJJLI;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ) || NLESegmentTextSticker.LJFF(LJJLIIIJ.LJI()) == null) {
            return null;
        }
        if (z) {
            this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
        }
        LJJJZ(enumC124724uy, null);
        return LJJLIIIJ;
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJZ(Float f, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        float rotation;
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ)) {
            return false;
        }
        if (f != null) {
            rotation = f.floatValue();
        } else {
            rotation = LJJLIIIJ.getRotation();
        }
        LJJLIIIJ.setRotation(rotation);
        this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
        LJJJZ(enumC124724uy, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC125324vw
    public final C125674wV LJJJIL(TextStyleInfo info, String str, EnumC124724uy enumC124724uy) {
        long micros;
        long startTime;
        o.LJIIIZ(info, "info");
        boolean enable = r9().getCover().getEnable();
        int i = 12;
        NLETrack nLETrack = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        boolean z = false;
        try {
            String fontPath = info.getFontPath();
            if ((fontPath == null || fontPath.length() == 0) && str != null && str.length() > 0) {
                info.setFontPath(str);
            }
            String LIZ = C6YK.LIZ(info);
            if (LIZ == null) {
                return new C125674wV(nLETrack, (NLETrackSlot) (objArr3 == true ? 1 : 0), z, i);
            }
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            nLETrackSlot.setLayer(r9().getLayerMax() + 1);
            if (enable) {
                micros = 0;
            } else {
                micros = TimeUnit.MILLISECONDS.toMicros(this.LJLIL.getPlayer().H9());
            }
            nLETrackSlot.setStartTime(micros);
            if (enable) {
                startTime = this.LJLIL.getMainTrack().LJIIJJI();
            } else {
                startTime = nLETrackSlot.getStartTime() + this.LJLJJLL;
            }
            nLETrackSlot.setEndTime(startTime);
            NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
            nLESegmentTextSticker.LJIIIIZZ(info.getText());
            nLESegmentTextSticker.LJIIIZ(new NLEStyText(LIZ));
            nLETrackSlot.LJIIL(nLESegmentTextSticker);
            NLETrack nLETrack2 = new NLETrack();
            C124574uj.LJJLIIIJILLIZJL(nLETrack2, "sticker");
            nLETrack2.setLayer(C124574uj.LJFF(r9()));
            nLETrack2.LJIL(EnumC123864ta.STICKER);
            nLETrack2.LIZIZ(nLETrackSlot);
            C124574uj.LJJLI(nLETrack2);
            if (enable) {
                NLEVideoFrameModel cover = r9().getCover();
                NLEEditorJniJNI.NLEVideoFrameModel_addTrack(cover.LIZ, cover, NLETrack.LJI(nLETrack2), nLETrack2);
                LJJJZ(enumC124724uy, null);
            } else {
                r9().addTrack(nLETrack2);
                String text = info.getText();
                if (text != null && !o.LJ(text, "input text")) {
                    LJJJZ(EnumC124724uy.DONE, null);
                } else {
                    LJJJZ(EnumC124724uy.COMMIT, null);
                }
                LJJLIIIJILLIZJL();
            }
            this.LJLJJL.seek(this.LJLJJL.H9());
            return new C125674wV(nLETrack2, nLETrackSlot, z, i);
        } catch (Exception unused) {
            return new C125674wV((NLETrack) (objArr2 == true ? 1 : 0), (NLETrackSlot) (objArr == true ? 1 : 0), z, i);
        }
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJ(Float f, Float f2, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        float rotation;
        float scale;
        NLETrackSlot LJJLI;
        float rotation2;
        float scale2;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || (LJJLI = LJJLI()) == null || !C124574uj.LJJJLL(LJJL)) {
                return false;
            }
            if (f2 != null) {
                rotation2 = f2.floatValue();
            } else {
                rotation2 = LJJLI.getRotation();
            }
            if (f != null) {
                scale2 = f.floatValue();
            } else {
                scale2 = LJJLI.getScale();
            }
            LJJLI.setRotation(rotation2);
            LJJLI.setScale(LJJLI.getScale() * scale2);
            this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
            LJJJZ(enumC124724uy, null);
            return true;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ)) {
            return false;
        }
        if (f2 != null) {
            rotation = f2.floatValue();
        } else {
            rotation = LJJLIIIJ.getRotation();
        }
        if (f != null) {
            scale = f.floatValue();
        } else {
            scale = LJJLIIIJ.getScale();
        }
        LJJLIIIJ.setRotation(rotation);
        LJJLIIIJ.setScale(LJJLIIIJ.getScale() * scale);
        LJJJZ(enumC124724uy, null);
        return true;
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJI(Float f, Float f2, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        float LLILZIL;
        float LLILZLL;
        NLETrackSlot LJJLI;
        float LLILZIL2;
        float LLILZLL2;
        if (r9().getCover().getEnable()) {
            NLETrack LJJL = LJJL();
            if (LJJL == null || (LJJLI = LJJLI()) == null || !C124574uj.LJJJLL(LJJL)) {
                return false;
            }
            if (f != null) {
                LLILZIL2 = f.floatValue();
            } else {
                LLILZIL2 = C44384HbQ.LLILZIL(LJJLI.getTransformX());
            }
            if (f2 != null) {
                LLILZLL2 = f2.floatValue();
            } else {
                LLILZLL2 = C44384HbQ.LLILZLL(LJJLI.getTransformY());
            }
            float f3 = 2;
            LJJLI.setTransformX((LLILZIL2 - 0.5f) * f3);
            LJJLI.setTransformY((0.5f - LLILZLL2) * f3);
            LJJJZ(enumC124724uy, null);
            return true;
        }
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || !C124574uj.LJJJLL(LJJLIIIIJ)) {
            return false;
        }
        if (f != null) {
            LLILZIL = f.floatValue();
        } else {
            LLILZIL = C44384HbQ.LLILZIL(LJJLIIIJ.getTransformX());
        }
        if (f2 != null) {
            LLILZLL = f2.floatValue();
        } else {
            LLILZLL = C44384HbQ.LLILZLL(LJJLIIIJ.getTransformY());
        }
        float f4 = 2;
        LJJLIIIJ.setTransformX((LLILZIL - 0.5f) * f4);
        LJJLIIIJ.setTransformY((0.5f - LLILZLL) * f4);
        this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
        LJJJZ(enumC124724uy, null);
        return true;
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJJL(Boolean bool, boolean z, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (LJJLIIIJ = LJJLIIIJ()) != null && C124574uj.LJJJLL(LJJLIIIIJ)) {
            LJJLIIIJ.setMirror_X(!LJJLIIIJ.getMirror_X());
            LJJJZ(enumC124724uy, null);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJIIZ(NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        long startTime;
        long endTime;
        long startTime2;
        long endTime2;
        if (nLETrackSlot != null) {
            if (NLESegmentSticker.LIZLLL(nLETrackSlot.LJI()) != null) {
                if (l != null) {
                    startTime2 = l.longValue();
                } else {
                    startTime2 = nLETrackSlot.getStartTime();
                }
                if (l2 != null) {
                    endTime2 = l2.longValue();
                } else {
                    endTime2 = nLETrackSlot.getEndTime();
                }
                nLETrackSlot.setStartTime(startTime2);
                nLETrackSlot.setEndTime(endTime2);
                this.LJLIL.getKeyframeEditor().LJJJJLL(nLETrackSlot);
                LJJJZ(enumC124724uy, null);
                LJJLIIIJILLIZJL();
                return true;
            }
        } else {
            NLETrack LJJLIIIIJ = LJJLIIIIJ();
            if (LJJLIIIIJ != null && (LJJLIIIJ = LJJLIIIJ()) != null && C124574uj.LJJJLL(LJJLIIIIJ)) {
                if (l != null) {
                    startTime = l.longValue();
                } else {
                    startTime = LJJLIIIJ.getStartTime();
                }
                if (l2 != null) {
                    endTime = l2.longValue();
                } else {
                    endTime = LJJLIIIJ.getEndTime();
                }
                LJJLIIIJ.setStartTime(startTime);
                LJJLIIIJ.setEndTime(endTime);
                LJJJZ(enumC124724uy, null);
                LJJLIIIJILLIZJL();
                return true;
            }
        }
        return false;
    }
}
