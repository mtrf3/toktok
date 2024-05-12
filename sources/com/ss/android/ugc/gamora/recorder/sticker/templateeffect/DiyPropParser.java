package com.ss.android.ugc.gamora.recorder.sticker.templateeffect;

import X.AbstractC83571Wr1;
import X.C1NE;
import X.C38485F8n;
import X.C44946HkU;
import X.C46223ICd;
import X.C46237ICr;
import X.C53560L0i;
import X.C75792yF;
import X.C78685UuP;
import X.H78;
import X.IC2;
import X.IC3;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import X.XN6;
import X.XN9;
import X.XNE;
import android.graphics.Bitmap;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreMaxSize;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class DiyPropParser {
    public static OSZ<String, ? extends XN6> LIZ;

    /* loaded from: classes7.dex */
    public static final class Editor {

        @InterfaceC65349Pkn("allowExporting")
        public final Boolean allowExporting;

        @InterfaceC65349Pkn("tags")
        public final List<String> tags;

        @InterfaceC65349Pkn("version")
        public final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public Editor() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Editor)) {
                return false;
            }
            Editor editor = (Editor) obj;
            return o.LJ(this.allowExporting, editor.allowExporting) && o.LJ(this.version, editor.version) && o.LJ(this.tags, editor.tags);
        }

        public final int hashCode() {
            Boolean bool = this.allowExporting;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.version;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.tags;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Editor(allowExporting=");
            LIZ.append(this.allowExporting);
            LIZ.append(", version=");
            LIZ.append(this.version);
            LIZ.append(", tags=");
            return C1NE.LIZIZ(LIZ, this.tags, ')', LIZ);
        }

        public Editor(Boolean bool, String str, List<String> list) {
            this.allowExporting = bool;
            this.version = str;
            this.tags = list;
        }

        public /* synthetic */ Editor(Boolean bool, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
        }
    }

    public static boolean LIZ(Effect effect) {
        C44946HkU LJI = LJI(effect);
        if (LJI != null) {
            return LJI.LJLILLLLZI;
        }
        return false;
    }

    public static void LIZIZ(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        String extra = effect.getExtra();
        if (extra != null && extra.length() > 0) {
            return;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(effect.getUnzipPath());
            LIZ2.append("/extra.json");
            File file = new File(X1D.LIZIZ(LIZ2));
            if (!file.exists()) {
                return;
            }
            effect.setSdkExtra(C38485F8n.LLLFZ(file));
        } catch (s e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("fixExtra json fail: ");
            LIZ3.append(e);
            H78.LJII(X1D.LIZIZ(LIZ3));
        } catch (FileNotFoundException e2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("fixExtra file fail: ");
            LIZ4.append(e2);
            H78.LJII(X1D.LIZIZ(LIZ4));
        }
    }

    public static String LIZJ(Effect effect) {
        if (LJIIIIZZ(effect)) {
            return LIZLLL(effect);
        }
        return effect.getResourceId();
    }

    public static String LIZLLL(Effect effect) {
        String str;
        String resource_id;
        MobileEffectTemplateInfo templateInfo;
        o.LJIIIZ(effect, "<this>");
        String str2 = "";
        if (!(effect instanceof MobileEffect) || (templateInfo = ((MobileEffect) effect).getTemplateInfo()) == null || (str = templateInfo.getTemplateResourceId()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            TemplateEffectExtra template_effect_extra = effect.getTemplate_effect_extra();
            if (template_effect_extra != null && (resource_id = template_effect_extra.getResource_id()) != null) {
                str2 = resource_id;
            }
            str = str2;
        }
        if (str.length() == 0) {
            H78.LJII("DiyProp, getTemplateResourceId null");
        }
        return str;
    }

    public static int[] LJ(Effect effect) {
        AbstractC83571Wr1 abstractC83571Wr1;
        int i;
        UIAnnotationAssetUIMoreMaxSize LJIILIIL;
        XN6 LJFF = LJFF(effect);
        if (LJFF == null) {
            return new int[]{480, 480};
        }
        XN9<?, ?>[] LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset);
        if (LIZIZ != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if (!(xn9 instanceof XNE) || xn9 == null || (abstractC83571Wr1 = (AbstractC83571Wr1) xn9.LIZ) == null) {
                return new int[]{480, 480};
            }
            int i2 = 480;
            UIAnnotationAssetUIMoreMaxSize LJIILIIL2 = abstractC83571Wr1.LJIILIIL();
            if (LJIILIIL2 != null) {
                i = (int) LJIILIIL2.getWidth();
            } else {
                i = 480;
            }
            AbstractC83571Wr1 abstractC83571Wr12 = (AbstractC83571Wr1) xn9.LIZ;
            if (abstractC83571Wr12 != null && (LJIILIIL = abstractC83571Wr12.LJIILIIL()) != null) {
                i2 = (int) LJIILIIL.getHeight();
            }
            return new int[]{i, i2};
        }
        return new int[]{480, 480};
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r0 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.XN6 LJFF(com.ss.android.ugc.effectmanager.effect.model.Effect r7) {
        /*
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            boolean r0 = X.C83570Wr0.LIZ
            r1 = 1
            if (r0 == 0) goto L28
        L9:
            X.OSZ<java.lang.String, ? extends X.XN6> r0 = com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LIZ
            if (r0 == 0) goto L26
            java.lang.Object r1 = r0.getFirst()
        L11:
            java.lang.String r0 = r7.getUnzipPath()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L7f
            X.OSZ<java.lang.String, ? extends X.XN6> r0 = com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LIZ
            if (r0 == 0) goto L25
            java.lang.Object r5 = r0.getSecond()
            X.XN6 r5 = (X.XN6) r5
        L25:
            return r5
        L26:
            r1 = r5
            goto L11
        L28:
            java.lang.Class<X.Wr0> r6 = X.C83570Wr0.class
            monitor-enter(r6)
            boolean r0 = X.C83570Wr0.LIZ     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L31
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb5
            goto L9
        L31:
            boolean r0 = X.EK9.LIZ()     // Catch: java.lang.Throwable -> Lb5
            r4 = 0
            if (r0 != 0) goto L3a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb5
            goto L7e
        L3a:
            java.lang.String r0 = "EffectEditorJni"
            X.C16880lQ.LLJJJIL(r0)     // Catch: java.lang.Throwable -> L42
            X.C83570Wr0.LIZ = r1     // Catch: java.lang.Throwable -> L42
            goto L5a
        L42:
            r3 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "Native code library failed to load.\n"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb5
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb5
            r2.println(r0)     // Catch: java.lang.Throwable -> Lb5
            X.C83570Wr0.LIZ = r4     // Catch: java.lang.Throwable -> Lb5
        L5a:
            boolean r0 = X.C83570Wr0.LIZ     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L79
            X.Wsh r0 = new X.Wsh     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            X.C83570Wr0.LIZIZ = r0     // Catch: java.lang.Throwable -> Lb5
            com.bytedance.ies.effecteditor.swig.EEEffectHandle r1 = com.bytedance.ies.effecteditor.swig.EEEffectHandle.Instance()     // Catch: java.lang.Throwable -> Lb5
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> Lb5
            X.Wsh r0 = X.C83570Wr0.LIZIZ     // Catch: java.lang.Throwable -> Lb5
            r1.setMETEffectHandleGetterPtr(r0)     // Catch: java.lang.Throwable -> Lb5
            X.Wqz r0 = new X.Wqz     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            com.bef.effectsdk.message.MessageCenter.addListener(r0)     // Catch: java.lang.Throwable -> Lb5
        L79:
            boolean r0 = X.C83570Wr0.LIZ     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L9
        L7e:
            return r5
        L7f:
            X.XN6 r4 = new X.XN6
            java.lang.String r1 = r7.getUnzipPath()
            java.lang.String r0 = r7.getTransResPath()
            r4.<init>(r1, r0)
            com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode r3 = r4.LIZLLL()
            com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode r0 = com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode.UIAnnotationErrorCode_None
            if (r3 != r0) goto L9f
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = r7.getUnzipPath()
            r1.<init>(r0, r4)
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LIZ = r1
        L9f:
            java.lang.String r2 = "DiyProp"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "DiyPropParser#getParse errorCode:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZIZ(r2, r0)
            return r4
        Lb5:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LJFF(com.ss.android.ugc.effectmanager.effect.model.Effect):X.XN6");
    }

    public static C44946HkU LJI(Effect effect) {
        XN9<?, ?>[] LIZIZ;
        T t;
        UIAnnotationAssetType uIAnnotationAssetType;
        boolean z;
        boolean z2;
        int i;
        int i2;
        XN6 LJFF = LJFF(effect);
        if (LJFF != null && (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if ((xn9 instanceof XNE) && xn9 != null && (t = xn9.LIZ) != 0) {
                UIAnnotationUIMore uIAnnotationUIMore = (UIAnnotationUIMore) t.LJLILLLLZI;
                if (uIAnnotationUIMore != null) {
                    uIAnnotationAssetType = ((UIAnnotationAssetUIMore) uIAnnotationUIMore).getAssetType();
                } else {
                    uIAnnotationAssetType = UIAnnotationAssetType.UIAnnotationAssetType_Unknown;
                }
                if (uIAnnotationAssetType != UIAnnotationAssetType.UIAnnotationAssetType_Video) {
                    UIAnnotationUIMore uIAnnotationUIMore2 = (UIAnnotationUIMore) t.LJLILLLLZI;
                    if (uIAnnotationUIMore2 != null) {
                        i = ((UIAnnotationAssetUIMore) uIAnnotationUIMore2).getMinCount();
                    } else {
                        i = 1;
                    }
                    UIAnnotationUIMore uIAnnotationUIMore3 = (UIAnnotationUIMore) t.LJLILLLLZI;
                    if (uIAnnotationUIMore3 != null) {
                        i2 = ((UIAnnotationAssetUIMore) uIAnnotationUIMore3).getMaxCount();
                    } else {
                        i2 = 1;
                    }
                    if ((i == 1 && i == i2) || i2 < i || i < 1) {
                        z = true;
                        z2 = false;
                    } else {
                        z = true;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                    i = 0;
                    i2 = 0;
                }
                return new C44946HkU(z, z2, i, i2, Boolean.valueOf(z), 32);
            }
        }
        return null;
    }

    public static boolean LJII(Effect effect) {
        Boolean bool;
        o.LJIIIZ(effect, "<this>");
        EffectExtraMET LJIIL = LJIIL(effect);
        if (LJIIL != null) {
            Boolean bool2 = LJIIL.allowExporting;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            Editor editor = LJIIL.editor;
            if (editor != null && (bool = editor.allowExporting) != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        if (!LJIIIZ(effect) || !LJIIJ(effect)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r2 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.XN6 r4 = LJFF(r5)
            r3 = 0
            if (r4 == 0) goto L2a
            monitor-enter(r4)
            com.bytedance.ies.effecteditor.swig.UIAnnotationParser r0 = r4.LIZ     // Catch: java.lang.Throwable -> L24
            com.bytedance.ies.effecteditor.swig.EEStdStringVector r0 = r0.getTags()     // Catch: java.lang.Throwable -> L24
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L24
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L24
            com.bytedance.ies.effecteditor.swig.UIAnnotationParser r0 = r4.LIZ     // Catch: java.lang.Throwable -> L24
            com.bytedance.ies.effecteditor.swig.EEStdStringVector r0 = r0.getTags()     // Catch: java.lang.Throwable -> L24
            r0.toArray(r1)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
        L27:
            r0 = 1
            if (r2 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            java.lang.String r1 = "tt-child-effect"
            if (r0 == 0) goto L38
            java.lang.String[] r0 = r4.LIZJ()
            boolean r3 = X.ORY.LJJIJIIJIL(r1, r0)
        L37:
            return r3
        L38:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser$EffectExtraMET r0 = LJIIL(r5)
            if (r0 == 0) goto L37
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser$Editor r0 = r0.editor
            if (r0 == 0) goto L37
            java.util.List<java.lang.String> r0 = r0.tags
            if (r0 == 0) goto L37
            boolean r3 = r0.contains(r1)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser.LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    public static boolean LJIIJ(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        if (C78685UuP.LJJJZ(LIZLLL(effect)) && LJII(effect) && C53560L0i.LIZ()) {
            return true;
        }
        return false;
    }

    public static String LJIIJJI(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        if (LJIIIIZZ(effect)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static EffectExtraMET LJIIL(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        LIZIZ(effect);
        try {
            return (EffectExtraMET) C75792yF.LIZ(effect.getSdkExtra(), EffectExtraMET.class);
        } catch (s e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AllowExporting json fail: ");
            LIZ2.append(e);
            H78.LJII(X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static String LJIILL(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        if (LJIIIIZZ(effect)) {
            return effect.getEffectId();
        }
        return "";
    }

    /* loaded from: classes7.dex */
    public static final class EffectExtraMET {

        @InterfaceC65349Pkn("allowExporting")
        public final Boolean allowExporting;

        @InterfaceC65349Pkn("editor")
        public final Editor editor;

        /* JADX WARN: Multi-variable type inference failed */
        public EffectExtraMET() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EffectExtraMET)) {
                return false;
            }
            EffectExtraMET effectExtraMET = (EffectExtraMET) obj;
            return o.LJ(this.allowExporting, effectExtraMET.allowExporting) && o.LJ(this.editor, effectExtraMET.editor);
        }

        public final int hashCode() {
            Boolean bool = this.allowExporting;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Editor editor = this.editor;
            return hashCode + (editor != null ? editor.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectExtraMET(allowExporting=");
            LIZ.append(this.allowExporting);
            LIZ.append(", editor=");
            LIZ.append(this.editor);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public EffectExtraMET(Boolean bool, Editor editor) {
            this.allowExporting = bool;
            this.editor = editor;
        }

        public /* synthetic */ EffectExtraMET(Boolean bool, Editor editor, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : editor);
        }
    }

    public static void LJIILJJIL(IC2 updateType, Effect effect, String videoPath) {
        XN9<?, ?>[] LIZIZ;
        XNE xne;
        o.LJIIIZ(updateType, "updateType");
        o.LJIIIZ(videoPath, "videoPath");
        String[] strArr = {videoPath};
        if (videoPath.length() == 0) {
            strArr = new String[0];
        }
        XN6 LJFF = LJFF(effect);
        if (LJFF != null && (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if (!(xn9 instanceof XNE) || (xne = (XNE) xn9) == null) {
                return;
            }
            xne.LIZJ(strArr, updateType.LIZ, null);
        }
    }

    public static void LJIILIIL(IC3 updateType, Effect effect, Bitmap[] images, C46223ICd c46223ICd) {
        XN9<?, ?>[] LIZIZ;
        XNE xne;
        o.LJIIIZ(updateType, "updateType");
        o.LJIIIZ(images, "images");
        XN6 LJFF = LJFF(effect);
        if (LJFF != null && (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if (!(xn9 instanceof XNE) || (xne = (XNE) xn9) == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DiyPropParser#previewImages startTime:");
            LIZ2.append(currentTimeMillis);
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
            xne.LIZJ(images, updateType.LIZ, new C46237ICr(c46223ICd, images, currentTimeMillis));
        }
    }
}
