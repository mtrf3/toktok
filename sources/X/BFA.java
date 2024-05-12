package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class BFA extends BFB implements InterfaceC28456BEu {
    public static final /* synthetic */ int LJZ = 0;
    public C31597Caf LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public C2A7 LJLJJI;
    public View LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public final Context LJLJLJ;
    public BFC LJLJLLL;
    public final long LJLL;
    public final long LJLLI;
    public final boolean LJLLILLLL;
    public final String LJLLJ;
    public final DataChannel LJLLL;
    public final List<BFC> LJLLLL;
    public BBP LJLLLLLL;
    public final boolean LJLZ;

    @Override // X.InterfaceC28456BEu
    public final void of(AdminUserBean adminUserBean, Exception exc) {
    }

    public final int L() {
        List list = (List) this.LJLLL.kv0(ModeratorListChannel.class);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void M() {
        String str;
        if (this.LJLJLLL == null) {
            return;
        }
        if (C29306Beo.LJJII(this.LJLLL)) {
            TryModeLiveProfileDialog Uz = ((IUserCardService) CN1.LIZ(IUserCardService.class)).Uz(this.LJLJLLL.LIZ, null);
            FragmentManager fragmentManager = (FragmentManager) this.LJLLL.kv0(C29494Bhq.class);
            if (fragmentManager != null) {
                Uz.show(fragmentManager, C16880lQ.LJLLJ(BFA.class));
                return;
            }
            return;
        }
        if (C29306Beo.LJJI() || C29306Beo.LJIILIIL(this.LJLLL)) {
            HashMap hashMap = new HashMap();
            BFC bfc = this.LJLJLLL;
            if (bfc != null) {
                str = bfc.LIZIZ;
            } else {
                str = "";
            }
            hashMap.put("sec_user_id", str);
            ((IHostAction) CN1.LIZ(IHostAction.class)).openUserProfilePage(this.LJLJLLL.LIZ, hashMap);
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.LJLJLLL.LIZ);
        if (this.LJLZ) {
            userProfileEvent.mSource = "multi_guest_panel";
        } else {
            userProfileEvent.mSource = "unknown";
        }
        userProfileEvent.mReportType = "report_user";
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BFB
    public final <T> void LJJZZIII(T t) {
        BBP bbp;
        int i;
        if (t instanceof BFC) {
            BFC bfc = (BFC) t;
            this.LJLJLLL = bfc;
            ImageModel imageModel = bfc.LJ;
            if (imageModel != null) {
                C15640jQ.LJIIIIZZ(this.LJLIL, imageModel);
            } else {
                this.LJLIL.setImageResource(R.drawable.cuk);
            }
            if (this.LJLLILLLL) {
                TextView textView = this.LJLILLLLZI;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                C2A7 c2a7 = this.LJLJJI;
                if (c2a7 != null) {
                    c2a7.setVisibility(8);
                }
                boolean z = this.LJLJLLL.LJI;
                if ("moderator_panel".equals(this.LJLLJ)) {
                    bbp = BBP.MODERATOR_LIST;
                } else {
                    bbp = BBP.MANAGE_MODERATOR;
                }
                this.LJLLLLLL = bbp;
                if (!C29306Beo.LJJII(this.LJLLL)) {
                    if (this.LJLLLLLL == BBP.MODERATOR_LIST || !z) {
                        this.LJLJJI.setVisibility(0);
                        C2A7 c2a72 = this.LJLJJI;
                        if (z) {
                            i = R.string.n3r;
                        } else {
                            i = R.string.n2j;
                        }
                        c2a72.setText(i);
                        C0YF.LIZ(new ACListenerS24S0101000_5(1, this, 14), this.LJLJJI);
                    } else {
                        View view = this.LJLJI;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        TextView textView2 = this.LJLILLLLZI;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            this.LJLILLLLZI.setText(R.string.npo);
                            this.LJLILLLLZI.setBackground(C15380j0.LJI(R.drawable.cc5));
                            this.LJLILLLLZI.setTextColor(C15380j0.LIZIZ(R.color.z3));
                            C16880lQ.LJIJI(this.LJLILLLLZI, new ACListenerS24S0101000_5(0, this, 11));
                        }
                    }
                }
            }
            C16880lQ.LJJIJIIJI(this.LJLIL, new ACListenerS24S0101000_5(1, this, 15));
            TextView textView3 = this.LJLJL;
            if (textView3 != null) {
                C16880lQ.LJIJI(textView3, new ACListenerS24S0101000_5(1, this, 16));
                if (this.LJLLLLLL == BBP.MODERATOR_LIST) {
                    TextView textView4 = this.LJLJL;
                    BFC bfc2 = this.LJLJLLL;
                    textView4.setText(C05170If.LIZIZ(bfc2.LIZLLL, bfc2.LIZJ));
                } else {
                    this.LJLJL.setText(this.LJLJLLL.LIZLLL);
                }
            }
            TextView textView5 = this.LJLJJLL;
            if (textView5 != null) {
                C16880lQ.LJIJI(textView5, new ACListenerS32S0101000_15(1, this, 11));
                if (this.LJLLLLLL == BBP.MODERATOR_LIST) {
                    this.LJLJJLL.setText(this.LJLJLLL.LJIIIIZZ);
                } else {
                    this.LJLJJLL.setText(this.LJLJLLL.LIZJ);
                }
            }
        }
    }

    @Override // X.InterfaceC28456BEu
    public final void Ze(Exception exc) {
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJJL.setVisibility(8);
        BPP.LIZJ(this.LJLJLJ, exc);
    }

    @Override // X.InterfaceC28456BEu
    public final void Ti(long j, boolean z) {
        List<BFC> list;
        this.LJLJJL.setVisibility(8);
        this.LJLJLLL.LJI = z;
        C73943T0h.LIZ().LIZIZ(new BEM(j));
        if (this.LJLLLLLL == BBP.MANAGE_MODERATOR && !z && (list = (List) this.LJLLL.kv0(ModeratorListChannel.class)) != null) {
            for (BFC bfc : list) {
                if (bfc.LIZ == j) {
                    list.remove(bfc);
                    return;
                }
            }
        }
    }

    public BFA(DataChannel dataChannel, View view, String str, long j, long j2, boolean z, List<BFC> list, boolean z2) {
        super(view);
        this.LJLJLJ = view.getContext();
        this.LJLL = j;
        this.LJLLILLLL = z;
        this.LJLLI = j2;
        this.LJLLL = dataChannel;
        this.LJLLJ = str;
        this.LJLZ = z2;
        this.LJLLLL = list;
        this.LJLIL = (C31597Caf) view.findViewById(R.id.e44);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.b3r);
        this.LJLJI = view.findViewById(R.id.b3y);
        this.LJLJJI = (C2A7) view.findViewById(R.id.co3);
        this.LJLJJL = view.findViewById(R.id.b40);
        this.LJLJJLL = (TextView) view.findViewById(R.id.n0w);
        this.LJLJL = (TextView) view.findViewById(R.id.mzt);
    }
}
