package X;

import Y.AObserverS77S0100000_9;
import Y.AfS61S0100000_9;
import android.view.View;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LHi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54002LHi extends BaseRedDotImpl {
    public final C54006LHm LJLJI = new C54006LHm("FRIENDS_FEED");
    public final C73318Sq2 LJLJJI = new C73318Sq2();

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final OSZ<Boolean, String> D20() {
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (c54029LIj.LJJI()) {
            return new OSZ<>(Boolean.TRUE, "in_tab");
        }
        if (c54029LIj.LJFF()) {
            return new OSZ<>(Boolean.TRUE, null);
        }
        if (C53283Kvf.LIZIZ()) {
            return new OSZ<>(Boolean.TRUE, "no_following_or_friend");
        }
        return super.D20();
    }

    public final void LJII() {
        View findViewById;
        View LIZJ = this.LJLJI.LIZJ();
        if (LIZJ != null && (findViewById = LIZJ.findViewById(R.id.mmd)) != null && findViewById.getVisibility() == 0) {
            return;
        }
        this.LJLJI.LIZ();
    }

    public final void LJIIIZ() {
        this.LJLJJI.LIZ(AbstractC73672Svk.LJIIJ(C54007LHn.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 76)));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LIZJ() {
        super.LIZJ();
        StateOwner stateOwner = StateOwner.LJLIL;
        ActivityC45651qj LIZLLL = stateOwner.LIZLLL();
        if (LIZLLL != null) {
            stateOwner.getClass();
            StateOwner.LJLLI.observe(LIZLLL, new AObserverS77S0100000_9(this, 98));
        }
    }

    @Override // X.InterfaceC53995LHb
    public final InterfaceC54017LHx zA() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LIZIZ(boolean z) {
        super.LIZIZ(z);
        java.util.Set<String> set = C54014LHu.LIZ;
        if (set != null) {
            set.clear();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C54014LHu.LIZ = linkedHashSet;
        linkedHashSet.clear();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void pX(boolean z) {
        super.pX(z);
        LJIIIZ();
    }

    @Override // X.InterfaceC53995LHb
    public final void Bt0(Throwable th, EnumC36206EIw source) {
        o.LJIIIZ(source, "source");
        if (source == EnumC36206EIw.COLD_START) {
            LJIIIZ();
        }
        BaseRedDotImpl.LJ(null, source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void LJIIIIZZ(int i, EnumC36206EIw enumC36206EIw) {
        View findViewById;
        Object obj;
        int i2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<UserNewContent> avatarList;
        List<UserNewContent> subList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        ArrayList<UserNewContent> avatarList2;
        StateOwner stateOwner = StateOwner.LJLIL;
        stateOwner.LIZJ();
        IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
        if (iFriendsTabDebugService != null) {
            iFriendsTabDebugService.LJ();
        }
        if (i > 0) {
            ActivityC45651qj LIZLLL = stateOwner.LIZLLL();
            if (LIZLLL != null) {
                if (this.LJLJI.LIZIZ != i) {
                    C54011LHr.LIZJ(i, com.bytedance.hox.Hox.LJLLI.LIZ(LIZLLL).lv0(), i, false, enumC36206EIw);
                    IFriendsTabLayoutAbility LIZJ = C53976LGi.LIZJ(LIZLLL);
                    if ((LIZJ == null || LIZJ.pe("FRIENDS_FEED") == null) && this.LJLJI.LIZIZ > 0) {
                        if (DQS.LIZ()) {
                            NewContentResponse newContentResponse = C36203EIt.LIZJ;
                            if (newContentResponse != null && (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse2.getAvatarList()) != null) {
                                i2 = avatarList2.size();
                            } else {
                                i2 = 0;
                            }
                            int intValue = ((Number) C59432Ux.LIZ.getValue()).intValue();
                            if (intValue <= i2) {
                                i2 = intValue;
                            }
                            NewContentResponse newContentResponse2 = C36203EIt.LIZJ;
                            if (newContentResponse2 != null && (friendsFeedResponse = newContentResponse2.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && (subList = avatarList.subList(0, i2)) != null) {
                                obj = new ArrayList(C32I.LJJL(subList, 10));
                                Iterator<UserNewContent> it = subList.iterator();
                                while (it.hasNext()) {
                                    obj.add(it.next().getItemId());
                                }
                            } else {
                                obj = C61878OQg.INSTANCE;
                            }
                        } else {
                            obj = C61878OQg.INSTANCE;
                        }
                        C54029LIj c54029LIj = C54029LIj.LIZIZ;
                        String scene = LI7.NUMBER_DOT_CHANGE.getScene();
                        String LIZJ2 = C75792yF.LIZJ(obj);
                        o.LJIIIIZZ(LIZJ2, "toJson(awemeIds)");
                        c54029LIj.LJJIJLIJ(scene, LIZJ2);
                    }
                }
                View LIZJ3 = this.LJLJI.LIZJ();
                if (LIZJ3 != null && (findViewById = LIZJ3.findViewById(R.id.mmd)) != null && findViewById.getVisibility() == 0) {
                    this.LJLJI.LIZ();
                }
                this.LJLJI.LLLIIL(i);
                return;
            }
            return;
        }
        LJII();
    }

    @Override // X.InterfaceC53995LHb
    public final void Ng0(NewContentResponse response, EnumC36206EIw enumC36206EIw) {
        ArrayList<ContentMetadata> arrayList;
        o.LJIIIZ(response, "response");
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse = response.getFriendsFeedResponse();
        if (friendsFeedResponse != null) {
            arrayList = friendsFeedResponse.getContentMetadataList();
        } else {
            arrayList = null;
        }
        LIZ(arrayList);
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (c54029LIj.LJJI()) {
            LJII();
            return;
        }
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2 = response.getFriendsFeedResponse();
        int i = 0;
        if (friendsFeedResponse2 != null && friendsFeedResponse2.getRedDotCount() > 0) {
            if (c54029LIj.LJIIZILJ()) {
                LJII();
            } else {
                NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3 = response.getFriendsFeedResponse();
                if (friendsFeedResponse3 != null) {
                    i = friendsFeedResponse3.getRedDotCount();
                }
                LJIIIIZZ(i, enumC36206EIw);
            }
        } else {
            LJII();
        }
        BaseRedDotImpl.LJ(response, enumC36206EIw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r6 != null) goto L15;
     */
    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zk(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54002LHi.Zk(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC53995LHb
    public final void ym(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LJI(aweme);
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (!c54029LIj.LJJI()) {
            if (c54029LIj.LJIIZILJ()) {
                LJII();
            } else {
                LJIIIIZZ(i, null);
            }
        }
    }
}
