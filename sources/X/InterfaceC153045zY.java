package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Surface;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC153045zY {
    int I7(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    void LIZ(int i, int i2, int i3, int i4);

    void LIZIZ();

    int LIZJ();

    void LJJIJLIJ(boolean z);

    void LJJLIIIIJ(int i);

    void LJZ(NLEModel nLEModel);

    int LJZL();

    float LL(String str);

    int LLD(int i, int i2, C6YZ c6yz);

    boolean LLF(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, InterfaceC134045Nw interfaceC134045Nw);

    void LLFF(InterfaceC133905Ni interfaceC133905Ni);

    void LLFFF(C1551266y c1551266y);

    boolean LLFII();

    int LLFZ(int i);

    int LLI(C5RU c5ru);

    void LLIFFJFJJ();

    void LLII();

    void LLIIII(InterfaceC134025Nu interfaceC134025Nu);

    void LLIIIILZ();

    void LLIIIJ();

    NLEModel LLIIIL();

    int LLIIIZ(VETimelineParams vETimelineParams, int i, int i2);

    void LLIIJI(InterfaceC88472Yns<? super Surface, C76800UCe> interfaceC88472Yns);

    void LLIIJLIL(InterfaceC133905Ni interfaceC133905Ni);

    int LLIIL(String str, int i, int i2, int i3);

    void LLIILII(InterfaceC88472Yns<? super Surface, C76800UCe> interfaceC88472Yns);

    boolean LLIILZL(String str, VEVideoEncodeSettings vEVideoEncodeSettings);

    VEEditorModel LLIIZ();

    int LLIL(int i, InterfaceC133855Nd interfaceC133855Nd);

    int LLILII(C5KG c5kg);

    int LLILIL();

    void LLILL(InterfaceC133905Ni interfaceC133905Ni);

    String LLILLIZIL(int i, int i2, int i3, String str);

    void LLILLJJLI(int i);

    int LLILLL(String str, String str2);

    VESize LLILZ();

    boolean LLILZIL(float f, int i);

    int LLILZLL();

    int LLIZ(int i, VEEditor.SET_RANGE_MODE set_range_mode);

    int LLIZLLLIL();

    void LLJ(int i, int i2);

    boolean LLJI(VEVideoEncodeSettings vEVideoEncodeSettings);

    void LLJIJIL(int i, int i2);

    void LLJILJIL(boolean z);

    int LLJILJILJ(VEVideoEncodeSettings vEVideoEncodeSettings);

    int LLJILLL();

    int LLJJ();

    int LLJJI(int i);

    VESize LLJJIII(int i, int i2);

    void LLJJIJI(float f, float f2, float f3, int i, int i2);

    int LLJJIJIIJIL(int i, ROTATE_DEGREE rotate_degree);

    int LLJJIJIL(VETimelineParams vETimelineParams);

    float LLJJJ();

    int LLJJJIL(int i, VEEditor.SEEK_MODE seek_mode);

    void LLJJJJ();

    int LLJJJJJIL(int i, VEEditor.SEEK_MODE seek_mode, InterfaceC133865Ne interfaceC133865Ne);

    int LLJJJJLIIL();

    String LLJJL();

    void LLJJLIIIJLLLLLLLZ();

    Bitmap LLJL();

    void LLJLIL(InterfaceC133835Nb interfaceC133835Nb);

    int LLJLILLLLZIIL(int i, int i2);

    Bitmap LLJLL(int i);

    int LLJLLIL(int i, ArrayList arrayList, ArrayList arrayList2);

    void LLJLLL(boolean z);

    int LLJZ(int[] iArr);

    VEMVAudioInfo LLJZIJLIL();

    int LLL();

    void LLLF();

    void LLLFF(C5SJ c5sj);

    void LLLFFI(VEEditor.SCALE_MODE scale_mode);

    int LLLFZ(int i, int i2);

    int LLLI(boolean[] zArr, C5RU c5ru);

    int LLLII(int[] iArr, int i, int i2, VEEditor.GET_FRAMES_FLAGS get_frames_flags, InterfaceC134015Nt interfaceC134015Nt);

    int LLLIIII(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2);

    int LLLIIIIL(int i);

    int LLLIIIL(boolean z);

    void LLLIIL(Bitmap bitmap);

    InterfaceC134035Nv LLLIILIL();

    void LLLIL(InterfaceC133845Nc interfaceC133845Nc);

    void LLLILZ(boolean z);

    int addImageSticker(String str, float f, float f2, float f3, float f4);

    int addInfoSticker(String str, String[] strArr);

    int cancelGenVideoFrame(int i);

    void destroy();

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    int getDuration();

    long getHandler();

    float[] getInfoStickerBoundingBox(int i);

    int getSrtInfoStickerInitPosition(int i, float[] fArr);

    VEEditor.VEState getState();

    String getWorkspace();

    int initBingoAlgorithm();

    int pause();

    int play();

    int prepare();

    String[] q0();

    int removeAllVideoSound();

    int removeInfoSticker(int i);

    int restoreAllVideoSound();

    int setInfoStickerAlpha(int i, float f);

    int setInfoStickerLayer(int i, int i2);

    int setInfoStickerPosition(int i, float f, float f2);

    int setInfoStickerRestoreMode(int i);

    int setInfoStickerRotation(int i, float f);

    int setInfoStickerScale(int i, float f);

    int setInfoStickerTime(int i, int i2, int i3);

    void stop();

    Rect t5();

    int updateAlgorithmFromNormal();

    int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);
}
