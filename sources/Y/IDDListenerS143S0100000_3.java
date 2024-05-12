package Y;

import X.AQI;
import X.ASQ;
import X.C176996x5;
import X.C196157mt;
import X.C197957pn;
import X.C198047pw;
import X.C207988Eg;
import X.C226998vX;
import X.C73W;
import X.HG3;
import X.InterfaceC65784Pro;
import X.M78;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.nows.publish.ui.NowsTurnOnNotifyPermissionFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDDListenerS143S0100000_3 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            case 8:
                onDismiss$8(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS143S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        CommentListFragment commentListFragment;
        C73W c73w;
        List<T> list;
        Fragment fragment = ((C176996x5) iDDListenerS143S0100000_3.l0).LJLJI;
        if (!(fragment instanceof CommentListFragment) || (c73w = (commentListFragment = (CommentListFragment) fragment).LLILII) == null || (list = c73w.mmItems) == 0) {
            return;
        }
        User curUser = HG3.LJIILL().getCurUser();
        int[] iArr = {-1, -1};
        for (int i = 0; i < list.size(); i++) {
            User user = ((Comment) ListProtector.get(list, i)).getUser();
            if (user != null && TextUtils.equals(user.getUid(), curUser.getUid())) {
                user.setNickname(curUser.getNickname());
                user.setAvatarThumb(curUser.getAvatarThumb());
                if (iArr[0] == -1) {
                    iArr[0] = i;
                }
                iArr[1] = i;
            }
        }
        int i2 = iArr[0];
        if (i2 <= -1) {
            return;
        }
        commentListFragment.LLILII.notifyItemRangeChanged(i2, (iArr[1] - i2) + 1);
    }

    public static final void onDismiss$1(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        C226998vX c226998vX = (C226998vX) iDDListenerS143S0100000_3.l0;
        if (c226998vX != null) {
            c226998vX.dismiss();
        }
        PopupManager.LIZJ(C207988Eg.class);
    }

    public static final void onDismiss$2(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS143S0100000_3.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onDismiss$3(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        ((ProfileViewerFragment) iDDListenerS143S0100000_3.l0).vl().gv0("pop_up");
    }

    public static final void onDismiss$4(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        ((M78) iDDListenerS143S0100000_3.l0).LIZ();
    }

    public static final void onDismiss$5(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        ((M78) iDDListenerS143S0100000_3.l0).LIZ();
    }

    public static final void onDismiss$6(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        ((NowsTurnOnNotifyPermissionFragment) iDDListenerS143S0100000_3.l0).LJLJJI.onDismiss(dialogInterface);
    }

    public static final void onDismiss$7(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface dialogInterface) {
        ((AQI) iDDListenerS143S0100000_3.l0).LJLJI.LIZ();
    }

    public static final void onDismiss$8(IDDListenerS143S0100000_3 iDDListenerS143S0100000_3, DialogInterface it) {
        PopupManager.LIZJ(C197957pn.class);
        o.LJIIIIZZ(it, "it");
        if (!(ASQ.LJIIIIZZ(it) instanceof C198047pw)) {
            C196157mt.LJFF(((C197957pn) iDDListenerS143S0100000_3.l0).LJLIL, "close");
        }
    }
}
