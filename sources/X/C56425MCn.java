package X;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MCn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56425MCn implements C0C4 {
    public final C80796VnM LIZ;
    public final TuxTextView LIZIZ;
    public final TuxTextView LIZJ;
    public final C57191McV LIZLLL;
    public final View LJ;
    public final int LJFF = C17N.LJIILL(16.0d);
    public final C56465MEb LJI = new C56465MEb();
    public final C56428MCq LJII = new C56428MCq();
    public final C56426MCo LJIIIIZZ;
    public List<TrendingEventModel> LJIIIZ;
    public java.util.Map<String, ? extends List<String>> LJIIJ;

    @Override // X.C0C4
    public final void LIZ(View view, float f) {
        float f2;
        boolean z;
        int LJIIL;
        Aweme item;
        Aweme item2;
        String str;
        String str2;
        String str3;
        int i;
        C56426MCo c56426MCo;
        int i2;
        float f3;
        float f4;
        float f5;
        Aweme aweme;
        Aweme aweme2;
        TrendingEventModel trendingEventModel;
        TrendingEventModel trendingEventModel2;
        C73107Smd c73107Smd;
        TrendingEventModel trendingEventModel3;
        String str4;
        String str5;
        TrendingEventModel trendingEventModel4;
        String str6;
        String str7;
        float f6;
        float f7;
        TextPaint paint;
        if (f > 1.0f || f < -1.0f) {
            return;
        }
        if (f > 0.0f) {
            f2 = 1 - f;
        } else {
            f2 = f;
        }
        C56426MCo c56426MCo2 = this.LJIIIIZZ;
        c56426MCo2.getClass();
        int i3 = 0;
        if (c56426MCo2.LIZIZ != 1 ? f <= 0.0f : f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        c56426MCo2.LIZLLL = z;
        AbstractC55082Lja abstractC55082Lja = (AbstractC55082Lja) c56426MCo2.LJ.getValue();
        String str8 = null;
        if (abstractC55082Lja != null && (LJIIL = abstractC55082Lja.LJIIL(view)) != -2) {
            if (c56426MCo2.LIZIZ == 1) {
                if (f >= 0.0f) {
                    item = abstractC55082Lja.getItem(LJIIL);
                    item2 = abstractC55082Lja.getItem(LJIIL - 1);
                } else {
                    item2 = abstractC55082Lja.getItem(LJIIL);
                    item = abstractC55082Lja.getItem(LJIIL + 1);
                }
            } else if (f > 0.0f) {
                item2 = abstractC55082Lja.getItem(LJIIL);
                item = abstractC55082Lja.getItem(LJIIL - 1);
            } else {
                item = abstractC55082Lja.getItem(LJIIL);
                item2 = abstractC55082Lja.getItem(LJIIL + 1);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollDirection:");
            LIZ.append(c56426MCo2.LIZIZ);
            LIZ.append(" offsetY:");
            LIZ.append(f);
            LIZ.append(" pagePosition:");
            LIZ.append(LJIIL);
            LIZ.append(" pageCount:");
            LIZ.append(abstractC55082Lja.getCount());
            LIZ.append("-------oldAweme:");
            if (item2 != null) {
                str = item2.getDesc();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" --------newAweme:");
            if (item != null) {
                str2 = item.getDesc();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
            if (item != null) {
                if (item2 != null) {
                    str3 = item2.getTrendingId();
                } else {
                    str3 = null;
                }
                String trendingId = item.getTrendingId();
                if (!o.LJ(str3, "") && !o.LJ(trendingId, "") && !o.LJ(str3, trendingId)) {
                    i = 1;
                    c56426MCo2.LIZJ = i;
                    c56426MCo = this.LJIIIIZZ;
                    if (c56426MCo.LIZIZ != 0 || c56426MCo.LIZJ == 0) {
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationY(0.0f);
                        this.LIZ.setIsChangingTrending(false);
                    }
                    this.LIZ.setIsChangingTrending(true);
                    TuxTextView tuxTextView = this.LIZJ;
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(33);
                    }
                    View view2 = this.LJ;
                    if (view2 != null) {
                        i2 = view2.getWidth();
                    } else {
                        i2 = 0;
                    }
                    TuxTextView tuxTextView2 = this.LIZJ;
                    if (tuxTextView2 != null && (paint = tuxTextView2.getPaint()) != null) {
                        f3 = paint.measureText(this.LIZJ.getText().toString());
                    } else {
                        f3 = 0.0f;
                    }
                    if (f3 + C17N.LJIILL(10.0d) > i2) {
                        TuxTextView tuxTextView3 = this.LIZJ;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setTuxFont(43);
                        }
                    } else {
                        TuxTextView tuxTextView4 = this.LIZJ;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTuxFont(33);
                        }
                    }
                    float interpolation = this.LJI.getInterpolation(Math.abs(f2));
                    view.setScaleX(interpolation);
                    view.setScaleY(interpolation);
                    C56426MCo c56426MCo3 = this.LJIIIIZZ;
                    if (c56426MCo3.LIZIZ == 1) {
                        if (c56426MCo3.LIZLLL) {
                            f4 = 1 - f;
                        } else {
                            f4 = -f;
                        }
                    } else if (c56426MCo3.LIZLLL) {
                        f4 = 1 + f;
                    } else {
                        f4 = f;
                    }
                    float f8 = this.LJFF * f4;
                    float height = (1 - interpolation) * view.getHeight();
                    C56426MCo c56426MCo4 = this.LJIIIIZZ;
                    if (c56426MCo4.LIZLLL) {
                        float f9 = this.LJFF;
                        if (height < f9) {
                            if (c56426MCo4.LIZIZ == 1) {
                                f7 = f9 - height;
                                f5 = f7 - f8;
                            } else {
                                f6 = height - f9;
                                f5 = f6 + f8;
                            }
                        } else if (c56426MCo4.LIZIZ == 1) {
                            f7 = (f9 - height) / 2;
                            f5 = f7 - f8;
                        } else {
                            f6 = (height - f9) / 2;
                            f5 = f6 + f8;
                        }
                    } else {
                        if (Math.abs(f4 - 1.0f) < 1.0E-6f) {
                            f8 = 0.0f;
                        } else {
                            float f10 = this.LJFF;
                            if (height < f10) {
                                if (this.LJIIIIZZ.LIZIZ == 1) {
                                    f8 = -f8;
                                }
                            } else if (this.LJIIIIZZ.LIZIZ == 1) {
                                f8 = ((height - f10) / 2) - f8;
                            } else {
                                f8 += (f10 - height) / 2;
                            }
                        }
                        f5 = f8;
                    }
                    view.setTranslationY(f5);
                    float interpolation2 = this.LJII.getInterpolation(Math.abs(f2));
                    TuxTextView tuxTextView5 = this.LIZIZ;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setAlpha(interpolation2);
                    }
                    TuxTextView tuxTextView6 = this.LIZJ;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setAlpha(interpolation2);
                    }
                    OSZ<Aweme, Aweme> LIZ2 = this.LJIIIIZZ.LIZ(view, f);
                    if (LIZ2 != null) {
                        aweme = LIZ2.getFirst();
                    } else {
                        aweme = null;
                    }
                    OSZ<Aweme, Aweme> LIZ3 = this.LJIIIIZZ.LIZ(view, f);
                    if (LIZ3 != null) {
                        aweme2 = LIZ3.getSecond();
                    } else {
                        aweme2 = null;
                    }
                    List<TrendingEventModel> list = this.LJIIIZ;
                    if (list != null) {
                        Iterator<TrendingEventModel> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                trendingEventModel4 = it.next();
                                TrendingEventModel trendingEventModel5 = trendingEventModel4;
                                if (trendingEventModel5 != null) {
                                    str6 = trendingEventModel5.getEventId();
                                } else {
                                    str6 = null;
                                }
                                if (aweme != null) {
                                    str7 = aweme.getTrendingId();
                                } else {
                                    str7 = null;
                                }
                                if (o.LJ(str6, str7)) {
                                    break;
                                }
                            } else {
                                trendingEventModel4 = null;
                                break;
                            }
                        }
                        trendingEventModel = trendingEventModel4;
                    } else {
                        trendingEventModel = null;
                    }
                    List<TrendingEventModel> list2 = this.LJIIIZ;
                    if (list2 != null) {
                        Iterator<TrendingEventModel> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                trendingEventModel3 = it2.next();
                                TrendingEventModel trendingEventModel6 = trendingEventModel3;
                                if (trendingEventModel6 != null) {
                                    str4 = trendingEventModel6.getEventId();
                                } else {
                                    str4 = null;
                                }
                                if (aweme2 != null) {
                                    str5 = aweme2.getTrendingId();
                                } else {
                                    str5 = null;
                                }
                                if (o.LJ(str4, str5)) {
                                    break;
                                }
                            } else {
                                trendingEventModel3 = null;
                                break;
                            }
                        }
                        trendingEventModel2 = trendingEventModel3;
                    } else {
                        trendingEventModel2 = null;
                    }
                    int i4 = this.LJIIIIZZ.LIZIZ;
                    if (i4 == 1) {
                        double abs = Math.abs(f2);
                        if (0.2d <= abs && abs <= 0.5d) {
                            java.util.Map<String, ? extends List<String>> map = this.LJIIJ;
                            if (map != null) {
                                if (aweme2 != null) {
                                    str8 = aweme2.getTrendingId();
                                }
                                List<String> list3 = map.get(str8);
                                if (list3 != null) {
                                    i3 = list3.size();
                                }
                            }
                            LIZIZ(i3, i3, interpolation2, trendingEventModel2);
                        } else if (Math.abs(f2) > 0.5d && Math.abs(f2) > 0.0f) {
                            java.util.Map<String, ? extends List<String>> map2 = this.LJIIJ;
                            if (map2 != null) {
                                if (aweme != null) {
                                    str8 = aweme.getTrendingId();
                                }
                                List<String> list4 = map2.get(str8);
                                if (list4 != null) {
                                    i3 = list4.size();
                                }
                            }
                            LIZIZ(1, i3, interpolation2, trendingEventModel);
                        }
                    } else if (i4 == 2) {
                        double abs2 = Math.abs(f2);
                        if (0.5d <= abs2 && abs2 <= 0.8d) {
                            java.util.Map<String, ? extends List<String>> map3 = this.LJIIJ;
                            if (map3 != null) {
                                if (aweme2 != null) {
                                    str8 = aweme2.getTrendingId();
                                }
                                List<String> list5 = map3.get(str8);
                                if (list5 != null) {
                                    i3 = list5.size();
                                }
                            }
                            LIZIZ(1, i3, interpolation2, trendingEventModel2);
                        } else if (Math.abs(f2) < 0.5d && Math.abs(f2) > 0.0f) {
                            java.util.Map<String, ? extends List<String>> map4 = this.LJIIJ;
                            if (map4 != null) {
                                if (aweme != null) {
                                    str8 = aweme.getTrendingId();
                                }
                                List<String> list6 = map4.get(str8);
                                if (list6 != null) {
                                    i3 = list6.size();
                                }
                            }
                            LIZIZ(i3, i3, interpolation2, trendingEventModel);
                        }
                    }
                    ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                    if (!(outlineProvider instanceof C73107Smd) || (c73107Smd = (C73107Smd) outlineProvider) == null) {
                        c73107Smd = new C73107Smd();
                        view.setOutlineProvider(c73107Smd);
                        view.setClipToOutline(true);
                    } else {
                        view.invalidateOutline();
                    }
                    c73107Smd.LIZ = Math.abs(f2);
                    return;
                }
            }
        }
        i = 0;
        c56426MCo2.LIZJ = i;
        c56426MCo = this.LJIIIIZZ;
        if (c56426MCo.LIZIZ != 0) {
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        this.LIZ.setIsChangingTrending(false);
    }

    public final void LIZIZ(int i, int i2, float f, TrendingEventModel trendingEventModel) {
        String str;
        boolean z;
        String str2;
        String rankText;
        String str3 = null;
        if (trendingEventModel != null) {
            str = trendingEventModel.getTrendingName();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LIZJ;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView2 = this.LIZJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            TuxTextView tuxTextView3 = this.LIZJ;
            if (tuxTextView3 != null) {
                if (trendingEventModel != null) {
                    str2 = trendingEventModel.getTrendingName();
                } else {
                    str2 = null;
                }
                tuxTextView3.setText(str2);
            }
        }
        TuxTextView tuxTextView4 = this.LIZIZ;
        if (tuxTextView4 != null) {
            if (trendingEventModel != null) {
                str3 = trendingEventModel.getRankText();
            }
            tuxTextView4.setText(str3);
        }
        if (trendingEventModel == null || (rankText = trendingEventModel.getRankText()) == null || rankText.length() == 0 || C56424MCm.LIZ()) {
            TuxTextView tuxTextView5 = this.LIZIZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setVisibility(8);
            }
        } else {
            TuxTextView tuxTextView6 = this.LIZIZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setVisibility(0);
            }
        }
        C57191McV c57191McV = this.LIZLLL;
        if (c57191McV != null) {
            if (i2 <= 5) {
                c57191McV.getNumberText().setVisibility(4);
                c57191McV.LJLIIIL(i, i2);
            } else {
                c57191McV.LJLI(i, i2);
            }
        }
        C57191McV c57191McV2 = this.LIZLLL;
        if (c57191McV2 != null) {
            c57191McV2.setAlpha(f);
        }
        C57191McV c57191McV3 = this.LIZLLL;
        if (c57191McV3 != null) {
            c57191McV3.LJLIIL(i, i2);
        }
    }

    public C56425MCn(C80796VnM c80796VnM, TuxTextView tuxTextView, TuxTextView tuxTextView2, C57191McV c57191McV, View view) {
        this.LIZ = c80796VnM;
        this.LIZIZ = tuxTextView;
        this.LIZJ = tuxTextView2;
        this.LIZLLL = c57191McV;
        this.LJ = view;
        this.LJIIIIZZ = new C56426MCo(c80796VnM);
    }
}
