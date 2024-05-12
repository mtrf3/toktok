package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.InvitationCardInboxWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.4Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC109664Sc {
    SQR LIZ(Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager);

    boolean LIZIZ();

    void LIZJ(FragmentManager fragmentManager, C36W c36w, String str);

    TopNoticeInboxWidget LIZLLL(InboxFragment inboxFragment, LiveData liveData, AqS151S0100000_1 aqS151S0100000_1);

    boolean LJ();

    void LJFF();

    int LJI(C65776Prg c65776Prg);

    MafChatListWidget LJII(InboxFragment inboxFragment, LiveData liveData);

    InvitationCardInboxWidget LJIIIIZZ(InboxFragment inboxFragment, LiveData liveData);

    InboxAdapterWidget LJIIIZ(InboxFragment inboxFragment, LiveData liveData, boolean z);

    boolean LJIIJ(String str, Lifecycle.State state);

    C96803r2 LJIIJJI(ActivityC45651qj activityC45651qj, ViewGroup viewGroup, int i);

    void LJIIL();
}
