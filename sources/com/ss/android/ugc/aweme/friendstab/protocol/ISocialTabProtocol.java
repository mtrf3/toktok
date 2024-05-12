package com.ss.android.ugc.aweme.friendstab.protocol;

import X.EnumC36206EIw;
import X.EnumC53981LGn;
import X.InterfaceC99233ux;
import X.LGQ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;

/* loaded from: classes10.dex */
public interface ISocialTabProtocol extends InterfaceC99233ux {
    void K(EnumC53981LGn enumC53981LGn);

    void LIZIZ();

    String LJIIIZ();

    Class<? extends Fragment> LJJJJZI();

    LGQ LLILIL();

    void LLJL();

    void Y();

    void a0(SocialFeedRedDotResponse socialFeedRedDotResponse, EnumC36206EIw enumC36206EIw);

    Bundle d(Context context);

    boolean enable();

    void f(String str);

    String getTag();

    void init(Context context);

    boolean isLoading();

    String w0(Context context);
}
