package com.ss.android.vesdk;

import X.C06460Ne;
import X.C16880lQ;
import X.C63867P4t;
import X.InterfaceC87311YOl;
import X.InterfaceC87312YOm;
import X.P4Q;
import X.Q4K;
import X.Q7K;
import X.VE9;
import X.X1D;
import X.YOC;
import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.jni.TEStikcerInterface;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class VEStickerInvoker implements YOC {
    public final TEInterface mNativeEditor;
    public final TEStikcerInterface mNativeStickerHandler;
    public int mStickerAnimationPreviewDuration = 3000;
    public float mStickerAnimationPreviewFps = 30.0f;
    public final VEEditor mVEEditor;

    public int addInfoStickerWithBuffer() {
        int LIZIZ;
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "addInfoStickerWithBuffer...");
            LIZIZ = this.mNativeStickerHandler.LIZIZ();
        }
        return LIZIZ;
    }

    public int begin2DBrush() {
        return this.mNativeStickerHandler.LIZLLL();
    }

    @Override // X.YOC
    public void clearNativeFromSticker() {
        this.mNativeStickerHandler.LIZ = 0L;
    }

    public int get2DBrushStrokeCount() {
        return this.mNativeStickerHandler.LJIIJ();
    }

    public int getTextLimitCount() {
        return this.mNativeStickerHandler.LJJIFFI();
    }

    public boolean is2DBrushEmpty() {
        if (this.mNativeStickerHandler.LJIIJ() == 0) {
            return true;
        }
        return false;
    }

    public int stopStickerAnimationPreview() {
        int LJI;
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "stopStickerAnimationPreview");
            LJI = this.mNativeStickerHandler.LJI(false, 0, 0);
        }
        return LJI;
    }

    public int undo2DBrush() {
        return this.mNativeStickerHandler.LJJJJJL();
    }

    public VEStickerInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLIIII;
        this.mNativeEditor = tEInterface;
        this.mNativeStickerHandler = new TEStikcerInterface(tEInterface.getNativeHandler());
    }

    public int addEmojiSticker(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addEmojiSticker... utf8Code: ");
        LIZ.append(str);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            P4Q.LIZJ("VEEditor_VEStickerInvoker", "addEmojiSticker error, utf8Code is null");
            return -100;
        }
        return addInfoSticker(str, new String[]{"lv_emoji"});
    }

    public int addTextSticker(String str) {
        int addInfoSticker;
        if (TextUtils.isEmpty(str)) {
            P4Q.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            return -100;
        }
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "addTextSticker...");
            addInfoSticker = addInfoSticker(str, new String[]{"lv_new_text"});
        }
        return addInfoSticker;
    }

    public int beginInfoStickerPin(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin beginInfoStickerPin... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJ = this.mNativeStickerHandler.LJ(i);
            if (LJ < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin beginInfoStickerPin... faild ret:");
                LIZ2.append(LJ);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJ;
            }
            return LJ;
        }
    }

    public int cancelInfoStickerPin(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin cancelInfoStickerPin... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJFF = this.mNativeStickerHandler.LJFF(i);
            if (LJFF < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin cancelInfoStickerPin... faild ret:");
                LIZ2.append(LJFF);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJFF;
            }
            return LJFF;
        }
    }

    public int deleteSticker(int i) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "deleteSticker...");
        if (i < 0) {
            return -100;
        }
        return this.mNativeStickerHandler.LJII(i);
    }

    public int end2DBrush(String str) {
        return this.mNativeStickerHandler.LJIIIZ(str);
    }

    @Override // X.YOC
    public float[] getInfoStickerBoundingBox(int i) {
        float[] LJIIJJI;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getInfoStickerBoundingBox... index: ");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i >= 0) {
                LJIIJJI = this.mNativeStickerHandler.LJIIJJI(i, true);
            } else {
                throw new VEException(-100, "");
            }
        }
        return LJIIJJI;
    }

    public float[] getInfoStickerBoundingBoxWithoutRotate(int i) {
        float[] LJIIJJI;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getInfoStickerBoundingBox... index:");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i >= 0) {
                LJIIJJI = this.mNativeStickerHandler.LJIIJJI(i, false);
            } else {
                throw new VEException(-100, "");
            }
        }
        return LJIIJJI;
    }

    public boolean getInfoStickerIsDynamic(int i) {
        return this.mNativeStickerHandler.LJIILIIL(i);
    }

    public int getInfoStickerPinState(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin getInfoStickerPinState... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJIILL = this.mNativeStickerHandler.LJIILL(i);
            if (LJIILL < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin getInfoStickerPinState... faild ret:");
                LIZ2.append(LJIILL);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJIILL;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("infoStickerPin getInfoStickerPinState... state:");
            LIZ3.append(LJIILL);
            P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ3));
            return LJIILL;
        }
    }

    public float getInfoStickerRotate(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin getInfoStickerRotate... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100.0f;
            }
            float LJIIZILJ = this.mNativeStickerHandler.LJIIZILJ(i);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("infoStickerPin getInfoStickerRotate... ret:");
            LIZ2.append(LJIIZILJ);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
            return LJIIZILJ;
        }
    }

    public float getInfoStickerScale(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin getInfoStickerScale... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100.0f;
            }
            float LJIJ = this.mNativeStickerHandler.LJIJ(i);
            if (LJIJ < 0.0f) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin getInfoStickerScale... faild ret:");
                LIZ2.append(LJIJ);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJIJ;
            }
            return LJIJ;
        }
    }

    public String getInfoStickerTemplateParams(String str) {
        String LJIJJ;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[getInfoStickerTemplateParams] path: ");
            LIZ.append(str);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (str.trim().length() != 0) {
                LJIJJ = this.mNativeStickerHandler.LJIJJ(str);
            } else {
                throw new VEException(-100, "empty or blank path");
            }
        }
        return LJIJJ;
    }

    public boolean getInfoStickerVisible(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin getInfoStickerVisible... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return true;
            }
            boolean LJIJJLI = this.mNativeStickerHandler.LJIJJLI(i);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("infoStickerPin  getInfoStickerVisible... ret:");
            LIZ2.append(LJIJJLI);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
            return LJIJJLI;
        }
    }

    public int getTextContent(InterfaceC87312YOm interfaceC87312YOm) {
        return this.mNativeStickerHandler.LJJI();
    }

    public boolean isInfoStickerAnimatable(int i) {
        boolean LJJII;
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "isInfoStickerAnimatable...");
            LJJII = this.mNativeStickerHandler.LJJII(i);
        }
        return LJJII;
    }

    public int notifyHideKeyBoard(boolean z) {
        return this.mNativeStickerHandler.LJJIII(z);
    }

    public int pauseEffectAudio(boolean z) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "pauseEffectAudio");
        int LJJIIJ = this.mNativeStickerHandler.LJJIIJ(z);
        if (LJJIIJ != 0) {
            Q7K.LJ("pauseEffectAudio failed, ret = ", LJJIIJ, "VEEditor_VEStickerInvoker");
        }
        return LJJIIJ;
    }

    public int pauseInfoStickerAnimation(boolean z) {
        int LJJIIJZLJL;
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "pauseInfoStickerAnimation...");
            LJJIIJZLJL = this.mNativeStickerHandler.LJJIIJZLJL(z);
        }
        return LJJIIJZLJL;
    }

    @Override // X.YOC
    public int removeInfoSticker(int i) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeInfoSticker... index: ");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            this.mVEEditor.LLJILJILJ.LIZJ(1, i);
            return this.mNativeStickerHandler.LJJIIZ(i);
        }
    }

    public int set2DBrushCanvasAlpha(float f) {
        return this.mNativeStickerHandler.LJJIJ(f);
    }

    public int set2DBrushColor(int i) {
        return this.mNativeStickerHandler.LJJIJIIJI(((i >>> 16) & 255) * 0.003921569f, ((i >>> 8) & 255) * 0.003921569f, (i & 255) * 0.003921569f, ((i >>> 24) & 255) * 0.003921569f);
    }

    public int set2DBrushSize(float f) {
        return this.mNativeStickerHandler.LJJIJIIJIL(f);
    }

    public int setEffectBgmEnable(boolean z) {
        int LJJIJIL = this.mNativeStickerHandler.LJJIJIL(z);
        if (LJJIJIL != 0) {
            Q7K.LJ("setEffectBgmEnable failed, ret = ", LJJIJIL, "VEEditor_VEStickerInvoker");
        }
        return LJJIJIL;
    }

    public int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "setInfoStickerBufferCallback...");
        return this.mNativeStickerHandler.LJJIL(vEInfoStickerBufferListener);
    }

    public int setInfoStickerCallSync(boolean z) {
        int LJJIZ;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerCallSync... ");
            LIZ.append(z);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            LJJIZ = this.mNativeStickerHandler.LJJIZ(z);
        }
        return LJJIZ;
    }

    @Override // X.YOC
    public int setInfoStickerRestoreMode(int i) {
        Q4K.LJ("infoStickerPin setInfoStickerRestoreMode... index:", i, "VEEditor_VEStickerInvoker");
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJJJ = this.mNativeStickerHandler.LJJJ(i);
            if (LJJJ < 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("infoStickerPin setInfoStickerRestoreMode... faild ret:");
                LIZ.append(LJJJ);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
                return LJJJ;
            }
            return LJJJ;
        }
    }

    public int setLanguage(String str) {
        return this.mNativeStickerHandler.LJJJIL(str);
    }

    public int setTextBitmapCallback(InterfaceC87311YOl interfaceC87311YOl) {
        return this.mNativeStickerHandler.LJJJJIZL();
    }

    public int stopInfoStickerPin(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin stopInfoStickerPin... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJJJJJ = this.mNativeStickerHandler.LJJJJJ(i);
            if (LJJJJJ < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin stopInfoStickerPin... faild ret:");
                LIZ2.append(LJJJJJ);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJJJJJ;
            }
            return LJJJJJ;
        }
    }

    public String getInfoStickerTemplateParams(int i) {
        String LJIJI;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getInfoStickerTemplateParams... index: ");
            LIZ.append(i);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i >= 0) {
                LJIJI = this.mNativeStickerHandler.LJIJI(i);
            } else {
                throw new VEException(-100, "");
            }
        }
        return LJIJI;
    }

    @Override // X.YOC
    public int addInfoSticker(String str, String[] strArr) {
        int LIZ;
        int i;
        P4Q.LJFF("VEEditor_VEStickerInvoker", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        synchronized (this.mVEEditor) {
            LIZ = this.mNativeStickerHandler.LIZ(str, strArr);
        }
        VE9 ve9 = new VE9();
        ve9.LIZ = str;
        this.mVEEditor.LLJILJILJ.LIZ(LIZ, ve9);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addInfoSticker success with index ");
        LIZ2.append(LIZ);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (LIZ >= 0) {
                i = 0;
            } else {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZ;
    }

    public int addInfoStickerOrEmoji(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addInfoStickerOrEmoji... path: ");
        LIZ.append(str);
        LIZ.append(", utf8Code: ");
        LIZ.append(str2);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            return addEmojiSticker(str2);
        }
        return addInfoSticker(str, new String[]{"default"});
    }

    public int addInfoStickerTemplate(String str, String str2) {
        int LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addInfoStickerTemplate ... path : ");
        LIZ2.append(str);
        LIZ2.append(" params: ");
        LIZ2.append(str2);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        int i = 0;
        String[] strArr = {"lv_info_sticker_template", str2};
        synchronized (this.mVEEditor) {
            LIZ = this.mNativeStickerHandler.LIZ(str, strArr);
        }
        VE9 ve9 = new VE9();
        ve9.LIZ = str;
        this.mVEEditor.LLJILJILJ.LIZ(LIZ, ve9);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addInfoStickerTemplate success with index ");
        LIZ3.append(LIZ);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ3));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (LIZ < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZ;
    }

    public int addTextStickerWithInitInfo(String str, String str2) {
        int addInfoStickerWithInitInfo;
        if (TextUtils.isEmpty(str)) {
            P4Q.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            return -100;
        }
        if (TextUtils.isEmpty(str2)) {
            P4Q.LIZJ("VEEditor_VEStickerInvoker", "addTextSticker error, initInfoJson is null");
            return -100;
        }
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "addTextSticker...");
            addInfoStickerWithInitInfo = addInfoStickerWithInitInfo(str, new String[]{"lv_new_text"}, str2);
        }
        return addInfoStickerWithInitInfo;
    }

    public int enableStickerAnimationPreview(int i, boolean z) {
        int LJIIIIZZ;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableStickerAnimationPreview index:");
            LIZ.append(i);
            LIZ.append(", enable:");
            LIZ.append(z);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            LJIIIIZZ = this.mNativeStickerHandler.LJIIIIZZ(i, z);
        }
        return LJIIIIZZ;
    }

    public int enableStickerResourceLoadSync(int i, boolean z) {
        return this.mNativeEditor.setFilterParam(i, "effect sync load resource", String.valueOf(z));
    }

    public int forceUpdateInfoSticker(int i, boolean z) {
        String str;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("forceUpdateInfoSticker... index: ");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            TEInterface tEInterface = this.mNativeEditor;
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            return tEInterface.setFilterParam(i, "entity data force update", str);
        }
    }

    public int getInfoStickerFlip(int i, boolean[] zArr) {
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "getInfoStickerFlip...");
            if (i < 0 || zArr.length != 2) {
                return -100;
            }
            return this.mNativeStickerHandler.LJIIL(i, zArr);
        }
    }

    public int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin getInfoStickerPinData... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJIILJJIL = this.mNativeStickerHandler.LJIILJJIL(i, byteBufferArr);
            if (LJIILJJIL < 0) {
                P4Q.LIZJ("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... faild ");
                return LJIILJJIL;
            }
            return LJIILJJIL;
        }
    }

    public int getInfoStickerPosition(int i, float[] fArr) {
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "getInfoStickerPosition...");
            if (i < 0 || fArr.length != 2) {
                return -100;
            }
            return this.mNativeStickerHandler.LJIILLIIL(i, fArr);
        }
    }

    @Override // X.YOC
    public int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        synchronized (this.mVEEditor) {
            P4Q.LJFF("VEEditor_VEStickerInvoker", "getSrtInfoStickerInitPosition...");
            if (i < 0 || fArr.length != 2) {
                return -100;
            }
            return this.mNativeStickerHandler.LJIL(i, fArr);
        }
    }

    public int restoreInfoStickerPinWithData(int i, ByteBuffer byteBuffer) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin setInfoStickerPinWithFile... index:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJJIIZI = this.mNativeStickerHandler.LJJIIZI(i, byteBuffer);
            if (LJJIIZI < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin setInfoStickerPinWithFile... faild ret:");
                LIZ2.append(LJJIIZI);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return LJJIIZI;
            }
            return LJJIIZI;
        }
    }

    @Override // X.YOC
    public int setInfoStickerAlpha(int i, float f) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerAlpha... index: ");
            LIZ.append(i);
            LIZ.append("alpha: ");
            LIZ.append(f);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity alpha", String.valueOf(f));
        }
    }

    @Override // X.YOC
    public int setInfoStickerLayer(int i, int i2) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerLayer... index: ");
            LIZ.append(i);
            LIZ.append("layer: ");
            LIZ.append(i2);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity layer", String.valueOf(i2));
        }
    }

    @Override // X.YOC
    public int setInfoStickerRotation(int i, float f) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerRotation... index: ");
            LIZ.append(i);
            LIZ.append("degree: ");
            LIZ.append(f);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity rotation", String.valueOf(f));
        }
    }

    @Override // X.YOC
    public int setInfoStickerScale(int i, float f) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerScale... index: ");
            LIZ.append(i);
            LIZ.append("scale: ");
            LIZ.append(f);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity scale x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity scale y", String.valueOf(f));
        }
    }

    public float setInfoStickerScaleSync(int i, float f) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerScaleSync... index: ");
            LIZ.append(i);
            LIZ.append("scale: ");
            LIZ.append(f);
            P4Q.LIZ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100.0f;
            }
            return this.mNativeStickerHandler.LJJJI(f, i);
        }
    }

    public int setInfoStickerTemplateParams(int i, String str) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerTemplateParams... index: ");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity template param", str);
        }
    }

    public int setInfoStickerVisible(int i, boolean z) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerVisible... index: ");
            LIZ.append(i);
            LIZ.append(" visible: ");
            LIZ.append(z);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity visible", String.valueOf(z));
        }
    }

    public int setSrtColor(int i, int i2) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtColor");
            if (i < 0) {
                return -100;
            }
            P4Q.LIZJ("VEEditor_VEStickerInvoker", "");
            int i3 = (i2 >>> 24) & 255;
            int i4 = (i2 >>> 16) & 255;
            int i5 = (i2 >>> 8) & 255;
            int i6 = i2 & 255;
            StringBuilder LIZJ = C06460Ne.LIZJ("aa=", i3, ", rr=", i4, ", gg=");
            LIZJ.append(i5);
            LIZJ.append(", bb=");
            LIZJ.append(i6);
            P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZJ));
            float f = i3 * 0.003921569f;
            float f2 = i4 * 0.003921569f;
            float f3 = i5 * 0.003921569f;
            float f4 = i6 * 0.003921569f;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("a=");
            LIZ.append(f);
            LIZ.append(", r=");
            LIZ.append(f2);
            LIZ.append(", g=");
            LIZ.append(f3);
            LIZ.append(", b=");
            LIZ.append(f4);
            P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            return this.mNativeEditor.setFilterParam(i, "entity srt color b", String.valueOf(f4)) + this.mNativeEditor.setFilterParam(i, "entity srt color g", String.valueOf(f3)) + this.mNativeEditor.setFilterParam(i, "entity srt color r", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt color a", String.valueOf(f));
        }
    }

    public int setSrtFont(int i, String str) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtFont");
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity srt font", str);
        }
    }

    public int setSrtManipulateState(int i, boolean z) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtManipulateState");
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity srt manipulate state", String.valueOf(z));
        }
    }

    public int setStickerAnimator(int i, VEStickerAnimator vEStickerAnimator) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "addAnimator...");
        if (i < 0 || vEStickerAnimator == null) {
            return -100;
        }
        int LJJ = this.mNativeStickerHandler.LJJ(i);
        if (LJJ < 0) {
            return LJJ;
        }
        return this.mNativeEditor.setFilterParam(LJJ, "animator", vEStickerAnimator);
    }

    public int setStickerPinArea(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("infoStickerPin, setStickerPinArea, index: ");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
        synchronized (this.mVEEditor) {
            if (i < 0) {
                return -100;
            }
            int LJJJJI = this.mNativeStickerHandler.LJJJJI(i, vEStickerPinAreaParam);
            if (LJJJJI < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("infoStickerPin, setStickerPinArea, fail, ret: ");
                LIZ2.append(LJJJJI);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
            }
            return LJJJJI;
        }
    }

    public int startStickerAnimationPreview(int i, int i2) {
        int LJI;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startStickerAnimationPreview duration:");
            LIZ.append(i);
            LIZ.append(", mode:");
            LIZ.append(i2);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            this.mStickerAnimationPreviewDuration = i;
            LJI = this.mNativeStickerHandler.LJI(true, i, i2);
        }
        return LJI;
    }

    public int updateTextSticker(int i, String str) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateTextSticker... index: ");
            LIZ.append(i);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeStickerHandler.LJJJJL(i, str);
        }
    }

    public int addInfoStickerWithInitInfo(String str, String[] strArr, String str2) {
        int length;
        int LIZ;
        P4Q.LJFF("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int max = Math.max(5, length);
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 < length) {
                linkedList.add(strArr[i2]);
            } else {
                linkedList.add("");
            }
        }
        linkedList.add(4, str2);
        String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addInfoStickerWithInitInfo ... params: ");
        LIZ2.append(linkedList.toString());
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
        synchronized (this.mVEEditor) {
            LIZ = this.mNativeStickerHandler.LIZ(str, strArr2);
        }
        VE9 ve9 = new VE9();
        ve9.LIZ = str;
        this.mVEEditor.LLJILJILJ.LIZ(LIZ, ve9);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addInfoStickerWithInitInfo success with index ");
        LIZ3.append(LIZ);
        P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ3));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (LIZ < 0) {
                i = -1;
            }
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_editor_info_sticker", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZ;
    }

    public int setEffectFontPath(int i, String str, int i2) {
        int LJJIJL;
        synchronized (this.mVEEditor) {
            LJJIJL = this.mNativeStickerHandler.LJJIJL(i2, str);
            if (LJJIJL != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setEffectFontPath failed, ret = ");
                LIZ.append(LJJIJL);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            }
            this.mNativeEditor.setFilterParam(i, "effect font path", str);
            TEInterface tEInterface = this.mNativeEditor;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i2);
            LIZ2.append("");
            tEInterface.setFilterParam(i, "effect face index", X1D.LIZIZ(LIZ2));
        }
        return LJJIJL;
    }

    public int setInfoStickerFlip(int i, boolean z, boolean z2) {
        String str;
        String str2;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerFlip... index: ");
            LIZ.append(i);
            LIZ.append("flipX: ");
            LIZ.append(z);
            LIZ.append("flipY: ");
            LIZ.append(z2);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setInfoStickerFlip... failed index is wrong : ");
                LIZ2.append(i);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ2));
                return -100;
            }
            TEInterface tEInterface = this.mNativeEditor;
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            int filterParam = tEInterface.setFilterParam(i, "entity flip x", str);
            TEInterface tEInterface2 = this.mNativeEditor;
            if (z2) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            return filterParam + tEInterface2.setFilterParam(i, "entity flip y", str2);
        }
    }

    @Override // X.YOC
    public int setInfoStickerPosition(int i, float f, float f2) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerPosition... index: ");
            LIZ.append(i);
            LIZ.append("offsetX: ");
            LIZ.append(f);
            LIZ.append("offsetY: ");
            LIZ.append(f2);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity position x", String.valueOf(f)) + this.mNativeEditor.setFilterParam(i, "entity position y", String.valueOf(f2));
        }
    }

    @Override // X.YOC
    public int setInfoStickerTime(int i, int i2, int i3) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInfoStickerTime... index: ");
            LIZ.append(i);
            LIZ.append("startTime: ");
            LIZ.append(i2);
            LIZ.append("endTime: ");
            LIZ.append(i3);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            VE9 ve9 = (VE9) ((HashMap) this.mVEEditor.LLJILJILJ.LIZIZ).get(Integer.valueOf(i));
            if (ve9 != null) {
                ve9.LIZIZ = i2;
                ve9.LIZJ = i3 - i2;
            }
            return this.mNativeEditor.setFilterParam(i, "entity start time", String.valueOf(i2)) + this.mNativeEditor.setFilterParam(i, "entity end time", String.valueOf(i3));
        }
    }

    public int setSrtInfo(int i, int i2, String str) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtInfo");
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity srt", String.valueOf(true)) + this.mNativeEditor.setFilterParam(i, "entity srt info", str) + this.mNativeEditor.setFilterParam(i, "entity audio start time", String.valueOf(i2));
        }
    }

    public int setSrtInitialPosition(int i, float f, float f2) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtInitialPosition");
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity srt first", String.valueOf(true)) + this.mNativeEditor.setFilterParam(i, "entity srt initial position y", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i, "entity srt initial position x", String.valueOf(f));
        }
    }

    @Override // X.YOC
    public int addImageSticker(String str, float f, float f2, float f3, float f4) {
        int LIZ;
        P4Q.LJFF("VEEditor_VEStickerInvoker", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(0)};
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("width", f3);
            jSONObject.put("height", f4);
            c.LIZ("vesdk_event_editor_image_sticker", "behavior", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        synchronized (this.mVEEditor) {
            LIZ = this.mNativeStickerHandler.LIZ(str, strArr);
        }
        return LIZ;
    }

    public int addImageStickerWithRatio(String str, float f, float f2, float f3, float f4) {
        int LIZ;
        P4Q.LJFF("VEEditor_VEStickerInvoker", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(1)};
        synchronized (this.mVEEditor) {
            LIZ = this.mNativeStickerHandler.LIZ(str, strArr);
        }
        return LIZ;
    }

    public int setEffectInputText(int i, String str, int i2, int i3, String str2) {
        int LJJIJLIJ;
        synchronized (this.mVEEditor) {
            LJJIJLIJ = this.mNativeStickerHandler.LJJIJLIJ(i2, i3, str, str2);
            if (LJJIJLIJ != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setEffectInputText failed, ret = ");
                LIZ.append(LJJIJLIJ);
                P4Q.LIZJ("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            }
            this.mNativeEditor.setFilterParam(i, "effect inputtext", str);
            TEInterface tEInterface = this.mNativeEditor;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i2);
            LIZ2.append("");
            tEInterface.setFilterParam(i, "effect inputtext arg1", X1D.LIZIZ(LIZ2));
            TEInterface tEInterface2 = this.mNativeEditor;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(i3);
            LIZ3.append("");
            tEInterface2.setFilterParam(i, "effect inputtext arg2", X1D.LIZIZ(LIZ3));
            this.mNativeEditor.setFilterParam(i, "effect inputtext arg3", str2);
        }
        return LJJIJLIJ;
    }

    public int setSrtAudioInfo(int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (this.mVEEditor) {
            P4Q.LIZ("VEEditor_VEStickerInvoker", "setSrtAudioInfo");
            if (i < 0) {
                return -100;
            }
            return this.mNativeEditor.setFilterParam(i, "entity srt audio cycle", String.valueOf(z)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimOut", String.valueOf(i5)) + this.mNativeEditor.setFilterParam(i, "entity srt audio trimIn", String.valueOf(i4)) + this.mNativeEditor.setFilterParam(i, "entity srt audio seqIn", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i, "entity srt audio index", String.valueOf(i2));
        }
    }

    public int addSticker(String str, int i, int i2, float f, float f2, float f3, float f4) {
        return addSticker(str, i, i2, 0, i2 - i, f, f2, f3, f4);
    }

    public int addExtRes(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "addSticker...");
        if (i > i2 || i < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        return this.mNativeStickerHandler.LIZJ(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, f3, f4, f, f2);
    }

    public int addSticker(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        P4Q.LJII("VEEditor_VEStickerInvoker", "addSticker...");
        if (i > i2 || i < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veeditor_import_sticker", null);
        return this.mNativeStickerHandler.LIZJ(new String[]{str}, new int[]{i}, new int[]{i2}, new int[]{i3}, new int[]{i4}, f3, f4, f, f2);
    }

    public int setStickerAnimation(int i, boolean z, String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6) {
        int LJJJJ;
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setStickerAnimation... index:");
            LIZ.append(i);
            LIZ.append(", loop:");
            LIZ.append(z);
            LIZ.append(", inPath:");
            LIZ.append(str);
            LIZ.append(", inDuration:");
            LIZ.append(i2);
            LIZ.append(", outPath:");
            LIZ.append(str2);
            LIZ.append(", outDuration:");
            LIZ.append(i3);
            P4Q.LJFF("VEEditor_VEStickerInvoker", X1D.LIZIZ(LIZ));
            LJJJJ = this.mNativeStickerHandler.LJJJJ(i, z, str, i2, str2, i3, str3, i4, i5, i6);
        }
        return LJJJJ;
    }
}
