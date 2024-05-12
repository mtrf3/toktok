package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;

/* renamed from: X.6Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC158076Ih extends C0I6 {
    void Bs0(InterfaceC87207YKl interfaceC87207YKl);

    void DY(YKR ykr);

    void F8(boolean z);

    C0IB<Boolean> H3();

    void J6();

    void K3(boolean z);

    InterfaceC158086Ii LIZ();

    boolean LIZLLL();

    boolean LJIIIIZZ();

    void LJIIL(MutableLiveData<Boolean> mutableLiveData);

    void LJIILIIL(boolean z);

    void LJJIJIIJIL(int i);

    void LJJJJ();

    boolean LJJL();

    boolean LJLIL();

    void LJLL();

    void LJLLLLLL(boolean z);

    List<YKR> LJZL();

    void LLILLIZIL(OSZ<Integer, Integer> osz);

    C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI();

    void LLILZ();

    void LLJLL();

    void LLLILZ(InterfaceC88472Yns<? super YKR, C76800UCe> interfaceC88472Yns);

    void LLLIZZ(boolean z);

    boolean LLLLILI();

    void LLLLZ(InterfaceC88471Ynr<? super YKR, ? super YKR, C76800UCe> interfaceC88471Ynr);

    C29901Fi<C76800UCe> LLZZZZ();

    void P8(boolean z);

    void Qu0(String str);

    void R7();

    List<TextStickerData> S2();

    List<InteractStickerStruct> S7(Context context, List<? extends StickerItemModel> list, Gson gson);

    void T3();

    void U90();

    void W2(InterfaceC88472Yns<? super YKR, C76800UCe> interfaceC88472Yns);

    boolean X1();

    void c7(View.OnClickListener onClickListener);

    void d2(boolean z);

    LiveData<TextStickerData> g3();

    void g5(boolean z);

    String getTextContent();

    void h6(boolean z);

    void j();

    void ko(YKR ykr);

    void l9(TextWatcher textWatcher);

    C29901Fi<Boolean> o();

    void setEnable(boolean z);

    void show();

    void wI();

    void z90(YKR ykr);
}
