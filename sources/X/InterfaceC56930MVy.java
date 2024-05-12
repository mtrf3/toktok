package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.MVy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC56930MVy {
    void D();

    void G(TuxTextView tuxTextView, List list, Integer num, MusNotice musNotice, String str);

    void LIZJ();

    MVZ LJJIJL();

    void LLIILZL(String str, String str2, BaseNotice baseNotice, boolean z, String str3);

    boolean LLILII();

    String LLILIL();

    String LLJILJILJ();

    void LLJJJIL();

    void LLLIIIIL(int i);

    void LLLJL(User user, String str, String str2, String str3);

    boolean LLLL();

    int LLLLZI();

    C56927MVv LLZZ();

    Fragment getCurFragment();

    String getEnterFrom();

    List<InterfaceC56825MRx> getInterceptors();

    String getPageName();

    String getTabName();

    HashMap<String, String> r();

    void s();

    String t();
}
