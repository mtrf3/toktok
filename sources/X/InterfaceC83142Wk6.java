package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfoCopy;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wk6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83142Wk6 {
    C29901Fi<ArrayList<BeautyComposerInfo>> A7();

    SafeMutableLiveData<Boolean> B7();

    List<ComposerBeauty> C7();

    void D7(C82942Wgs c82942Wgs);

    C83186Wko E7();

    void F7(ComposerBeauty composerBeauty);

    void G7();

    void H7(boolean z);

    void I7(boolean z, boolean z2);

    void J7(C83123Wjn c83123Wjn);

    String K7();

    void L7(String str, boolean z, C83124Wjo c83124Wjo);

    boolean LIZ();

    BeautyCategory LIZIZ();

    void LIZJ(boolean z);

    SafeMutableLiveData<List<BeautyComposerInfo>> LIZLLL();

    void LJ(String str, boolean z);

    boolean LJFF(String str, boolean z);

    List<BeautyCategory> M7();

    void N7(ComposerBeauty composerBeauty, InterfaceC83180Wki interfaceC83180Wki);

    List<BeautyCategory> O7();

    void P7();

    void Q7(ComposerBeauty composerBeauty);

    void R7(ComposerBeauty composerBeauty);

    BeautyFilterConfig S7();

    BeautifyUsedInfo T7(boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns);

    float U7(ComposerBeauty composerBeauty, String str, float f);

    void V7(ComposerBeauty composerBeauty);

    SafeMutableLiveData<List<BeautyComposerInfo>> W7();

    void X7(ComposerBeauty composerBeauty);

    void Y7();

    void Z7(ComposerBeauty composerBeauty, boolean z);

    void a8();

    String b8(ComposerBeauty composerBeauty);

    SafeMutableLiveData<ComposerBeauty> c8();

    void d8(BeautyCategory beautyCategory);

    void e8();

    void f8();

    SafeMutableLiveData<java.util.Map<String, Integer>> g8();

    void h8(BeautyCategory beautyCategory);

    SafeMutableLiveData<Integer> i8();

    BeautyMetadata j7();

    void j8();

    boolean k7(ComposerBeauty composerBeauty);

    void l7(C82942Wgs c82942Wgs);

    MBeautyStateInfoCopy m7();

    void n7();

    void o7(boolean z, ILU ilu);

    boolean p7();

    java.util.Map<String, C81017Vqv<BeautyComposerInfo>> q7();

    ComposerBeautyBuriedInfoCopy r7();

    void release();

    void s7();

    void t7(ComposerBeauty composerBeauty, String str, float f);

    void u7(ComposerBeauty composerBeauty);

    ComposerBeauty v7();

    ILU w7();

    SafeMutableLiveData<C65768PrY<ComposerBeauty>> x7();

    void y7(ComposerBeauty composerBeauty);

    C81017Vqv<BeautyComposerInfo> z7();
}
