package X;

import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91493ZvV implements InterfaceC86003Zc<FollowStatus>, InterfaceC57288Me4, InterfaceC92693kP {
    public final InterfaceC51691KQl LJLIL;
    public final MusicOwnerInfo LJLILLLLZI;
    public InterfaceC73573Su9<FollowStatus> LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        InterfaceC73573Su9<FollowStatus> interfaceC73573Su9;
        if (!this.LJLJJI && (interfaceC73573Su9 = this.LJLJI) != null) {
            if (exc == null) {
                exc = new IllegalStateException();
            }
            interfaceC73573Su9.onError(exc);
        }
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        if (this.LJLJJI) {
            return;
        }
        try {
            InterfaceC73573Su9<FollowStatus> interfaceC73573Su9 = this.LJLJI;
            if (interfaceC73573Su9 != null) {
                interfaceC73573Su9.onNext(followStatus);
            }
        } catch (Exception e) {
            InterfaceC73573Su9<FollowStatus> interfaceC73573Su92 = this.LJLJI;
            if (interfaceC73573Su92 != null) {
                interfaceC73573Su92.onError(e);
            }
        }
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<FollowStatus> interfaceC73573Su9) {
        String uid;
        this.LJLJI = interfaceC73573Su9;
        interfaceC73573Su9.setDisposable(this);
        this.LJLIL.LJIIIIZZ(this);
        MusicOwnerInfo musicOwnerInfo = this.LJLILLLLZI;
        if (musicOwnerInfo != null && (uid = musicOwnerInfo.getUid()) != null) {
            String secUid = this.LJLILLLLZI.getSecUid();
            if (secUid != null) {
                Integer followStatus = this.LJLILLLLZI.getFollowStatus();
                if (followStatus != null) {
                    int intValue = followStatus.intValue();
                    InterfaceC51691KQl interfaceC51691KQl = this.LJLIL;
                    ALX alx = new ALX();
                    alx.LIZJ(uid);
                    alx.LIZIZ(secUid);
                    C57285Me1 c57285Me1 = alx.LIZ;
                    c57285Me1.LIZJ = 1;
                    c57285Me1.LJ = -1;
                    c57285Me1.LIZLLL = 0;
                    c57285Me1.LJIIJ = intValue;
                    interfaceC51691KQl.LJIJJ(alx.LIZ());
                    return;
                }
                throw new NullPointerException("artist follower uid is null");
            }
            throw new NullPointerException("artist sec uid is null");
        }
        throw new NullPointerException("artist uid is null");
    }

    public C91493ZvV(InterfaceC51691KQl followPresenter, MusicOwnerInfo musicOwnerInfo) {
        o.LJIIIZ(followPresenter, "followPresenter");
        this.LJLIL = followPresenter;
        this.LJLILLLLZI = musicOwnerInfo;
    }
}
