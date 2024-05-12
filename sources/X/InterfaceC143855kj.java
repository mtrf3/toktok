package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC143855kj extends C0I6 {
    void Ba();

    void D0(int i);

    MutableLiveData<Integer> E0();

    XS5 Fr();

    LiveData<C76800UCe> Ht0();

    MutableLiveData<Integer> J9();

    void Jp(NLEModel nLEModel);

    void Kw(long j);

    void LE();

    void MP(VideoPublishEditModel videoPublishEditModel, InterfaceC143655kP interfaceC143655kP);

    LiveEvent<List<TextStickerData>> Ms();

    LiveEvent<Long> OM();

    void So(boolean z);

    LiveEvent<C76800UCe> So0();

    C0IB<List<CaptionUtterance>> Wh();

    void X30(List<CaptionUtterance> list);

    boolean Xg();

    LiveEvent<C76800UCe> Yf();

    void bi(C5K1 c5k1);

    LiveData<C76800UCe> ga0();

    void hide();

    LiveData<C5K1> lf();

    void ml(OSZ<String, Integer> osz);

    void notifyMusicChange();

    void oR();

    MutableLiveData<OSZ<String, Integer>> p3();

    void rf0();

    void sa0(ArrayList<TextStickerData> arrayList);

    void sc0();

    void show();

    void u8(int i);

    void v2(int i);

    LiveData<Boolean> wt();

    void xc();

    void xn0(ArrayList<TextStickerData> arrayList);

    MutableLiveData<Integer> z1();
}
