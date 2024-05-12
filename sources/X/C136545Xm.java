package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136545Xm extends AbstractC56012Ht<C136595Xr, C5XQ> {
    public int LJLIL = -1;
    public int LJLILLLLZI = -1;
    public int LJLJI = -1;
    public C135065Ru LJLJJI;
    public C135065Ru LJLJJL;
    public C135065Ru LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        super.onShow();
        int i = getUiStates().LJ.LJLIL;
        if (this.LJLIL == -1) {
            this.LJLIL = i;
        }
        C135065Ru c135065Ru = this.LJLJJI;
        if (c135065Ru != null) {
            c135065Ru.setProgress(i);
            TuxTextView tuxTextView = this.LJLJL;
            if (tuxTextView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                tuxTextView.setText(X1D.LIZIZ(LIZ));
                int i2 = getUiStates().LJ.LJLILLLLZI;
                if (this.LJLILLLLZI == -1) {
                    this.LJLILLLLZI = i2;
                }
                C135065Ru c135065Ru2 = this.LJLJJLL;
                if (c135065Ru2 != null) {
                    c135065Ru2.setProgress(i2);
                    TuxTextView tuxTextView2 = this.LJLJLLL;
                    if (tuxTextView2 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(i2);
                        LIZ2.append('%');
                        tuxTextView2.setText(X1D.LIZIZ(LIZ2));
                        int i3 = getUiStates().LJ.LJLJI;
                        if (this.LJLJI == -1) {
                            this.LJLJI = i3;
                        }
                        C135065Ru c135065Ru3 = this.LJLJJL;
                        if (c135065Ru3 != null) {
                            c135065Ru3.setProgress(i3);
                            TuxTextView tuxTextView3 = this.LJLJLJ;
                            if (tuxTextView3 != null) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(i3);
                                LIZ3.append('%');
                                tuxTextView3.setText(X1D.LIZIZ(LIZ3));
                                return;
                            }
                            o.LJIJI("recordingVolumeTxt");
                            throw null;
                        }
                        o.LJIJI("recordingSlider");
                        throw null;
                    }
                    o.LJIJI("musicVolumeTxt");
                    throw null;
                }
                o.LJIJI("musicVolumeSlider");
                throw null;
            }
            o.LJIJI("originalSoundVolumeTxt");
            throw null;
        }
        o.LJIJI("originalSoundSlider");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cb);
        c110614Vt.LJIIIIZZ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        c110614Vt.LJIIIZ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        view.setBackground(c110614Vt.LIZ(requireSceneContext));
        View requireViewById = requireViewById(R.id.b3n);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.cancel)");
        View requireViewById2 = requireViewById(R.id.cex);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.done)");
        C146035oF.LIZJ(requireViewById2, new AqS152S0100000_2(this, 210));
        View requireViewById3 = requireViewById(R.id.hdv);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.original_sound_volume_slider)");
        this.LJLJJI = (C135065Ru) requireViewById3;
        View requireViewById4 = requireViewById(R.id.is7);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.recording_volume_slider)");
        this.LJLJJL = (C135065Ru) requireViewById4;
        View requireViewById5 = requireViewById(R.id.guf);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.music_volume_slider)");
        this.LJLJJLL = (C135065Ru) requireViewById5;
        View requireViewById6 = requireViewById(R.id.hdw);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.original_sound_volume_txt)");
        this.LJLJL = (TuxTextView) requireViewById6;
        View requireViewById7 = requireViewById(R.id.hdu);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.original_sound_title)");
        this.LJLL = (TuxTextView) requireViewById7;
        View requireViewById8 = requireViewById(R.id.is8);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.recording_volume_txt)");
        this.LJLJLJ = (TuxTextView) requireViewById8;
        View requireViewById9 = requireViewById(R.id.is6);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.recording_title)");
        this.LJLLI = (TuxTextView) requireViewById9;
        View requireViewById10 = requireViewById(R.id.gug);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.music_volume_txt)");
        this.LJLJLLL = (TuxTextView) requireViewById10;
        View requireViewById11 = requireViewById(R.id.grn);
        o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.music_detail)");
        this.LJLLILLLL = (TuxTextView) requireViewById11;
        View requireViewById12 = requireViewById(R.id.gto);
        o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.music_slider_layout)");
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Xt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C136595Xr) obj).LJLJJI;
            }
        }, null, new AqS168S0100000_2((RelativeLayout) requireViewById12, 141), 2, null);
        C135065Ru c135065Ru = this.LJLJJI;
        if (c135065Ru != null) {
            c135065Ru.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5Xl
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        C136545Xm.this.getUiActions().LJLJI.invoke(Integer.valueOf(i));
                        TuxTextView tuxTextView = C136545Xm.this.LJLJL;
                        if (tuxTextView != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(i);
                            LIZ.append('%');
                            tuxTextView.setText(X1D.LIZIZ(LIZ));
                            return;
                        }
                        o.LJIJI("originalSoundVolumeTxt");
                        throw null;
                    }
                }
            });
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Xp
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C136595Xr) obj).LJLIL);
                }
            }, null, new AqS168S0100000_2(this, 142), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Xu
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C136595Xr) obj).LJLJJL;
                }
            }, null, new AqS168S0100000_2(this, 143), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Xs
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C136595Xr) obj).LJLJJLL;
                }
            }, null, new AqS168S0100000_2(this, 137), 2, null);
            C135065Ru c135065Ru2 = this.LJLJJI;
            if (c135065Ru2 != null) {
                c135065Ru2.setEnabled(true);
                C135065Ru c135065Ru3 = this.LJLJJL;
                if (c135065Ru3 != null) {
                    c135065Ru3.setEnabled(true);
                    C135065Ru c135065Ru4 = this.LJLJJLL;
                    if (c135065Ru4 != null) {
                        c135065Ru4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5Xj
                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onStartTrackingTouch(SeekBar seekBar) {
                            }

                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onStopTrackingTouch(SeekBar seekBar) {
                            }

                            @Override // android.widget.SeekBar.OnSeekBarChangeListener
                            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                                if (z) {
                                    C136545Xm.this.getUiActions().LJLJJI.invoke(Integer.valueOf(i));
                                    TuxTextView tuxTextView = C136545Xm.this.LJLJLLL;
                                    if (tuxTextView != null) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append(i);
                                        LIZ.append('%');
                                        tuxTextView.setText(X1D.LIZIZ(LIZ));
                                        return;
                                    }
                                    o.LJIJI("musicVolumeTxt");
                                    throw null;
                                }
                            }
                        });
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Xn
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C136595Xr) obj).LJLILLLLZI);
                            }
                        }, null, new AqS168S0100000_2(this, 138), 2, null);
                        C135065Ru c135065Ru5 = this.LJLJJL;
                        if (c135065Ru5 != null) {
                            c135065Ru5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5Xk
                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onStartTrackingTouch(SeekBar seekBar) {
                                }

                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onStopTrackingTouch(SeekBar seekBar) {
                                }

                                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                                    if (z) {
                                        C136545Xm.this.getUiActions().LJLJJL.invoke(Integer.valueOf(i));
                                        TuxTextView tuxTextView = C136545Xm.this.LJLJLJ;
                                        if (tuxTextView != null) {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append(i);
                                            LIZ.append('%');
                                            tuxTextView.setText(X1D.LIZIZ(LIZ));
                                            return;
                                        }
                                        o.LJIJI("recordingVolumeTxt");
                                        throw null;
                                    }
                                }
                            });
                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Xo
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Integer.valueOf(((C136595Xr) obj).LJLJI);
                                }
                            }, null, new AqS168S0100000_2(this, 139), 2, null);
                            C146035oF.LIZJ(requireViewById, new AqS152S0100000_2(this, 209));
                            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Xv
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C136595Xr) obj).LJLJL;
                                }
                            }, null, new AqS168S0100000_2(this, UserLevelGeckoUpdateSetting.DEFAULT), 2, null);
                            return;
                        }
                        o.LJIJI("recordingSlider");
                        throw null;
                    }
                    o.LJIJI("musicVolumeSlider");
                    throw null;
                }
                o.LJIJI("recordingSlider");
                throw null;
            }
            o.LJIJI("originalSoundSlider");
            throw null;
        }
        o.LJIJI("originalSoundSlider");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc5, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
