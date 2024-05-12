package com.ss.android.ugc.aweme.fragments;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C42256GiC;
import X.C42257GiD;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8HA;
import X.C8VV;
import X.C90193gN;
import X.C90903hW;
import X.C9QW;
import X.GSX;
import X.SRI;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class MentionVideoListFragment extends Fragment {
    public static C42256GiC LJLLI;
    public static boolean LJLLILLLL;
    public int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public ViewGroup LJLJJL;
    public C8HA LJLJJLL;
    public boolean LJLJL;
    public BaseVideoListVM<SRI, C9QW, Long> LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final IAVPublishService LJLJJI = AVExternalServiceImpl.LIZ().publishService();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C42257GiD.LJLIL);

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLL;
        Integer valueOf = Integer.valueOf(R.id.ftw);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ftw)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public void initView() {
        String str;
        if (this.LJLIL == 8 && (str = this.LJLJI) != null && str.length() != 0) {
            ViewGroup viewGroup = this.LJLJJL;
            if (viewGroup != null) {
                int i = 4;
                viewGroup.setVisibility(4);
                C8HA c8ha = this.LJLJJLL;
                if (c8ha != null) {
                    String str2 = this.LJLJI;
                    int i2 = 1 ^ (C90193gN.LIZ() ? 1 : 0);
                    c8ha.setLayoutDirection(i2 ^ 1);
                    if (i2 != 0) {
                        i = 3;
                    }
                    c8ha.setTextDirection(i);
                    c8ha.setText(str2);
                } else {
                    o.LJIJI("musicTtileTextView");
                    throw null;
                }
            } else {
                o.LJIJI("soundTabContainer");
                throw null;
            }
        }
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 207));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (LJLLILLLL) {
            LJLLILLLL = false;
        }
        if (LJLLI != null) {
            LJLLI = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            this.LJLIL = arguments.getInt("page_type");
            Bundle arguments2 = getArguments();
            o.LJI(arguments2);
            this.LJLILLLLZI = arguments2.getString("music_id");
            Bundle arguments3 = getArguments();
            o.LJI(arguments3);
            this.LJLJI = arguments3.getString("music_title");
        }
        initView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        User user;
        User user2;
        User user3;
        User user4;
        String str;
        AwemeStatus awemeStatus;
        User user5;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Aweme aweme6;
        User user6;
        Aweme aweme7;
        Aweme aweme8;
        super.onActivityResult(i, i2, intent);
        if (i == 9 && i2 == -1) {
            if (intent != null && intent.getSerializableExtra("mention_video_Info_respose") != null) {
                Serializable serializableExtra = intent.getSerializableExtra("mention_video_Info_respose");
                o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse");
                VideoInfoFromURLResponse videoInfoFromURLResponse = (VideoInfoFromURLResponse) serializableExtra;
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "mention_video_enter_method");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                this.LJLJJI.returnMentionVideoRespose(mo49getActivity(), videoInfoFromURLResponse, LLJJIJIIJIL);
                return;
            }
            if (LJLLI == null) {
                return;
            }
            IAVPublishService iAVPublishService = this.LJLJJI;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            C42256GiC c42256GiC = LJLLI;
            if (c42256GiC != null && (aweme8 = c42256GiC.LJLILLLLZI) != null) {
                user = aweme8.getAuthor();
            } else {
                user = null;
            }
            o.LJI(user);
            String uniqueId = user.getUniqueId();
            if (uniqueId == null) {
                C42256GiC c42256GiC2 = LJLLI;
                if (c42256GiC2 != null && (aweme7 = c42256GiC2.LJLILLLLZI) != null) {
                    user6 = aweme7.getAuthor();
                } else {
                    user6 = null;
                }
                o.LJI(user6);
                uniqueId = user6.getShortId();
            }
            C42256GiC c42256GiC3 = LJLLI;
            if (c42256GiC3 != null && (aweme6 = c42256GiC3.LJLILLLLZI) != null) {
                user2 = aweme6.getAuthor();
            } else {
                user2 = null;
            }
            o.LJI(user2);
            String nickname = user2.getNickname();
            C42256GiC c42256GiC4 = LJLLI;
            if (c42256GiC4 != null && (aweme5 = c42256GiC4.LJLILLLLZI) != null) {
                user3 = aweme5.getAuthor();
            } else {
                user3 = null;
            }
            o.LJI(user3);
            String uid = user3.getUid();
            C42256GiC c42256GiC5 = LJLLI;
            if (c42256GiC5 != null && (aweme4 = c42256GiC5.LJLILLLLZI) != null) {
                user4 = aweme4.getAuthor();
            } else {
                user4 = null;
            }
            o.LJI(user4);
            String secUid = user4.getSecUid();
            C42256GiC c42256GiC6 = LJLLI;
            if (c42256GiC6 != null && (aweme3 = c42256GiC6.LJLILLLLZI) != null) {
                str = aweme3.getAid();
            } else {
                str = null;
            }
            C42256GiC c42256GiC7 = LJLLI;
            if (c42256GiC7 != null && (aweme2 = c42256GiC7.LJLILLLLZI) != null) {
                awemeStatus = aweme2.getStatus();
            } else {
                awemeStatus = null;
            }
            o.LJI(awemeStatus);
            int privateStatus = awemeStatus.getPrivateStatus();
            C42256GiC c42256GiC8 = LJLLI;
            if (c42256GiC8 != null && (aweme = c42256GiC8.LJLILLLLZI) != null) {
                user5 = aweme.getAuthor();
            } else {
                user5 = null;
            }
            o.LJI(user5);
            boolean isAccuratePrivateAccount = user5.isAccuratePrivateAccount();
            C42256GiC c42256GiC9 = LJLLI;
            o.LJI(c42256GiC9);
            iAVPublishService.setChainInfo(mo49getActivity, new GSX(uniqueId, nickname, uid, secUid, str, privateStatus, isAccuratePrivateAccount ? 1 : 0, c42256GiC9.LJLIL, "click_preview"));
            LJLLI = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bso, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.k80);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.sound_tab_container)");
        this.LJLJJL = (ViewGroup) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.gu7);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.music_title)");
        this.LJLJJLL = (C8HA) findViewById2;
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
