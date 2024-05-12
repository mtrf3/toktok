package X;

import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.W3y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC81682W3y implements Runnable {
    public final /* synthetic */ WOB LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public RunnableC81682W3y(WOB wob, long j, long j2, long j3, boolean z) {
        this.LJLIL = wob;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = z;
    }

    public final void LIZ() {
        float measuredWidth;
        float measuredWidth2;
        WOB wob = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        long j3 = this.LJLJJI;
        float f = ((float) (j - j2)) * 1.0f;
        if (wob.LJLILLLLZI != null) {
            float max = Math.max(0.0f, (f * r0.getMovableWidth()) / ((float) j3));
            WOB wob2 = this.LJLIL;
            TextView textView = wob2.LJLJJLL;
            if (textView != null) {
                textView.setAlpha(wob2.LLJILJILJ(max));
                WOB wob3 = this.LJLIL;
                TextView textView2 = wob3.LJLJJL;
                if (textView2 != null) {
                    if (wob3.LJLILLLLZI != null) {
                        textView2.setAlpha(wob3.LLJILJILJ(r0.getMeasuredWidth() - max));
                        if (this.LJLILLLLZI - this.LJLJI >= this.LJLJJI) {
                            WOB wob4 = this.LJLIL;
                            if (!wob4.LJLLILLLL) {
                                TextView textView3 = wob4.LJLJL;
                                if (textView3 != null) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(this.LJLJJI / 1000);
                                    LIZ.append('s');
                                    textView3.setText(X1D.LIZIZ(LIZ));
                                } else {
                                    o.LJIJI("anchorTextView");
                                    throw null;
                                }
                            }
                            WOB wob5 = this.LJLIL;
                            TextView textView4 = wob5.LJLJL;
                            if (textView4 != null) {
                                if (C173636rf.LIZIZ(wob5.mActivity)) {
                                    WGP wgp = this.LJLIL.LJLILLLLZI;
                                    if (wgp != null) {
                                        int measuredWidth3 = wgp.getMeasuredWidth();
                                        if (this.LJLIL.LJLJJLL != null) {
                                            measuredWidth2 = -(measuredWidth3 - r0.getMeasuredWidth());
                                        } else {
                                            o.LJIJI("endTextView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("volumeTapsView");
                                        throw null;
                                    }
                                } else {
                                    WGP wgp2 = this.LJLIL.LJLILLLLZI;
                                    if (wgp2 != null) {
                                        int measuredWidth4 = wgp2.getMeasuredWidth();
                                        TextView textView5 = this.LJLIL.LJLJJLL;
                                        if (textView5 != null) {
                                            measuredWidth2 = measuredWidth4 - textView5.getMeasuredWidth();
                                        } else {
                                            o.LJIJI("endTextView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("volumeTapsView");
                                        throw null;
                                    }
                                }
                                textView4.setTranslationX(measuredWidth2);
                                return;
                            }
                            o.LJIJI("anchorTextView");
                            throw null;
                        }
                        TextView textView6 = this.LJLIL.LJLJL;
                        if (textView6 != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            float f2 = 10;
                            LIZ2.append(String.valueOf(O6R.LJJIIZ((((float) (this.LJLILLLLZI - this.LJLJI)) / 1000.0f) * f2) / 10.0f));
                            LIZ2.append('s');
                            textView6.setText(X1D.LIZIZ(LIZ2));
                            if (this.LJLJJL && C52306Kfu.LIZ() && O6R.LJJIIZ((((float) (this.LJLILLLLZI - this.LJLJI)) / 1000.0f) * f2) % 10 == 0) {
                                AnonymousClass632.LIZIZ(this.LJLIL.getSceneContext());
                            }
                            WOB wob6 = this.LJLIL;
                            TextView textView7 = wob6.LJLJL;
                            if (textView7 != null) {
                                if (C173636rf.LIZIZ(wob6.mActivity)) {
                                    if (this.LJLIL.LJLJL != null) {
                                        if (max - (r0.getMeasuredWidth() / 2) >= 0.0f) {
                                            if (this.LJLIL.LJLILLLLZI != null) {
                                                float measuredWidth5 = r0.getMeasuredWidth() - max;
                                                if (this.LJLIL.LJLJL != null) {
                                                    if (measuredWidth5 >= r0.getMeasuredWidth() / 2) {
                                                        float f3 = -max;
                                                        if (this.LJLIL.LJLJL != null) {
                                                            measuredWidth = f3 + (r0.getMeasuredWidth() / 2);
                                                        } else {
                                                            o.LJIJI("anchorTextView");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("anchorTextView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("volumeTapsView");
                                                throw null;
                                            }
                                        }
                                        float f4 = -max;
                                        if (this.LJLIL.LJLILLLLZI != null) {
                                            float movableWidth = f4 / r0.getMovableWidth();
                                            WGP wgp3 = this.LJLIL.LJLILLLLZI;
                                            if (wgp3 != null) {
                                                int measuredWidth6 = wgp3.getMeasuredWidth();
                                                if (this.LJLIL.LJLJL != null) {
                                                    measuredWidth = movableWidth * (measuredWidth6 - r0.getMeasuredWidth());
                                                } else {
                                                    o.LJIJI("anchorTextView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("volumeTapsView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("volumeTapsView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("anchorTextView");
                                        throw null;
                                    }
                                } else {
                                    if (this.LJLIL.LJLJL != null) {
                                        if (max - (r0.getMeasuredWidth() / 2) >= 0.0f) {
                                            if (this.LJLIL.LJLILLLLZI != null) {
                                                float measuredWidth7 = r0.getMeasuredWidth() - max;
                                                if (this.LJLIL.LJLJL != null) {
                                                    if (measuredWidth7 >= r0.getMeasuredWidth() / 2) {
                                                        if (this.LJLIL.LJLJL != null) {
                                                            measuredWidth = max - (r0.getMeasuredWidth() / 2);
                                                        } else {
                                                            o.LJIJI("anchorTextView");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("anchorTextView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("volumeTapsView");
                                                throw null;
                                            }
                                        }
                                        if (this.LJLIL.LJLILLLLZI != null) {
                                            float movableWidth2 = max / r0.getMovableWidth();
                                            WGP wgp4 = this.LJLIL.LJLILLLLZI;
                                            if (wgp4 != null) {
                                                int measuredWidth8 = wgp4.getMeasuredWidth();
                                                if (this.LJLIL.LJLJL != null) {
                                                    measuredWidth = (measuredWidth8 - r0.getMeasuredWidth()) * movableWidth2;
                                                } else {
                                                    o.LJIJI("anchorTextView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("volumeTapsView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("volumeTapsView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("anchorTextView");
                                        throw null;
                                    }
                                }
                                textView7.setTranslationX(measuredWidth);
                                return;
                            }
                            o.LJIJI("anchorTextView");
                            throw null;
                        }
                        o.LJIJI("anchorTextView");
                        throw null;
                    }
                    o.LJIJI("volumeTapsView");
                    throw null;
                }
                o.LJIJI("startTextView");
                throw null;
            }
            o.LJIJI("endTextView");
            throw null;
        }
        o.LJIJI("volumeTapsView");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
