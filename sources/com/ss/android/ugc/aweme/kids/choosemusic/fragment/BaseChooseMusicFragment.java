package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C141415gn;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC025208a;
import X.SFS;
import X.XWM;
import X.XWN;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseChooseMusicFragment extends AmeBaseFragment implements View.OnClickListener, InterfaceC025208a, TextView.OnEditorActionListener, WeakHandler.IHandler {
    public boolean allowClear;
    public View cancelChooseMusicContainer;
    public View cancelCurrentChooseMusicTv;
    public String challengeId;
    public String creationId;
    public TextView currentChooseMusicNameTv;
    public boolean isMvThemeMusic;
    public boolean isPhotoMvMode;
    public XWM mChooseMusicFragmentView;
    public String mFirstStickerId;
    public boolean mIsBusiSticker;
    public boolean mIsShowingSearch;
    public Music mMusic;
    public int mMusicChooseType;
    public NewMusicTabFragment mMusicTabFragment;
    public String mStickerMusicIds;
    public MusicModel musicModel;
    public String shootWay;
    public WeakHandler mHandler = new WeakHandler(this);
    public TextWatcher mTextWatcher = new XWN();

    public void dismiss() {
        this.mIsShowingSearch = false;
        this.mChooseMusicFragmentView.LIZ.setVisibility(0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public int layoutId() {
        return R.layout.bg6;
    }

    @Override // X.InterfaceC025208a
    public void onBackStackChanged() {
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public void initTabFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment LJJJI = childFragmentManager.LJJJI(R.id.btu);
        if (LJJJI != null) {
            this.mMusicTabFragment = (NewMusicTabFragment) LJJJI;
            return;
        }
        int i = this.mMusicChooseType;
        String str = this.challengeId;
        Music music = this.mMusic;
        String str2 = this.mStickerMusicIds;
        String str3 = this.mFirstStickerId;
        boolean z = this.mIsBusiSticker;
        String str4 = this.shootWay;
        Bundle LIZ = C141415gn.LIZ("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        if (!TextUtils.isEmpty(str)) {
            LIZ.putString("challenge", str);
        }
        if (music != null) {
            LIZ.putSerializable("sticker_music", music);
        }
        if (str2 != null) {
            LIZ.putString("first_sticker_music_ids", str2);
        }
        if (str3 != null) {
            LIZ.putString("first_sticker_id", str3);
        }
        LIZ.putBoolean("is_busi_sticker", z);
        NewMusicTabFragment newMusicTabFragment = new NewMusicTabFragment();
        if (!TextUtils.isEmpty(str4)) {
            LIZ.putString("shoot_way", str4);
        }
        newMusicTabFragment.setArguments(LIZ);
        this.mMusicTabFragment = newMusicTabFragment;
        newMusicTabFragment.LJLZ = 0;
        if (this.isMvThemeMusic) {
            newMusicTabFragment.LLFFF = true;
        }
        newMusicTabFragment.LLFII = this.isPhotoMvMode;
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LIZIZ(R.id.btu, this.mMusicTabFragment);
        c1b3.LJI();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().LJJLL(this);
        super.onDestroyView();
    }

    public void showCancelChooseMusicBar() {
        MusicModel musicModel;
        if (mo49getActivity() == null || !this.allowClear || (musicModel = this.musicModel) == null) {
            return;
        }
        this.cancelChooseMusicContainer.setVisibility(0);
        this.currentChooseMusicNameTv.setText(mo49getActivity().getString(R.string.cqh, musicModel.getName()));
        if (this.isPhotoMvMode) {
            this.cancelCurrentChooseMusicTv.setAlpha(0.5f);
        }
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 107), this.cancelCurrentChooseMusicTv);
    }

    public NewMusicTabFragment getMusicTabFragment() {
        return this.mMusicTabFragment;
    }

    private void initCancelChoseMusicBar(View view) {
        if (!this.allowClear) {
            return;
        }
        this.cancelChooseMusicContainer = view.findViewById(R.id.b3u);
        this.currentChooseMusicNameTv = (TextView) view.findViewById(R.id.c0q);
        this.cancelCurrentChooseMusicTv = view.findViewById(R.id.b3v);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ActivityC45651qj mo49getActivity;
        if (view.getId() == R.id.mit) {
            dismiss();
        } else {
            if (view.getId() == R.id.j5r || view.getId() != R.id.aej || (mo49getActivity = mo49getActivity()) == null) {
                return;
            }
            mo49getActivity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.mMusicChooseType = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.challengeId = getArguments().getString("challenge");
            this.creationId = getArguments().getString("creation_id");
            this.shootWay = getArguments().getString("shoot_way");
            this.mMusic = (Music) getArguments().getSerializable("sticker_music");
            this.mStickerMusicIds = getArguments().getString("first_sticker_music_ids", null);
            this.mIsBusiSticker = getArguments().getBoolean("is_busi_sticker", false);
            this.mFirstStickerId = getArguments().getString("first_sticker_id", null);
            this.musicModel = (MusicModel) getArguments().getSerializable("music_model");
            this.isMvThemeMusic = getArguments().getBoolean("is_mv_theme_music");
            this.allowClear = getArguments().getBoolean("music_allow_clear", false);
            this.isPhotoMvMode = getArguments().getBoolean("music_is_photomv", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initTabFragment();
        initCancelChoseMusicBar(view);
        getChildFragmentManager().LJ(this);
        this.mChooseMusicFragmentView.getClass();
    }

    public View com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, layoutId(), viewGroup, false);
        SFS.LJLJJLL = this.creationId;
        this.mChooseMusicFragmentView = new XWM(LLLLIILL, this, this.mTextWatcher);
        return LLLLIILL;
    }

    public static View com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(BaseChooseMusicFragment baseChooseMusicFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___ = baseChooseMusicFragment.com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___, baseChooseMusicFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___, baseChooseMusicFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___, baseChooseMusicFragment);
                ActivityC45651qj mo49getActivity = baseChooseMusicFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_kids_choosemusic_fragment_BaseChooseMusicFragment__onCreateView$___twin___;
    }
}
