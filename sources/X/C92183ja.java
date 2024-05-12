package X;

import android.widget.PopupWindow;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92183ja {
    public final C99033ud LIZ;
    public final IMUser LIZIZ;
    public final MutableLiveData<C93063l0> LIZJ;
    public final MutableLiveData<Integer> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final C95003o8 LJFF;
    public final InterfaceC88472Yns<C109544Rq, AbstractC1041546x> LJI;
    public PopupWindow LJII;
    public boolean LJIIIIZZ;
    public ChatRoomViewModel LJIIIZ;
    public RecyclerView LJIIJ;
    public C1029242e LJIIJJI;

    public final boolean LIZIZ() {
        PopupWindow popupWindow = this.LJII;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public final void LIZ() {
        PopupWindow popupWindow;
        if (LIZIZ() && (popupWindow = this.LJII) != null) {
            popupWindow.dismiss();
        }
    }

    public C92183ja(C99033ud mSessionInfo, IMUser iMUser, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, AqS151S0100000_1 aqS151S0100000_1, C95003o8 c95003o8, C92203jc c92203jc) {
        o.LJIIIZ(mSessionInfo, "mSessionInfo");
        this.LIZ = mSessionInfo;
        this.LIZIZ = iMUser;
        this.LIZJ = mutableLiveData;
        this.LIZLLL = mutableLiveData2;
        this.LJ = aqS151S0100000_1;
        this.LJFF = c95003o8;
        this.LJI = c92203jc;
    }
}
