package com.ss.android.ugc.aweme.tools.draft.adapter.viewholder;

import X.AbstractC41429GNt;
import X.C00F;
import X.C13I;
import X.C16880lQ;
import X.C41425GNp;
import X.C41426GNq;
import X.C41802Gas;
import X.C60903NvH;
import X.C71897SJp;
import X.C78764Uvg;
import X.C78983UzD;
import X.C8SG;
import X.GOK;
import X.GOL;
import X.H7B;
import X.InterfaceC207258Bl;
import X.KL2;
import X.W5G;
import X.X1D;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import Y.IDCListenerS299S0100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;
import o3.h0;
import ujb.s;

/* loaded from: classes8.dex */
public final class NewDraftViewHolder extends AbstractC41429GNt<C41425GNp> implements GenericLifecycleObserver {
    public final GOK LJLIL;
    public final C13I LJLILLLLZI;
    public final String LJLJI;
    public final Context LJLJJI;
    public TuxTextView LJLJJL;
    public ViewGroup LJLJJLL;
    public TuxTextView LJLJL;
    public ViewGroup LJLJLJ;
    public ViewGroup LJLJLLL;
    public ViewGroup LJLL;
    public TuxIconView LJLLI;
    public TextView LJLLILLLL;
    public C71897SJp LJLLJ;
    public W5G LJLLL;
    public C41425GNp LJLLLL;
    public InterfaceC207258Bl LJLLLLLL;
    public long LJLZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC41429GNt
    public final void L(C41426GNq c41426GNq) {
        boolean z;
        boolean z2;
        boolean z3;
        C41425GNp details = (C41425GNp) c41426GNq;
        o.LJIIIZ(details, "details");
        this.LJLLLL = details;
        if (details.LIZIZ) {
            C71897SJp c71897SJp = this.LJLLJ;
            if (c71897SJp != null) {
                c71897SJp.setVisibility(0);
            } else {
                o.LJIJI("mCheckBox");
                throw null;
            }
        } else {
            C71897SJp c71897SJp2 = this.LJLLJ;
            if (c71897SJp2 != null) {
                c71897SJp2.setVisibility(8);
                C41425GNp c41425GNp = this.LJLLLL;
                if (c41425GNp != null) {
                    c41425GNp.LJIIIZ = false;
                } else {
                    o.LJIJI("mData");
                    throw null;
                }
            } else {
                o.LJIJI("mCheckBox");
                throw null;
            }
        }
        C71897SJp c71897SJp3 = this.LJLLJ;
        if (c71897SJp3 != null) {
            C41425GNp c41425GNp2 = this.LJLLLL;
            if (c41425GNp2 != null) {
                c71897SJp3.setChecked(c41425GNp2.LJIIIZ);
                C71897SJp c71897SJp4 = this.LJLLJ;
                if (c71897SJp4 != null) {
                    C16880lQ.LJJJI(c71897SJp4, new ACListenerS27S0100000_7(this, 176));
                    W5G w5g = this.LJLLL;
                    if (w5g != null) {
                        C41425GNp c41425GNp3 = this.LJLLLL;
                        if (c41425GNp3 != null) {
                            w5g.setTag(c41425GNp3.LJ);
                            W5G w5g2 = this.LJLLL;
                            if (w5g2 != null) {
                                w5g2.setActualImageResource(R.drawable.b3w);
                                C41425GNp c41425GNp4 = this.LJLLLL;
                                if (c41425GNp4 != null) {
                                    File file = new File(c41425GNp4.LJFF);
                                    if (file.exists()) {
                                        Uri fromFile = Uri.fromFile(file);
                                        W5G w5g3 = this.LJLLL;
                                        if (w5g3 != null) {
                                            C78764Uvg.LJIIIZ(w5g3, fromFile.toString(), -1, -1);
                                        } else {
                                            o.LJIJI("mCover");
                                            throw null;
                                        }
                                    } else {
                                        AwemeDraft LIZ = this.LJLILLLLZI.LIZ(c41425GNp4.LJ);
                                        if (LIZ == null) {
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append(this.LJLJI);
                                            LIZ2.append(": bindDraftCover -> draft is null");
                                            H7B.LIZJ(X1D.LIZIZ(LIZ2));
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("queryNull -> ");
                                            LIZ3.append(this.LJLJI);
                                            LIZ3.append(" : bindDraftCover");
                                            C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                                        } else {
                                            int dimensionPixelOffset = this.LJLJJI.getResources().getDimensionPixelOffset(R.dimen.oc);
                                            C41802Gas.LJIIIIZZ(LIZ, new VideoCoverConfig(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888), new GOL(this, c41425GNp4, LIZ));
                                        }
                                    }
                                    C41425GNp c41425GNp5 = this.LJLLLL;
                                    if (c41425GNp5 != null) {
                                        if (!c41425GNp5.LIZIZ) {
                                            TuxTextView tuxTextView = this.LJLJJL;
                                            if (tuxTextView != null) {
                                                tuxTextView.setVisibility(0);
                                                TuxTextView tuxTextView2 = this.LJLJJL;
                                                if (tuxTextView2 != null) {
                                                    C41425GNp c41425GNp6 = this.LJLLLL;
                                                    if (c41425GNp6 != null) {
                                                        tuxTextView2.setText(c41425GNp6.LJIIIIZZ);
                                                        InterfaceC207258Bl interfaceC207258Bl = this.LJLLLLLL;
                                                        if (interfaceC207258Bl != null) {
                                                            interfaceC207258Bl.LIZJ("is_editing_drafts");
                                                        } else {
                                                            o.LJIJI("iconController");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mData");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mTvTop");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mTvTop");
                                                throw null;
                                            }
                                        } else {
                                            InterfaceC207258Bl interfaceC207258Bl2 = this.LJLLLLLL;
                                            if (interfaceC207258Bl2 != null) {
                                                interfaceC207258Bl2.LJ("is_editing_drafts");
                                                TuxTextView tuxTextView3 = this.LJLJJL;
                                                if (tuxTextView3 != null) {
                                                    tuxTextView3.setVisibility(8);
                                                } else {
                                                    o.LJIJI("mTvTop");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("iconController");
                                                throw null;
                                            }
                                        }
                                        AwemeDraft LIZ4 = this.LJLILLLLZI.LIZ(details.LJ);
                                        InterfaceC207258Bl interfaceC207258Bl3 = this.LJLLLLLL;
                                        if (interfaceC207258Bl3 != null) {
                                            if (LIZ4 != null && LIZ4.LJIIIZ()) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            interfaceC207258Bl3.LIZLLL(z);
                                            C41425GNp c41425GNp7 = this.LJLLLL;
                                            if (c41425GNp7 != null) {
                                                if (c41425GNp7.LIZJ) {
                                                    ViewGroup viewGroup = this.LJLL;
                                                    if (viewGroup != null) {
                                                        viewGroup.setVisibility(0);
                                                        ViewGroup viewGroup2 = this.LJLJLJ;
                                                        if (viewGroup2 != null) {
                                                            viewGroup2.setVisibility(8);
                                                            TextView textView = this.LJLLILLLL;
                                                            if (textView != null) {
                                                                Context context = this.LJLJJI;
                                                                C41425GNp c41425GNp8 = this.LJLLLL;
                                                                if (c41425GNp8 != null) {
                                                                    long j = c41425GNp8.LJI;
                                                                    o.LJIIIZ(context, "context");
                                                                    String string = context.getString(R.string.qx7, Double.valueOf(j / 1048576.0d));
                                                                    o.LJIIIIZZ(string, "{\n            context.ge…ze / 1048576.0)\n        }");
                                                                    textView.setText(string);
                                                                    return;
                                                                }
                                                                o.LJIJI("mData");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mDraftSize");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mVideoInfoContainer");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mSizeContainer");
                                                    throw null;
                                                }
                                                ViewGroup viewGroup3 = this.LJLL;
                                                if (viewGroup3 != null) {
                                                    viewGroup3.setVisibility(8);
                                                    C41425GNp c41425GNp9 = this.LJLLLL;
                                                    if (c41425GNp9 != null) {
                                                        if (c41425GNp9.LJII.length() > 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            C41425GNp c41425GNp10 = this.LJLLLL;
                                                            if (c41425GNp10 != null) {
                                                                if (c41425GNp10.LIZIZ) {
                                                                    ViewGroup viewGroup4 = this.LJLJLJ;
                                                                    if (viewGroup4 != null) {
                                                                        viewGroup4.setVisibility(8);
                                                                    } else {
                                                                        o.LJIJI("mVideoInfoContainer");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    if (C00F.LIZ(31744, 0, "studio_create_new_video", true) == 2) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    if (z3) {
                                                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                                                                        layoutParams.addRule(20);
                                                                        int LIZJ = (int) KL2.LIZJ(this.itemView.getContext(), 4.0f);
                                                                        int LIZJ2 = (int) KL2.LIZJ(this.itemView.getContext(), 6.0f);
                                                                        layoutParams.setMargins(LIZJ, LIZJ2, LIZJ, LIZJ2);
                                                                        ViewGroup viewGroup5 = this.LJLJLLL;
                                                                        if (viewGroup5 != null) {
                                                                            viewGroup5.setLayoutParams(layoutParams);
                                                                            TuxIconView tuxIconView = this.LJLLI;
                                                                            if (tuxIconView != null) {
                                                                                tuxIconView.setIconRes(R.raw.icon_music_note_s_alt);
                                                                                TuxIconView tuxIconView2 = this.LJLLI;
                                                                                if (tuxIconView2 != null) {
                                                                                    tuxIconView2.setTintColorRes(R.attr.dj);
                                                                                    TuxTextView tuxTextView4 = this.LJLJL;
                                                                                    if (tuxTextView4 != null) {
                                                                                        tuxTextView4.setMaxLines(1);
                                                                                        TuxTextView tuxTextView5 = this.LJLJL;
                                                                                        if (tuxTextView5 != null) {
                                                                                            tuxTextView5.setMinTextSize(13.0f);
                                                                                            TuxTextView tuxTextView6 = this.LJLJL;
                                                                                            if (tuxTextView6 != null) {
                                                                                                tuxTextView6.setTuxFont(62);
                                                                                                TuxTextView tuxTextView7 = this.LJLJL;
                                                                                                if (tuxTextView7 != null) {
                                                                                                    tuxTextView7.setText(c41425GNp10.LJII);
                                                                                                } else {
                                                                                                    o.LJIJI("textBottom");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                o.LJIJI("textBottom");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            o.LJIJI("textBottom");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        o.LJIJI("textBottom");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("iconView");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("iconView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("mTextBottomContainer");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        TuxIconView tuxIconView3 = this.LJLLI;
                                                                        if (tuxIconView3 != null) {
                                                                            tuxIconView3.setIconRes(R.raw.icon_video);
                                                                            TuxIconView tuxIconView4 = this.LJLLI;
                                                                            if (tuxIconView4 != null) {
                                                                                tuxIconView4.setTintColorRes(R.attr.dj);
                                                                                TuxTextView tuxTextView8 = this.LJLJL;
                                                                                if (tuxTextView8 != null) {
                                                                                    tuxTextView8.setMaxLines(2);
                                                                                    TuxTextView tuxTextView9 = this.LJLJL;
                                                                                    if (tuxTextView9 != null) {
                                                                                        tuxTextView9.setMinTextSize(10.0f);
                                                                                        Object LLIZ = C16880lQ.LLIZ("window", C60903NvH.LJ);
                                                                                        o.LJII(LLIZ, "null cannot be cast to non-null type android.view.WindowManager");
                                                                                        Display defaultDisplay = ((WindowManager) LLIZ).getDefaultDisplay();
                                                                                        Point point = new Point();
                                                                                        defaultDisplay.getRealSize(point);
                                                                                        int LIZJ3 = (point.x / 3) - ((int) KL2.LIZJ(this.itemView.getContext(), 34.0f));
                                                                                        TuxTextView tuxTextView10 = this.LJLJL;
                                                                                        if (tuxTextView10 != null) {
                                                                                            TextPaint paint = tuxTextView10.getPaint();
                                                                                            String string2 = this.LJLJJI.getString(R.string.ezq);
                                                                                            o.LJIIIIZZ(string2, "mContext.getString(string.drafts_list_reuse_sound)");
                                                                                            TuxTextView tuxTextView11 = this.LJLJL;
                                                                                            if (tuxTextView11 != null) {
                                                                                                tuxTextView11.setText(R.string.ezq);
                                                                                                TuxTextView tuxTextView12 = this.LJLJL;
                                                                                                if (tuxTextView12 != null) {
                                                                                                    tuxTextView12.setTuxFont(92);
                                                                                                    float f = LIZJ3;
                                                                                                    if (paint.measureText(string2) > f) {
                                                                                                        TuxTextView tuxTextView13 = this.LJLJL;
                                                                                                        if (tuxTextView13 != null) {
                                                                                                            tuxTextView13.setTuxFont(92);
                                                                                                        } else {
                                                                                                            o.LJIJI("textBottom");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        TuxTextView tuxTextView14 = this.LJLJL;
                                                                                                        if (tuxTextView14 != null) {
                                                                                                            tuxTextView14.setTuxFont(62);
                                                                                                        } else {
                                                                                                            o.LJIJI("textBottom");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    String[] strArr = (String[]) s.LJLJJL(string2, new String[]{" "}, 0, 6).toArray(new String[0]);
                                                                                                    if (paint.measureText(string2) > f) {
                                                                                                        try {
                                                                                                            String str = strArr[0];
                                                                                                            int length = strArr.length;
                                                                                                            int i = 0;
                                                                                                            for (int i2 = 1; i2 < length; i2++) {
                                                                                                                StringBuilder LIZ5 = X1D.LIZ();
                                                                                                                LIZ5.append(str);
                                                                                                                LIZ5.append(' ');
                                                                                                                LIZ5.append(strArr[i2]);
                                                                                                                if (paint.measureText(X1D.LIZIZ(LIZ5)) <= f) {
                                                                                                                    StringBuilder LIZ6 = X1D.LIZ();
                                                                                                                    LIZ6.append(str);
                                                                                                                    LIZ6.append(' ');
                                                                                                                    LIZ6.append(strArr[i2]);
                                                                                                                    str = X1D.LIZIZ(LIZ6);
                                                                                                                } else {
                                                                                                                    i = i2;
                                                                                                                }
                                                                                                            }
                                                                                                            String str2 = strArr[i];
                                                                                                            int length2 = strArr.length;
                                                                                                            for (int i3 = i + 1; i3 < length2; i3++) {
                                                                                                                StringBuilder LIZ7 = X1D.LIZ();
                                                                                                                LIZ7.append(str2);
                                                                                                                LIZ7.append(' ');
                                                                                                                LIZ7.append(strArr[i3]);
                                                                                                                str2 = X1D.LIZIZ(LIZ7);
                                                                                                            }
                                                                                                            float measureText = paint.measureText(str);
                                                                                                            float measureText2 = paint.measureText(str2);
                                                                                                            if (measureText < measureText2) {
                                                                                                                measureText = measureText2;
                                                                                                            }
                                                                                                            TuxTextView tuxTextView15 = this.LJLJL;
                                                                                                            if (tuxTextView15 != null) {
                                                                                                                tuxTextView15.setWidth((int) (measureText + 1));
                                                                                                            } else {
                                                                                                                o.LJIJI("textBottom");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } catch (IndexOutOfBoundsException e) {
                                                                                                            C16880lQ.LLLLIIL(e);
                                                                                                        } catch (NullPointerException e2) {
                                                                                                            C16880lQ.LLLLIIL(e2);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    o.LJIJI("textBottom");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                o.LJIJI("textBottom");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            o.LJIJI("textBottom");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        o.LJIJI("textBottom");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("textBottom");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("iconView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("iconView");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    TuxTextView tuxTextView16 = this.LJLJL;
                                                                    if (tuxTextView16 != null) {
                                                                        tuxTextView16.setVisibility(0);
                                                                        ViewGroup viewGroup6 = this.LJLJLJ;
                                                                        if (viewGroup6 != null) {
                                                                            viewGroup6.setVisibility(0);
                                                                        } else {
                                                                            o.LJIJI("mVideoInfoContainer");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("textBottom");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else {
                                                                o.LJIJI("mData");
                                                                throw null;
                                                            }
                                                        } else {
                                                            TuxTextView tuxTextView17 = this.LJLJL;
                                                            if (tuxTextView17 != null) {
                                                                tuxTextView17.setVisibility(8);
                                                                ViewGroup viewGroup7 = this.LJLJLJ;
                                                                if (viewGroup7 != null) {
                                                                    viewGroup7.setVisibility(8);
                                                                } else {
                                                                    o.LJIJI("mVideoInfoContainer");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("textBottom");
                                                                throw null;
                                                            }
                                                        }
                                                        ViewGroup viewGroup8 = this.LJLJLJ;
                                                        if (viewGroup8 != null) {
                                                            C16880lQ.LJIIL(viewGroup8, new ACListenerS42S0200000_7(this, details, 49));
                                                            return;
                                                        } else {
                                                            o.LJIJI("mVideoInfoContainer");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("mData");
                                                    throw null;
                                                }
                                                o.LJIJI("mSizeContainer");
                                                throw null;
                                            }
                                            o.LJIJI("mData");
                                            throw null;
                                        }
                                        o.LJIJI("iconController");
                                        throw null;
                                    }
                                    o.LJIJI("mData");
                                    throw null;
                                }
                                o.LJIJI("mData");
                                throw null;
                            }
                            o.LJIJI("mCover");
                            throw null;
                        }
                        o.LJIJI("mData");
                        throw null;
                    }
                    o.LJIJI("mCover");
                    throw null;
                }
                o.LJIJI("mCheckBox");
                throw null;
            }
            o.LJIJI("mData");
            throw null;
        }
        o.LJIJI("mCheckBox");
        throw null;
    }

    public NewDraftViewHolder(View view, GOK gok, C13I c13i) {
        super(view);
        this.LJLIL = gok;
        this.LJLILLLLZI = c13i;
        this.LJLJI = "NewDraftViewHolder";
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLJJI = context;
        View findViewById = view.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(id.container)");
        this.LJLJJLL = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.me4);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(id.tv_play_count)");
        this.LJLJL = (TuxTextView) findViewById2;
        View LJIIZILJ = h0.LJIIZILJ(R.id.cover, view);
        o.LJIIIIZZ(LJIIZILJ, "requireViewById(itemView, id.cover)");
        this.LJLLL = (W5G) LJIIZILJ;
        View findViewById3 = view.findViewById(R.id.moj);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(id.tv_top)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.n66);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(id.video_info_container)");
        this.LJLJLJ = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.l3r);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(id.text_container)");
        this.LJLJLLL = (ViewGroup) findViewById5;
        View LJIIZILJ2 = h0.LJIIZILJ(R.id.m5t, view);
        o.LJIIIIZZ(LJIIZILJ2, "requireViewById(itemView, id.tv_draft_size)");
        this.LJLLILLLL = (TextView) LJIIZILJ2;
        View LJIIZILJ3 = h0.LJIIZILJ(R.id.k1k, view);
        o.LJIIIIZZ(LJIIZILJ3, "requireViewById(itemView, id.size_container)");
        this.LJLL = (ViewGroup) LJIIZILJ3;
        View LJIIZILJ4 = h0.LJIIZILJ(R.id.b_o, view);
        o.LJIIIIZZ(LJIIZILJ4, "requireViewById(itemView, id.checkbox)");
        this.LJLLJ = (C71897SJp) LJIIZILJ4;
        View findViewById6 = view.findViewById(R.id.f9m);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(id.iv_record)");
        this.LJLLI = (TuxIconView) findViewById6;
        C8SG c8sg = C8SG.LIZIZ;
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            InterfaceC207258Bl LJI = c8sg.LJI(viewGroup);
            this.LJLLLLLL = LJI;
            if (LJI != null) {
                TuxTextView tuxTextView = this.LJLJJL;
                if (tuxTextView != null) {
                    LJI.LIZ(tuxTextView);
                    InterfaceC207258Bl interfaceC207258Bl = this.LJLLLLLL;
                    if (interfaceC207258Bl != null) {
                        C71897SJp c71897SJp = this.LJLLJ;
                        if (c71897SJp != null) {
                            interfaceC207258Bl.LIZ(c71897SJp);
                            ViewGroup viewGroup2 = this.LJLJJLL;
                            if (viewGroup2 != null) {
                                C16880lQ.LJIIL(viewGroup2, new Au2S16S0100000_7(this, 12, 42));
                                ViewGroup viewGroup3 = this.LJLJJLL;
                                if (viewGroup3 != null) {
                                    viewGroup3.setOnLongClickListener(new IDCListenerS299S0100000_7(this, 1));
                                    return;
                                } else {
                                    o.LJIJI("container");
                                    throw null;
                                }
                            }
                            o.LJIJI("container");
                            throw null;
                        }
                        o.LJIJI("mCheckBox");
                        throw null;
                    }
                    o.LJIJI("iconController");
                    throw null;
                }
                o.LJIJI("mTvTop");
                throw null;
            }
            o.LJIJI("iconController");
            throw null;
        }
        o.LJIJI("container");
        throw null;
    }
}
