package X;

import Y.ARunnableS32S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.Toq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75792Toq extends AbstractC75784Toi {
    public final String LIZLLL;
    public C75793Tor LJ;
    public int LJFF = -1;
    public C75378TiA LJI;
    public boolean LJII;

    @Override // X.AbstractC75784Toi
    public final int LIZIZ() {
        return R.layout.dn5;
    }

    @Override // X.AbstractC75784Toi
    public final void LIZLLL() {
        C75378TiA c75378TiA;
        super.LIZLLL();
        if (this.LJII && (c75378TiA = this.LJI) != null) {
            c75378TiA.LIZJ = true;
        }
    }

    @Override // X.AbstractC75784Toi
    public final String LIZ() {
        return this.LIZLLL;
    }

    public C75792Toq(String str) {
        this.LIZLLL = str;
    }

    @Override // X.AbstractC75784Toi
    public final void LIZJ(ViewGroup viewGroup) {
        if (viewGroup != null && CCJ.LIZ(viewGroup.getContext())) {
            viewGroup.setLayoutDirection(1);
            viewGroup.setTextDirection(4);
        }
    }

    public final void LJFF(ImageModel imageModel) {
        C47061t0 c47061t0;
        View findViewById;
        if (imageModel == null) {
            return;
        }
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.ajj)) != null) {
            C87277YNd.LJJIIZ(findViewById);
        }
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null && (c47061t0 = (C47061t0) viewGroup2.findViewById(R.id.hsi)) != null) {
            TV3.LJIILL(c47061t0, new ARunnableS32S0200000_13(imageModel, c47061t0, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.W5O, REQUEST] */
    public final void LJI(int i) {
        EnumC32197CkL enumC32197CkL;
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        ImageModel imageModel;
        VA9 va9;
        List<String> urls;
        View findViewById7;
        View findViewById8;
        View findViewById9;
        C75793Tor c75793Tor = this.LJ;
        ImageModel imageModel2 = null;
        r2 = null;
        String str = null;
        ImageModel imageModel3 = null;
        if (c75793Tor != null) {
            enumC32197CkL = c75793Tor.LIZ;
        } else {
            enumC32197CkL = null;
        }
        if (enumC32197CkL == EnumC32197CkL.FEED) {
            if (i != -1 && i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ViewGroup viewGroup = this.LIZ;
                        if (viewGroup != null && (findViewById9 = viewGroup.findViewById(R.id.hb3)) != null) {
                            C87277YNd.LJJIIZ(findViewById9);
                        }
                        ViewGroup viewGroup2 = this.LIZ;
                        if (viewGroup2 != null && (findViewById8 = viewGroup2.findViewById(R.id.hiv)) != null) {
                            C87277YNd.LJJIJ(findViewById8);
                        }
                        C75378TiA c75378TiA = this.LJI;
                        if (c75378TiA != null) {
                            c75378TiA.LIZJ = true;
                        }
                        Integer valueOf = Integer.valueOf(this.LJFF);
                        if (valueOf.intValue() != 2) {
                            valueOf.intValue();
                            C75793Tor c75793Tor2 = this.LJ;
                            if (c75793Tor2 != null) {
                                imageModel = c75793Tor2.LIZLLL;
                            } else {
                                imageModel = null;
                            }
                            C78747UvP c78747UvP = new C78747UvP(5);
                            ViewGroup viewGroup3 = this.LIZ;
                            if (viewGroup3 != null) {
                                va9 = (VA9) viewGroup3.findViewById(R.id.hsi);
                            } else {
                                va9 = null;
                            }
                            ViewGroup viewGroup4 = this.LIZ;
                            if (viewGroup4 != null && (findViewById7 = viewGroup4.findViewById(R.id.ajj)) != null) {
                                C87277YNd.LJJIJ(findViewById7);
                            }
                            if (C15650jR.LIZIZ(imageModel)) {
                                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                                    str = (String) ORZ.LJLLLL(urls);
                                }
                                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                                LIZLLL.LJIIJ = c78747UvP;
                                ?? LIZ = LIZLLL.LIZ();
                                if (va9 != null) {
                                    C81705W4v LIZJ = W5I.LIZJ();
                                    LIZJ.LIZLLL = LIZ;
                                    LIZJ.LJIIL = va9.getController();
                                    va9.setController(LIZJ.LIZ());
                                }
                            } else {
                                W5P LIZJ2 = W5P.LIZJ(R.drawable.cuk);
                                LIZJ2.LJIIJ = c78747UvP;
                                ?? LIZ2 = LIZJ2.LIZ();
                                if (va9 != null) {
                                    C81705W4v LIZJ3 = W5I.LIZJ();
                                    LIZJ3.LIZLLL = LIZ2;
                                    LIZJ3.LJIIL = va9.getController();
                                    va9.setController(LIZJ3.LIZ());
                                }
                            }
                        }
                    }
                } else {
                    ViewGroup viewGroup5 = this.LIZ;
                    if (viewGroup5 != null && (findViewById6 = viewGroup5.findViewById(R.id.hb3)) != null) {
                        C87277YNd.LJJIJ(findViewById6);
                    }
                    ViewGroup viewGroup6 = this.LIZ;
                    if (viewGroup6 != null && (findViewById5 = viewGroup6.findViewById(R.id.hiv)) != null) {
                        C87277YNd.LJJIIZ(findViewById5);
                    }
                    C75378TiA c75378TiA2 = this.LJI;
                    if (c75378TiA2 != null) {
                        c75378TiA2.LIZJ = true;
                    }
                    ViewGroup viewGroup7 = this.LIZ;
                    if (viewGroup7 != null && (findViewById4 = viewGroup7.findViewById(R.id.hba)) != null) {
                        C87277YNd.LJJIIZI(findViewById4);
                    }
                    Integer valueOf2 = Integer.valueOf(this.LJFF);
                    int intValue = valueOf2.intValue();
                    if (intValue != 0 && intValue != 1) {
                        valueOf2.intValue();
                        C75793Tor c75793Tor3 = this.LJ;
                        if (c75793Tor3 != null) {
                            imageModel3 = c75793Tor3.LIZLLL;
                        }
                        LJFF(imageModel3);
                    }
                }
            } else {
                ViewGroup viewGroup8 = this.LIZ;
                if (viewGroup8 != null && (findViewById3 = viewGroup8.findViewById(R.id.hb3)) != null) {
                    C87277YNd.LJJIIZ(findViewById3);
                }
                ViewGroup viewGroup9 = this.LIZ;
                if (viewGroup9 != null && (findViewById2 = viewGroup9.findViewById(R.id.hiv)) != null) {
                    C87277YNd.LJJIIZ(findViewById2);
                }
                ViewGroup viewGroup10 = this.LIZ;
                if (viewGroup10 != null && (findViewById = viewGroup10.findViewById(R.id.hba)) != null) {
                    C87277YNd.LJJIJ(findViewById);
                }
                Integer valueOf3 = Integer.valueOf(this.LJFF);
                int intValue2 = valueOf3.intValue();
                if (intValue2 != 0 && intValue2 != 1) {
                    valueOf3.intValue();
                    C75793Tor c75793Tor4 = this.LJ;
                    if (c75793Tor4 != null) {
                        imageModel2 = c75793Tor4.LIZLLL;
                    }
                    LJFF(imageModel2);
                }
            }
        }
        this.LJFF = i;
    }
}
