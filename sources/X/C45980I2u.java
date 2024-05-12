package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff;
import com.ss.android.ugc.aweme.services.SplitShootBottomTabModule;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I2u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45980I2u implements InterfaceC44316HaK {
    public ShortVideoContext LJLIL;

    public final List<WSH> LIZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        ArrayList arrayList = new ArrayList();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        this.LJLIL = shortVideoContext;
        if (V16.LJJIL(shortVideoContext)) {
            arrayList.add(new C46001I3p(C0MT.LIZIZ(I38.RECORD_LIGHTENING_PHOTO, activityC45651qj, "activity.getString(this)"), I38.PHOTO_SHORT.getTag(), "quick_photo", false, diContainer));
            I38 i38 = I38.RECORD_LIGHTENING_VIDEO;
            arrayList.add(new I3R(C0MT.LIZIZ(i38, activityC45651qj, "activity.getString(this)"), i38.getTag(), "quick_video", true, diContainer));
        } else {
            ShortVideoContext shortVideoContext2 = this.LJLIL;
            if (shortVideoContext2 != null) {
                if (C44256HYm.LJIIL(shortVideoContext2)) {
                    arrayList.add(new C46001I3p(C0MT.LIZIZ(I38.RECORD_LIGHTENING_PHOTO, activityC45651qj, "activity.getString(this)"), I38.PHOTO_SHORT.getTag(), "quick_photo", false, diContainer));
                }
                ShortVideoContext shortVideoContext3 = this.LJLIL;
                if (shortVideoContext3 != null) {
                    if (C44256HYm.LJIILIIL(shortVideoContext3)) {
                        I38 i382 = I38.RECORD_LIGHTENING_VIDEO;
                        arrayList.add(new I3R(C0MT.LIZIZ(i382, activityC45651qj, "activity.getString(this)"), i382.getTag(), "quick_video", true, diContainer));
                    }
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            } else {
                o.LJIJI("shortVideoContext");
                throw null;
            }
        }
        return arrayList;
    }

    public final void LIZIZ(String str) {
        ShortVideoContext shortVideoContext = this.LJLIL;
        if (shortVideoContext != null) {
            C45983I2x.LIZ(shortVideoContext.shootWay, shortVideoContext.LJI(), str);
        } else {
            o.LJIJI("shortVideoContext");
            throw null;
        }
    }

    @Override // X.InterfaceC44316HaK
    public final List<WSH> LJ(C82622Wbi diContainer) {
        boolean z;
        o.LJIIIZ(diContainer, "diContainer");
        ArrayList arrayList = new ArrayList();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        this.LJLIL = shortVideoContext;
        if (V16.LJJIL(shortVideoContext)) {
            arrayList.add(new C45984I2y(C0MT.LIZIZ(I38.RECORD_SPLIT_LIGHTENING, activityC45651qj, "activity.getString(this)"), I38.RECORD_LIGHTENING_QUICK.getTag(), true, diContainer));
        } else {
            ShortVideoContext shortVideoContext2 = this.LJLIL;
            if (shortVideoContext2 != null) {
                if (C44315HaJ.LIZ(shortVideoContext2)) {
                    arrayList.add(new I3F(diContainer));
                }
                ShortVideoContext shortVideoContext3 = this.LJLIL;
                if (shortVideoContext3 != null) {
                    boolean LJJJI = shortVideoContext3.LJJJI();
                    ShortVideoContext shortVideoContext4 = this.LJLIL;
                    if (shortVideoContext4 != null) {
                        boolean LJJIJIIJI = shortVideoContext4.LJJIJIIJI();
                        if (LJJJI && !LJJIJIIJI) {
                            ShortVideoContext shortVideoContext5 = this.LJLIL;
                            if (shortVideoContext5 != null) {
                                if (!C44256HYm.LJI(shortVideoContext5)) {
                                    I38 i38 = I38.RECORD_COMBINE_LIGHTENING;
                                    arrayList.add(new C45973I2n(C0MT.LIZIZ(i38, activityC45651qj, "activity.getString(this)"), i38.getTag(), "video", true, diContainer));
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        }
                        ShortVideoContext shortVideoContext6 = this.LJLIL;
                        if (shortVideoContext6 != null) {
                            if (C78929UyL.LJJI(shortVideoContext6)) {
                                ShortVideoContext shortVideoContext7 = this.LJLIL;
                                if (shortVideoContext7 != null) {
                                    if (!C44256HYm.LJI(shortVideoContext7)) {
                                        ShortVideoContext shortVideoContext8 = this.LJLIL;
                                        if (shortVideoContext8 != null) {
                                            arrayList.add(new C46010I3y(diContainer, V16.LJJJZ(shortVideoContext8)));
                                        } else {
                                            o.LJIJI("shortVideoContext");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            }
                            ShortVideoContext shortVideoContext9 = this.LJLIL;
                            if (shortVideoContext9 != null) {
                                boolean LJJJI2 = shortVideoContext9.LJJJI();
                                ShortVideoContext shortVideoContext10 = this.LJLIL;
                                if (shortVideoContext10 != null) {
                                    boolean LJJIJIIJI2 = shortVideoContext10.LJJIJIIJI();
                                    ShortVideoContext shortVideoContext11 = this.LJLIL;
                                    if (shortVideoContext11 != null) {
                                        if (!C44256HYm.LJI(shortVideoContext11) && (!LJJJI2 || LJJIJIIJI2)) {
                                            I38 i382 = I38.RECORD_SPLIT_LIGHTENING;
                                            String LIZIZ = C0MT.LIZIZ(i382, activityC45651qj, "activity.getString(this)");
                                            String tag = i382.getTag();
                                            ShortVideoContext shortVideoContext12 = this.LJLIL;
                                            if (shortVideoContext12 != null) {
                                                arrayList.add(new SplitShootBottomTabModule(LIZIZ, tag, diContainer, C44256HYm.LIZJ(shortVideoContext12)));
                                            } else {
                                                o.LJIJI("shortVideoContext");
                                                throw null;
                                            }
                                        }
                                        ShortVideoContext shortVideoContext13 = this.LJLIL;
                                        if (shortVideoContext13 != null) {
                                            if (V16.LJJLIIIJ(shortVideoContext13)) {
                                                ShortVideoContext shortVideoContext14 = this.LJLIL;
                                                if (shortVideoContext14 != null) {
                                                    if (!ORZ.LJLJJI(shortVideoContext14.shootWay, C44356Hay.LIZIZ)) {
                                                        ShortVideoContext shortVideoContext15 = this.LJLIL;
                                                        if (shortVideoContext15 != null) {
                                                            if (!C44256HYm.LJIIIIZZ(shortVideoContext15)) {
                                                                z = false;
                                                                arrayList.add(new I3L(diContainer, z));
                                                            }
                                                        } else {
                                                            o.LJIJI("shortVideoContext");
                                                            throw null;
                                                        }
                                                    }
                                                    z = true;
                                                    arrayList.add(new I3L(diContainer, z));
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            }
                                            ShortVideoContext shortVideoContext16 = this.LJLIL;
                                            if (shortVideoContext16 != null) {
                                                if (C44256HYm.LJIILIIL(shortVideoContext16) || C44256HYm.LJIIL(shortVideoContext16)) {
                                                    if (this.LJLIL != null) {
                                                        if (!GX0.LIZ() || !C41669GWz.LIZ() || C44258HYo.LIZ()) {
                                                            ShortVideoContext shortVideoContext17 = this.LJLIL;
                                                            if (shortVideoContext17 != null) {
                                                                if (!C44256HYm.LJIIJ(shortVideoContext17)) {
                                                                    ShortVideoContext shortVideoContext18 = this.LJLIL;
                                                                    if (shortVideoContext18 != null) {
                                                                        if (!V16.LJJLIIIJ(shortVideoContext18)) {
                                                                            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                                                                            if (C43119Gw7.LIZ()) {
                                                                                I38 i383 = I38.RECORD_LIGHTENING_QUICK;
                                                                                String LIZIZ2 = C0MT.LIZIZ(i383, activityC45651qj, "activity.getString(this)");
                                                                                String tag2 = i383.getTag();
                                                                                ShortVideoContext shortVideoContext19 = this.LJLIL;
                                                                                if (shortVideoContext19 != null) {
                                                                                    arrayList.add(new C45984I2y(LIZIZ2, tag2, C44256HYm.LIZIZ(shortVideoContext19), diContainer));
                                                                                } else {
                                                                                    o.LJIJI("shortVideoContext");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("shortVideoContext");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else {
                                                                o.LJIJI("shortVideoContext");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("shortVideoContext");
                                                        throw null;
                                                    }
                                                }
                                                ShortVideoContext shortVideoContext20 = this.LJLIL;
                                                if (shortVideoContext20 != null) {
                                                    if (shortVideoContext20.mIsFromDraft && shortVideoContext20.shootMode == 15 && !shortVideoContext20.isPhotoMvMode) {
                                                        arrayList.add(new I3R(C0MT.LIZIZ(I38.RECORD_LIGHTENING_QUICK, activityC45651qj, "activity.getString(this)"), I38.RECORD_LIGHTENING_VIDEO.getTag(), "quick_video", true, diContainer));
                                                    }
                                                    ShortVideoContext shortVideoContext21 = this.LJLIL;
                                                    if (shortVideoContext21 != null) {
                                                        if (C44256HYm.LJII(shortVideoContext21)) {
                                                            arrayList.add(new C46001I3p(C0MT.LIZIZ(I38.RECORD_LIGHTENING_PHOTO, activityC45651qj, "activity.getString(this)"), I38.PHOTO_SHORT.getTag(), "quick_photo", true, diContainer));
                                                        }
                                                        ShortVideoContext shortVideoContext22 = this.LJLIL;
                                                        if (shortVideoContext22 != null) {
                                                            if (C44256HYm.LJIILL(shortVideoContext22)) {
                                                                ShortVideoContext shortVideoContext23 = this.LJLIL;
                                                                if (shortVideoContext23 != null) {
                                                                    if (!C44256HYm.LJI(shortVideoContext23)) {
                                                                        ShortVideoContext shortVideoContext24 = this.LJLIL;
                                                                        if (shortVideoContext24 != null) {
                                                                            if (!C44256HYm.LJIIJ(shortVideoContext24) && !HJD.LIZ()) {
                                                                                ShortVideoContext shortVideoContext25 = this.LJLIL;
                                                                                if (shortVideoContext25 != null) {
                                                                                    arrayList.add(new I31(diContainer, V18.LIZLLL(shortVideoContext25)));
                                                                                } else {
                                                                                    o.LJIJI("shortVideoContext");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("shortVideoContext");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    o.LJIJI("shortVideoContext");
                                                                    throw null;
                                                                }
                                                            }
                                                            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff = DMTBottomTabIntegrationServiceImplDiff.INSTANCE;
                                                            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 704);
                                                            ShortVideoContext shortVideoContext26 = this.LJLIL;
                                                            if (shortVideoContext26 != null) {
                                                                dMTBottomTabIntegrationServiceImplDiff.addLiveModule(diContainer, arrayList, new C45990I3e(aqS157S0100000_7, shortVideoContext26, new AqS157S0100000_7(this, 705), new AqS173S0100000_7(this, 380), new AqS172S0100000_6(this, 125)));
                                                            } else {
                                                                o.LJIJI("shortVideoContext");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("shortVideoContext");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("shortVideoContext");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("shortVideoContext");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("shortVideoContext");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("shortVideoContext");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shortVideoContext");
                            throw null;
                        }
                    } else {
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            } else {
                o.LJIJI("shortVideoContext");
                throw null;
            }
        }
        return arrayList;
    }
}
