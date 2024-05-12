package X;

import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46921sm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ GameDualDeviceSourceFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46921sm(int i, GameDualDeviceSourceFragment gameDualDeviceSourceFragment, boolean z) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = gameDualDeviceSourceFragment;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i = this.LJLIL;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                TuxIconView tuxIconView = this.LJLILLLLZI.LJLJJL;
                                if (tuxIconView != null) {
                                    tuxIconView.setVisibility(8);
                                }
                                LiveIconView liveIconView = this.LJLILLLLZI.LJLJJLL;
                                if (liveIconView != null) {
                                    liveIconView.setVisibility(0);
                                }
                                LiveIconView liveIconView2 = this.LJLILLLLZI.LJLJJLL;
                                if (liveIconView2 != null) {
                                    liveIconView2.setIcon(R.raw.icon_exclamation_mark_circle);
                                }
                                LiveIconView liveIconView3 = this.LJLILLLLZI.LJLJJLL;
                                if (liveIconView3 != null) {
                                    liveIconView3.setIconTint(C15380j0.LIZIZ(R.color.a39));
                                }
                                TextView textView = this.LJLILLLLZI.LJLJLJ;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                                View view = this.LJLILLLLZI.LJLL;
                                if (view != null) {
                                    view.setVisibility(8);
                                }
                                View view2 = this.LJLILLLLZI.LJLJLLL;
                                if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                                TextView textView2 = this.LJLILLLLZI.LJLJL;
                                if (textView2 != null) {
                                    textView2.setText(C15380j0.LJIILJJIL(R.string.mwm));
                                }
                                SurfaceView surfaceView = this.LJLILLLLZI.LJLJI;
                                if (surfaceView != null) {
                                    surfaceView.setVisibility(4);
                                }
                                C30868C9o.LJ(5000L, this.LJLILLLLZI.getContext(), "Camera is disconnect");
                            }
                        } else {
                            View view3 = this.LJLILLLLZI.LJLJLLL;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            View view4 = this.LJLILLLLZI.LJLL;
                            if (view4 != null) {
                                view4.setVisibility(0);
                            }
                            TuxIconView tuxIconView2 = this.LJLILLLLZI.LJLJJL;
                            if (tuxIconView2 != null) {
                                tuxIconView2.setVisibility(8);
                            }
                            TextView textView3 = this.LJLILLLLZI.LJLJLJ;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                            }
                            LiveIconView liveIconView4 = this.LJLILLLLZI.LJLJJLL;
                            if (liveIconView4 != null) {
                                liveIconView4.setVisibility(8);
                            }
                            TextView textView4 = this.LJLILLLLZI.LJLJLJ;
                            if (textView4 != null) {
                                textView4.setText(C15380j0.LJIILJJIL(R.string.mbe));
                            }
                            TextView textView5 = this.LJLILLLLZI.LJLJLJ;
                            if (textView5 != null) {
                                textView5.setBackground(C15380j0.LJI(R.drawable.cqs));
                            }
                            this.LJLILLLLZI.wl(this.LJLJI);
                        }
                    } else {
                        View view5 = this.LJLILLLLZI.LJLL;
                        if (view5 != null) {
                            view5.setVisibility(0);
                        }
                        TuxIconView tuxIconView3 = this.LJLILLLLZI.LJLJJL;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setVisibility(8);
                        }
                        LiveIconView liveIconView5 = this.LJLILLLLZI.LJLJJLL;
                        if (liveIconView5 != null) {
                            liveIconView5.setVisibility(8);
                        }
                        TextView textView6 = this.LJLILLLLZI.LJLJLJ;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                        TextView textView7 = this.LJLILLLLZI.LJLJLJ;
                        if (textView7 != null) {
                            textView7.setText(C15380j0.LJIILJJIL(R.string.mbh));
                        }
                        TextView textView8 = this.LJLILLLLZI.LJLJLJ;
                        if (textView8 != null) {
                            textView8.setBackground(C15380j0.LJI(R.drawable.cqt));
                        }
                        this.LJLILLLLZI.wl(this.LJLJI);
                    }
                } else {
                    View view6 = this.LJLILLLLZI.LJLJJI;
                    if (view6 != null) {
                        view6.setVisibility(0);
                    }
                    TuxIconView tuxIconView4 = this.LJLILLLLZI.LJLJJL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setVisibility(0);
                    }
                    LiveIconView liveIconView6 = this.LJLILLLLZI.LJLJJLL;
                    if (liveIconView6 != null) {
                        liveIconView6.setVisibility(8);
                    }
                    TextView textView9 = this.LJLILLLLZI.LJLJLJ;
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                    View view7 = this.LJLILLLLZI.LJLL;
                    if (view7 != null) {
                        view7.setVisibility(0);
                    }
                    TextView textView10 = this.LJLILLLLZI.LJLJL;
                    if (textView10 != null) {
                        textView10.setText(C15380j0.LJIILJJIL(R.string.mwj));
                    }
                    this.LJLILLLLZI.wl(this.LJLJI);
                }
            } else {
                View view8 = this.LJLILLLLZI.LJLJLLL;
                if (view8 != null) {
                    view8.setVisibility(0);
                }
                View view9 = this.LJLILLLLZI.LJLL;
                if (view9 != null) {
                    view9.setVisibility(0);
                }
                TuxIconView tuxIconView5 = this.LJLILLLLZI.LJLJJL;
                if (tuxIconView5 != null) {
                    tuxIconView5.setVisibility(8);
                }
                LiveIconView liveIconView7 = this.LJLILLLLZI.LJLJJLL;
                if (liveIconView7 != null) {
                    liveIconView7.setVisibility(0);
                }
                TextView textView11 = this.LJLILLLLZI.LJLJLJ;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
                TextView textView12 = this.LJLILLLLZI.LJLJL;
                if (textView12 != null) {
                    textView12.setText(C15380j0.LJIILJJIL(R.string.mw1));
                }
                this.LJLILLLLZI.wl(this.LJLJI);
            }
        } else {
            View view10 = this.LJLILLLLZI.LJLJJI;
            if (view10 != null) {
                view10.setVisibility(0);
            }
            TuxIconView tuxIconView6 = this.LJLILLLLZI.LJLJJL;
            if (tuxIconView6 != null) {
                tuxIconView6.setVisibility(0);
            }
            LiveIconView liveIconView8 = this.LJLILLLLZI.LJLJJLL;
            if (liveIconView8 != null) {
                liveIconView8.setVisibility(8);
            }
            TextView textView13 = this.LJLILLLLZI.LJLJLJ;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
            View view11 = this.LJLILLLLZI.LJLL;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            TextView textView14 = this.LJLILLLLZI.LJLJL;
            if (textView14 != null) {
                textView14.setText(C15380j0.LJIILJJIL(R.string.mwj));
            }
            this.LJLILLLLZI.wl(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
