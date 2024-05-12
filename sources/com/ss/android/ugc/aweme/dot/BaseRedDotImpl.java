package com.ss.android.ugc.aweme.dot;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C32I;
import X.C35585Dxt;
import X.C53998LHe;
import X.C53999LHf;
import X.C54000LHg;
import X.C54029LIj;
import X.C59432Ux;
import X.C61878OQg;
import X.C62822Ol8;
import X.C75792yF;
import X.C78983UzD;
import X.DQS;
import X.EnumC36206EIw;
import X.InterfaceC53995LHb;
import X.LI7;
import X.LIV;
import X.OSZ;
import Y.AObserverS77S0100000_9;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class BaseRedDotImpl implements InterfaceC53995LHb {
    public C35585Dxt LJLIL = new C35585Dxt();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C54000LHg.LJLIL);

    @Override // X.InterfaceC53995LHb
    public void D10() {
    }

    @Override // X.InterfaceC53995LHb
    public void Go0() {
    }

    public void LIZLLL() {
    }

    @Override // X.InterfaceC53995LHb
    public void St0() {
    }

    @Override // X.InterfaceC53995LHb
    public void Zk(String str, String str2) {
    }

    @Override // X.InterfaceC53995LHb
    public LIV getSocialTabNoticeData() {
        return null;
    }

    @Override // X.InterfaceC53995LHb
    public OSZ<Boolean, String> D20() {
        return new OSZ<>(Boolean.valueOf(!StateOwner.LJLIL.LIZJ()), null);
    }

    public void LIZJ() {
        StateOwner stateOwner = StateOwner.LJLIL;
        ActivityC45651qj LIZLLL = stateOwner.LIZLLL();
        if (LIZLLL != null) {
            stateOwner.getClass();
            StateOwner.LJLJJI.observe(LIZLLL, new AObserverS77S0100000_9(this, 3));
            stateOwner.getClass();
            StateOwner.LJLL.add(new C53998LHe(this));
            LIZLLL.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.dot.BaseRedDotImpl$observeState$1$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        StateOwner.LJLIL.getClass();
                        StateOwner.LJLL.remove(new C53999LHf(BaseRedDotImpl.this));
                        BaseRedDotImpl.this.LIZLLL();
                    }
                }
            });
        }
    }

    public final void LJFF() {
        this.LJLIL = new C35585Dxt();
    }

    @Override // X.InterfaceC53995LHb
    public boolean PT() {
        return !C54029LIj.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC53995LHb
    public C35585Dxt Yi() {
        C35585Dxt L = C35585Dxt.L(this.LJLIL, 0, false, 7);
        LJFF();
        return L;
    }

    @Override // X.InterfaceC53995LHb
    public final ArrayList<Integer> sv() {
        return (ArrayList) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC53995LHb
    public ArrayList<SingleTabCounter> wE() {
        return new ArrayList<>();
    }

    @Override // X.InterfaceC53995LHb
    public int KY(String tag) {
        o.LJIIIZ(tag, "tag");
        return 0;
    }

    public final void LIZ(ArrayList<ContentMetadata> arrayList) {
        String itemId;
        int i = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            LJFF();
            return;
        }
        Iterator<ContentMetadata> it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ContentMetadata next = it.next();
            Boolean isTikTokStory = next.isTikTokStory();
            if (o.LJ(isTikTokStory, Boolean.TRUE)) {
                String authorId = next.getAuthorId();
                if (authorId != null) {
                    if (this.LJLIL.LJLIL.get(authorId) == null) {
                        this.LJLIL.LJLIL.put(authorId, new LinkedHashSet());
                    }
                    Set<String> set = this.LJLIL.LJLIL.get(authorId);
                    if (set != null && (itemId = next.getItemId()) != null) {
                        set.add(itemId);
                        z = true;
                    }
                }
            } else if (o.LJ(isTikTokStory, Boolean.FALSE)) {
                i++;
            } else {
                C78983UzD.LJIILL("friends tab red dot isTikTok Story field empty");
            }
        }
        if (i != 0 || z) {
            this.LJLIL = C35585Dxt.L(this.LJLIL, i, true, 1);
        }
    }

    public void LIZIZ(boolean z) {
        if (z) {
            RedDotPolling.LJLIL.getClass();
            RedDotPolling.LIZ();
        }
    }

    public final void LJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getIsTikTokStory()) {
            Set<String> set = this.LJLIL.LJLIL.get(aweme.getAuthorUid());
            if (set != null) {
                set.remove(aweme.getAid());
            }
            Set<String> set2 = this.LJLIL.LJLIL.get(aweme.getAuthorUid());
            if (set2 != null && set2.isEmpty()) {
                this.LJLIL.LJLIL.remove(aweme.getAuthorUid());
            }
        } else {
            this.LJLIL = C35585Dxt.L(this.LJLIL, r2.LJLILLLLZI - 1, false, 5);
        }
        if (this.LJLIL.LJLIL.isEmpty() && this.LJLIL.LJLILLLLZI == 0) {
            LJFF();
        }
    }

    @Override // X.InterfaceC53995LHb
    public void pX(boolean z) {
        LIZJ();
        if (StateOwner.LJLIL.LIZJ()) {
            LIZIZ(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static void LJ(NewContentResponse newContentResponse, EnumC36206EIw enumC36206EIw) {
        boolean z;
        int i;
        Object obj;
        String scene;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<UserNewContent> avatarList;
        List<UserNewContent> subList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        ArrayList<UserNewContent> avatarList2;
        boolean LIZ = DQS.LIZ();
        if (enumC36206EIw == EnumC36206EIw.COLD_START || enumC36206EIw == EnumC36206EIw.LOGIN_SUCCESS || enumC36206EIw == EnumC36206EIw.SWITCH_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        if (LIZ && z) {
            if (newContentResponse != null && (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse2.getAvatarList()) != null) {
                i = avatarList2.size();
            } else {
                i = 0;
            }
            int intValue = ((Number) C59432Ux.LIZ.getValue()).intValue();
            if (intValue <= i) {
                i = intValue;
            }
            if (newContentResponse != null && (friendsFeedResponse = newContentResponse.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && (subList = avatarList.subList(0, i)) != null) {
                obj = new ArrayList(C32I.LJJL(subList, 10));
                Iterator<UserNewContent> it = subList.iterator();
                while (it.hasNext()) {
                    obj.add(it.next().getItemId());
                }
            } else {
                obj = C61878OQg.INSTANCE;
            }
            if (enumC36206EIw == EnumC36206EIw.COLD_START) {
                scene = LI7.COLD_START.getScene();
            } else {
                scene = LI7.HOMEPAGE_RECREATE.getScene();
            }
            C54029LIj c54029LIj = C54029LIj.LIZIZ;
            String LIZJ = C75792yF.LIZJ(obj);
            o.LJIIIIZZ(LIZJ, "toJson(awemeIds)");
            c54029LIj.LJJIIZI(scene, LIZJ);
        }
    }

    @Override // X.LHX
    public void ag(String fromTag, String str) {
        o.LJIIIZ(fromTag, "fromTag");
    }
}
