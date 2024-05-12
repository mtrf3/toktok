package com.ss.android.ugc.aweme.choosemusic.view;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C46126I8k;
import X.C82740Wdc;
import X.L1D;
import X.XU2;
import X.XVA;
import X.XVG;
import X.XVH;
import X.XVI;
import X.XVJ;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS77S0100000_9;
import Y.AObserverS78S0200000_15;
import Y.AObserverS83S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ChooseMusicSelectView implements GenericLifecycleObserver {
    public final LifecycleOwner LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public ViewGroup LJLJJI;
    public SmartImageView LJLJJL;
    public TuxIconView LJLJJLL;
    public TextView LJLJL;
    public ImageView LJLJLJ;
    public TuxIconView LJLJLLL;
    public ImageView LJLL;
    public XU2 LJLLI;
    public ActivityC45651qj LJLLILLLL;
    public XVH LJLLJ;
    public View LJLLL;
    public SelectedMusicViewModel LJLLLL;
    public ChooseMusicCutViewModel LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public MusicModel LJZL;
    public XVG LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        SelectedMusicViewModel selectedMusicViewModel = this.LJLLLL;
        if (selectedMusicViewModel != null) {
            selectedMusicViewModel.jv0().removeObservers(this.LJLIL);
            selectedMusicViewModel.hv0().removeObservers(this.LJLIL);
            selectedMusicViewModel.iv0().removeObservers(this.LJLIL);
            ((LiveData) selectedMusicViewModel.LJLJJI.getValue()).removeObservers(this.LJLIL);
            ((LiveData) selectedMusicViewModel.LJLJJL.getValue()).removeObservers(this.LJLIL);
            selectedMusicViewModel.gv0().removeObservers(this.LJLIL);
            XVI.LIZIZ = null;
            XVI.LIZ = null;
            return;
        }
        o.LJIJI("mSelectedMusicViewModel");
        throw null;
    }

    public final void LIZIZ() {
        SelectedMusicViewModel selectedMusicViewModel = this.LJLLLL;
        if (selectedMusicViewModel != null) {
            selectedMusicViewModel.iv0().postValue(1);
            XU2 xu2 = this.LJLLI;
            if (xu2 != null) {
                xu2.pause();
                return;
            } else {
                o.LJIJI("mMusicManager");
                throw null;
            }
        }
        o.LJIJI("mSelectedMusicViewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.intValue() != 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r5.LJLLLL
            java.lang.String r4 = "mSelectedMusicViewModel"
            r3 = 0
            if (r0 == 0) goto L66
            androidx.lifecycle.MutableLiveData r0 = r0.iv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r2 = "mMusicManager"
            if (r0 != 0) goto L30
        L15:
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r5.LJLLLL
            if (r0 == 0) goto L5a
            androidx.lifecycle.MutableLiveData r0 = r0.iv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L38
        L25:
            X.XU2 r0 = r5.LJLLI
            if (r0 == 0) goto L56
            r0.release()
            r5.LIZ()
            return
        L30:
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L3e
            goto L15
        L38:
            int r0 = r0.intValue()
            if (r0 != 0) goto L25
        L3e:
            X.XU2 r0 = r5.LJLLI
            if (r0 == 0) goto L62
            r0.pause()
            com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel r0 = r5.LJLLLL
            if (r0 == 0) goto L5e
            androidx.lifecycle.MutableLiveData r1 = r0.iv0()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.postValue(r0)
            goto L25
        L56:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        L5a:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L5e:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L62:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        L66:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView.onDestroy():void");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        SelectedMusicViewModel selectedMusicViewModel = this.LJLLLL;
        if (selectedMusicViewModel != null) {
            Integer value = selectedMusicViewModel.iv0().getValue();
            if (value == null || value.intValue() != 2) {
                SelectedMusicViewModel selectedMusicViewModel2 = this.LJLLLL;
                if (selectedMusicViewModel2 != null) {
                    Integer value2 = selectedMusicViewModel2.iv0().getValue();
                    if (value2 == null || value2.intValue() != 0) {
                        return;
                    }
                } else {
                    o.LJIJI("mSelectedMusicViewModel");
                    throw null;
                }
            }
            XU2 xu2 = this.LJLLI;
            if (xu2 != null) {
                xu2.pause();
                SelectedMusicViewModel selectedMusicViewModel3 = this.LJLLLL;
                if (selectedMusicViewModel3 != null) {
                    selectedMusicViewModel3.iv0().postValue(1);
                    return;
                } else {
                    o.LJIJI("mSelectedMusicViewModel");
                    throw null;
                }
            }
            o.LJIJI("mMusicManager");
            throw null;
        }
        o.LJIJI("mSelectedMusicViewModel");
        throw null;
    }

    public ChooseMusicSelectView(View root, ActivityC45651qj activity, LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider) {
        boolean z;
        boolean z2;
        o.LJIIIZ(root, "root");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLLILLLL = activity;
        this.LJLILLLLZI = root;
        View findViewById = root.findViewById(R.id.bb5);
        o.LJIIIIZZ(findViewById, "mChooseMusicUseContainer…e_music_select_container)");
        this.LJLJI = findViewById;
        View view = this.LJLILLLLZI;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.j4l);
            o.LJIIIIZZ(findViewById2, "mChooseMusicUseContainer…(R.id.rl_cover_container)");
            this.LJLJJI = (ViewGroup) findViewById2;
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.f7f);
                o.LJIIIIZZ(findViewById3, "mChooseMusicUseContainer…(R.id.iv_music_use_cover)");
                this.LJLJJL = (SmartImageView) findViewById3;
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.f7g);
                    o.LJIIIIZZ(findViewById4, "mChooseMusicUseContainer…R.id.iv_music_use_status)");
                    this.LJLJJLL = (TuxIconView) findViewById4;
                    View view4 = this.LJLILLLLZI;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.mbr);
                        o.LJIIIIZZ(findViewById5, "mChooseMusicUseContainer….id.tv_music_select_name)");
                        this.LJLJL = (TextView) findViewById5;
                        View view5 = this.LJLILLLLZI;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(R.id.f77);
                            o.LJIIIIZZ(findViewById6, "mChooseMusicUseContainer…ewById(R.id.iv_music_cut)");
                            this.LJLJLJ = (ImageView) findViewById6;
                            View view6 = this.LJLILLLLZI;
                            if (view6 != null) {
                                View findViewById7 = view6.findViewById(R.id.f75);
                                o.LJIIIIZZ(findViewById7, "mChooseMusicUseContainer…Id(R.id.iv_music_collect)");
                                TuxIconView tuxIconView = (TuxIconView) findViewById7;
                                this.LJLJLLL = tuxIconView;
                                XVJ.LIZ(tuxIconView, 1);
                                View view7 = this.LJLILLLLZI;
                                if (view7 != null) {
                                    View findViewById8 = view7.findViewById(R.id.f78);
                                    o.LJIIIIZZ(findViewById8, "mChooseMusicUseContainer…yId(R.id.iv_music_delete)");
                                    this.LJLL = (ImageView) findViewById8;
                                    XU2 xu2 = new XU2();
                                    this.LJLLI = xu2;
                                    xu2.LIZIZ(new XVA(this));
                                    this.LJLLILLLL = activity;
                                    SelectedMusicViewModel selectedMusicViewModel = (SelectedMusicViewModel) viewModelProvider.get(SelectedMusicViewModel.class);
                                    this.LJLLLL = selectedMusicViewModel;
                                    if (selectedMusicViewModel != null) {
                                        XVI.LIZIZ = selectedMusicViewModel;
                                        XVI.LIZ = this;
                                        this.LJLLLLLL = (ChooseMusicCutViewModel) viewModelProvider.get(ChooseMusicCutViewModel.class);
                                        SelectedMusicViewModel selectedMusicViewModel2 = this.LJLLLL;
                                        if (selectedMusicViewModel2 != null) {
                                            selectedMusicViewModel2.jv0().observe(lifecycleOwner, new AObserverS83S0100000_15(this, 103));
                                            MutableLiveData<MusicModel> hv0 = selectedMusicViewModel2.hv0();
                                            if (hv0 != null) {
                                                hv0.observe(lifecycleOwner, new AObserverS83S0100000_15(this, 104));
                                            }
                                            selectedMusicViewModel2.iv0().observe(lifecycleOwner, new AObserverS77S0100000_9(this, 145));
                                            selectedMusicViewModel2.gv0().observe(lifecycleOwner, new AObserverS83S0100000_15(this, 105));
                                            ((LiveData) selectedMusicViewModel2.LJLJJL.getValue()).observe(lifecycleOwner, new AObserverS77S0100000_9(this, 146));
                                            ((LiveData) selectedMusicViewModel2.LJLJJI.getValue()).observe(lifecycleOwner, new AObserverS78S0200000_15(selectedMusicViewModel2, this, 3));
                                            ViewGroup viewGroup = this.LJLJJI;
                                            if (viewGroup != null) {
                                                C16880lQ.LJIIL(viewGroup, new ACListenerS35S0100000_15(this, 297));
                                                ImageView imageView = this.LJLJLJ;
                                                if (imageView != null) {
                                                    C16880lQ.LJIILLIIL(imageView, new ACListenerS35S0100000_15(this, 298));
                                                    if (((Number) L1D.LIZ.getValue()).intValue() == 3) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z || L1D.LIZ()) {
                                                        ImageView imageView2 = this.LJLJLJ;
                                                        if (imageView2 != null) {
                                                            C82740Wdc.LIZIZ(imageView2);
                                                            TuxIconView tuxIconView2 = this.LJLJLLL;
                                                            if (tuxIconView2 != null) {
                                                                C82740Wdc.LIZIZ(tuxIconView2);
                                                                ImageView imageView3 = this.LJLL;
                                                                if (imageView3 != null) {
                                                                    C82740Wdc.LIZIZ(imageView3);
                                                                } else {
                                                                    o.LJIJI("mTvMusicDelete");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("tivMusicCollect");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("mIvMusicCut");
                                                            throw null;
                                                        }
                                                    }
                                                    if (C46126I8k.LIZ() != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        ImageView imageView4 = this.LJLJLJ;
                                                        if (imageView4 != null) {
                                                            if (imageView4 instanceof TuxIconView) {
                                                                ((TuxIconView) imageView4).setIconRes(R.raw.icon_scissors_right);
                                                            }
                                                        } else {
                                                            o.LJIJI("mIvMusicCut");
                                                            throw null;
                                                        }
                                                    }
                                                    TuxIconView tuxIconView3 = this.LJLJLLL;
                                                    if (tuxIconView3 != null) {
                                                        C16880lQ.LJJJ(tuxIconView3, new ACListenerS35S0100000_15(this, 299));
                                                        if (C46126I8k.LIZ() != 0) {
                                                            TuxIconView tuxIconView4 = this.LJLJLLL;
                                                            if (tuxIconView4 != null) {
                                                                tuxIconView4.setIconRes(R.raw.icon_scissors_right);
                                                            } else {
                                                                o.LJIJI("tivMusicCollect");
                                                                throw null;
                                                            }
                                                        }
                                                        ImageView imageView5 = this.LJLL;
                                                        if (imageView5 != null) {
                                                            C16880lQ.LJIILLIIL(imageView5, new ACListenerS35S0100000_15(this, 300));
                                                            return;
                                                        } else {
                                                            o.LJIJI("mTvMusicDelete");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("tivMusicCollect");
                                                    throw null;
                                                }
                                                o.LJIJI("mIvMusicCut");
                                                throw null;
                                            }
                                            o.LJIJI("mCoverContainer");
                                            throw null;
                                        }
                                        o.LJIJI("mSelectedMusicViewModel");
                                        throw null;
                                    }
                                    o.LJIJI("mSelectedMusicViewModel");
                                    throw null;
                                }
                                o.LJIJI("mChooseMusicUseContainer");
                                throw null;
                            }
                            o.LJIJI("mChooseMusicUseContainer");
                            throw null;
                        }
                        o.LJIJI("mChooseMusicUseContainer");
                        throw null;
                    }
                    o.LJIJI("mChooseMusicUseContainer");
                    throw null;
                }
                o.LJIJI("mChooseMusicUseContainer");
                throw null;
            }
            o.LJIJI("mChooseMusicUseContainer");
            throw null;
        }
        o.LJIJI("mChooseMusicUseContainer");
        throw null;
    }
}
