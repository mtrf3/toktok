package Y;

import X.ASL;
import X.AU3;
import X.AU5;
import X.AbstractC55363Lo7;
import X.C240719cZ;
import X.C240839cl;
import X.C26610AcQ;
import X.C26635Acp;
import X.C32151Nz;
import X.C34K;
import X.C62850Ola;
import X.C68322mC;
import X.C70878Rrm;
import X.C71799SFv;
import X.C76930UHe;
import X.C78946Uyc;
import X.EnumC241749eE;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS8S0400000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        View view = ((UsAddressItemVH) this.l0).itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), new AqS154S0100000_4((Address) this.l1, 4), new AqS50S0400000_4((Address) this.l1, (UsAddressItemVH) this.l0, (C26635Acp) this.l3, (C34K) this.l2, 2));
    }

    public final void LIZ$1() {
        View view = ((AddressAdapter.AddressViewHolder) this.l0).itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), new AqS154S0100000_4((Address) this.l1, 139), new AqS50S0400000_4((Address) this.l1, (AddressAdapter.AddressViewHolder) this.l0, (ReachableAddress) this.l2, (C26610AcQ) this.l3, 5));
    }

    public final void LIZ$2() {
        String str;
        MusicModel musicModel;
        C240719cZ c240719cZ = ((C240839cl) this.l0).LJLIL;
        if (c240719cZ != null && (musicModel = c240719cZ.LJLIL) != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (o.LJ(str, ((MusicModel) this.l1).getMusicId())) {
            MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) this.l2;
            musicPlayViewModel.getClass();
            musicPlayViewModel.withState(new AqS170S0100000_4(musicPlayViewModel, 1445));
            MusicDownloadPlayHelper musicDownloadPlayHelper = musicPlayViewModel.LJLILLLLZI;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.LJIIIIZZ();
                return;
            }
            return;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = ((MusicPlayViewModel) this.l2).LJLILLLLZI;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.LJIIIIZZ();
        }
        ((MusicPlayViewModel) this.l2).setState(new AqS170S0100000_4((C240719cZ) this.l3, 453));
        MusicPlayViewModel musicPlayViewModel2 = (MusicPlayViewModel) this.l2;
        EnumC241749eE enumC241749eE = EnumC241749eE.DEFAULT;
        musicPlayViewModel2.getClass();
        o.LJIIIZ(enumC241749eE, "<set-?>");
        musicPlayViewModel2.LJLJJL = enumC241749eE;
        MusicPlayViewModel musicPlayViewModel3 = (MusicPlayViewModel) this.l2;
        MusicModel musicModel2 = (MusicModel) this.l1;
        if (musicModel2 == null) {
            musicPlayViewModel3.getClass();
            return;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = musicPlayViewModel3.LJLILLLLZI;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.LJLLLL = false;
        }
        DataCenter dataCenter = musicPlayViewModel3.LJLJI;
        if (dataCenter != null) {
            dataCenter.jv0(Integer.valueOf(EnumC241749eE.LOADING.getValue()), "music_status");
        }
        musicPlayViewModel3.LJLJJI = musicModel2;
        MusicDownloadPlayHelper musicDownloadPlayHelper4 = musicPlayViewModel3.LJLILLLLZI;
        if (musicDownloadPlayHelper4 == null) {
            return;
        }
        musicDownloadPlayHelper4.LJIIJ(musicModel2, false, 7);
    }

    public final void LIZ$3() {
        User user;
        if (((Activity) this.l0).isFinishing() || (user = (User) this.l1) == null || ((User) this.l2) == null) {
            return;
        }
        UrlModel avatarVideoUri = user.getAvatarVideoUri();
        UrlModel avatarVideoUri2 = ((User) this.l2).getAvatarVideoUri();
        if (avatarVideoUri != null ? avatarVideoUri2 == null || avatarVideoUri != avatarVideoUri2 : avatarVideoUri2 != null) {
            ((MusProfileEditFragment) this.l3).hn((User) this.l2, true);
        }
        UrlModel avatarMedium = ((User) this.l1).getAvatarMedium();
        UrlModel avatarMedium2 = ((User) this.l2).getAvatarMedium();
        if (avatarMedium == null) {
            if (avatarMedium2 == null) {
                return;
            }
        } else if (avatarMedium2 != null && avatarMedium == avatarMedium2) {
            return;
        }
        ((MusProfileEditFragment) this.l3).dn((User) this.l2, true);
    }

    public final void LIZ$4() {
        View findViewById = ((View) this.l0).findViewById(R.id.icr);
        o.LJIIIIZZ(findViewById, "boxView.promotion_reminder_container");
        findViewById.setVisibility(0);
        InterfaceC71003Rtn trackNode = (InterfaceC71003Rtn) this.l1;
        HashMap hashMap = (HashMap) this.l2;
        o.LJIIIZ(trackNode, "trackNode");
        C78946Uyc.LJJII(trackNode, new C70878Rrm(), new AqS58S1100000_4("top_voucher_remind", (String) hashMap, (Map<String, ? extends Object>) 21));
        ConstraintLayout contentView = (ConstraintLayout) this.l3;
        o.LJIIIIZZ(contentView, "contentView");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, C32151Nz.LJIIZILJ(89));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new PathInterpolator(0.35f, 0.07f, 0.48f, 1.59f));
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(contentView, 33));
        ofFloat.start();
    }

    public final void LIZ$5() {
        ((ArrayList) ((C76930UHe) this.l0).LJLJJLL).remove((ViewPropertyAnimator) this.l1);
        ((View) this.l2).setAlpha(1.0f);
        ((View) this.l2).setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((C68322mC) this.l3).element;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C68322mC) this.l3).element = null;
    }

    public static final void run$0(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            AU3.LIZ((C71799SFv) aRunnableS8S0400000_4.l0, aRunnableS8S0400000_4.l1, (AU5) aRunnableS8S0400000_4.l2, (InterfaceC88472Yns) aRunnableS8S0400000_4.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            aRunnableS8S0400000_4.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S0400000_4 aRunnableS8S0400000_4) {
        boolean LIZ;
        try {
            final Context context = (Context) aRunnableS8S0400000_4.l0;
            final RssIntroAssem rssIntroAssem = (RssIntroAssem) aRunnableS8S0400000_4.l1;
            rssIntroAssem.getActualLifecycleOwner();
            final AqS108S0300000_4 aqS108S0300000_4 = new AqS108S0300000_4((ASL) aRunnableS8S0400000_4.l2, (RssIntroAssem) aRunnableS8S0400000_4.l1, (FragmentManager) aRunnableS8S0400000_4.l3, 53);
            PopupManager.LJIIL(new AbstractC55363Lo7(context, rssIntroAssem, aqS108S0300000_4) { // from class: X.9ls
                public final Context LJLIL;
                public final LifecycleOwner LJLILLLLZI;
                public final InterfaceC88472Yns<M78, C76800UCe> LJLJI;
                public final int LJLJJI;

                @Override // X.InterfaceC55641Lsb
                public final C54082LKk getPopupContext() {
                    return C54081LKj.LIZ(this.LJLIL, this.LJLILLLLZI);
                }

                @Override // X.InterfaceC56321M8n
                public final int getPriority() {
                    return this.LJLJJI;
                }

                @Override // X.M72
                public final void LIZLLL(C54082LKk context2, M78 wrapper) {
                    o.LJIIIZ(context2, "context");
                    o.LJIIIZ(wrapper, "wrapper");
                    this.LJLJI.invoke(wrapper);
                }

                {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(rssIntroAssem, "lifecycleOwner");
                    this.LJLIL = context;
                    this.LJLILLLLZI = rssIntroAssem;
                    this.LJLJI = aqS108S0300000_4;
                    this.LJLJJI = 2541;
                }
            });
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S0400000_4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
