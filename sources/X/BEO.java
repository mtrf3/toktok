package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.anchor.HostInfo;

/* loaded from: classes6.dex */
public final class BEO implements InterfaceC28469BFh {
    public final /* synthetic */ ModeratorHostIModeratorListFragment LIZ;

    public BEO(ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment) {
        this.LIZ = moderatorHostIModeratorListFragment;
    }

    @Override // X.InterfaceC28469BFh
    public final void LIZ(AdminHostListResponse adminHostListResponse, Exception exc) {
        List<HostInfo> list;
        List<HostInfo> list2;
        List<HostInfo> list3;
        int i = 0;
        if (this.LIZ.isViewValid()) {
            if (exc != null || adminHostListResponse == null) {
                C9YK c9yk = this.LIZ.LJLIL;
                if (c9yk != null) {
                    if (c9yk.getItemCount() == 0) {
                        ((BEQ) this.LIZ._$_findCachedViewById(R.id.j6w)).LIZJ();
                    }
                    BPP.LIZJ(this.LIZ.getContext(), exc);
                } else {
                    o.LJIJI("hostIModeratorListAdapter");
                    throw null;
                }
            } else {
                AdminHostListResponse.Data data = adminHostListResponse.data;
                if (data != null) {
                    list = data.hostList;
                } else {
                    list = null;
                }
                if (!C79004UzY.LJJIFFI(list)) {
                    AdminHostListResponse.Data data2 = adminHostListResponse.data;
                    if (data2 != null && (list3 = data2.hostList) != null) {
                        i = list3.size();
                    }
                    ((BEQ) this.LIZ._$_findCachedViewById(R.id.j6w)).LIZ();
                    C9YK c9yk2 = this.LIZ.LJLIL;
                    if (c9yk2 != null) {
                        AdminHostListResponse.Data data3 = adminHostListResponse.data;
                        if (data3 != null && (list2 = data3.hostList) != null && !list2.isEmpty()) {
                            ((ArrayList) c9yk2.LJLILLLLZI).clear();
                            ((ArrayList) c9yk2.LJLILLLLZI).addAll(list2);
                            c9yk2.notifyDataSetChanged();
                        }
                    } else {
                        o.LJIJI("hostIModeratorListAdapter");
                        throw null;
                    }
                } else {
                    ((BEQ) this.LIZ._$_findCachedViewById(R.id.j6w)).LIZIZ();
                }
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_host_moderate_panel_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(i), "host_cnt");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28469BFh
    public final void LIZIZ(long j, DelHostRelationResponse delHostRelationResponse, Exception exc) {
        if (this.LIZ.isViewValid()) {
            if (exc != null || delHostRelationResponse == null) {
                BPP.LIZJ(this.LIZ.getContext(), exc);
                return;
            }
            C9YK c9yk = this.LIZ.LJLIL;
            if (c9yk != null) {
                Iterator it = ((ArrayList) c9yk.LJLILLLLZI).iterator();
                int i = -1;
                HostInfo hostInfo = null;
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        HostInfo hostInfo2 = (HostInfo) next;
                        User user = hostInfo2.userInfo;
                        if (user != null && user.getId() == j) {
                            i = i2;
                            hostInfo = hostInfo2;
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (hostInfo != null) {
                    ((ArrayList) c9yk.LJLILLLLZI).remove(hostInfo);
                    if (i >= 0) {
                        c9yk.notifyItemRemoved(i);
                    }
                }
                C9YK c9yk2 = this.LIZ.LJLIL;
                if (c9yk2 != null) {
                    if (c9yk2.getItemCount() != 0) {
                        return;
                    }
                    ((BEQ) this.LIZ._$_findCachedViewById(R.id.j6w)).LIZIZ();
                    return;
                }
                o.LJIJI("hostIModeratorListAdapter");
                throw null;
            }
            o.LJIJI("hostIModeratorListAdapter");
            throw null;
        }
    }
}
