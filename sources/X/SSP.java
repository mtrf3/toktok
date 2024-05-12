package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarActionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SSP extends AbstractC65781Prl implements InterfaceC88476Ynw<UIAssem, C43I<? extends SR2>, C43I<? extends SI6>, C43I<? extends java.util.Set<? extends SI6>>, C43I<? extends E33>, C43I<? extends EnumC72128SSm>, C76800UCe> {
    public final /* synthetic */ ProfileAigcChooseAvatarActionAssem LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSP(ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem, View view) {
        super(6);
        this.LJLIL = profileAigcChooseAvatarActionAssem;
        this.LJLILLLLZI = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(UIAssem selectSubscribe, C43I<? extends SR2> c43i, C43I<? extends SI6> c43i2, C43I<? extends java.util.Set<? extends SI6>> c43i3, C43I<? extends E33> c43i4, C43I<? extends EnumC72128SSm> c43i5) {
        String string;
        C116414hZ c116414hZ;
        C116414hZ c116414hZ2;
        C43I<? extends SR2> mode = c43i;
        C43I<? extends SI6> selectedAvatar = c43i2;
        C43I<? extends java.util.Set<? extends SI6>> selectedDownloadItems = c43i3;
        C43I<? extends E33> downloadInfo = c43i4;
        C43I<? extends EnumC72128SSm> saveLoadingState = c43i5;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(selectedAvatar, "selectedAvatar");
        o.LJIIIZ(selectedDownloadItems, "selectedDownloadItems");
        o.LJIIIZ(downloadInfo, "downloadInfo");
        o.LJIIIZ(saveLoadingState, "saveLoadingState");
        T t = mode.LIZ;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        if (t == SR2.AVATAR_CHANGE) {
            int i3 = SSQ.LIZ[((SSR) this.LJLIL.LJLLI.getValue()).ordinal()];
            int i4 = 4;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        View view = this.LJLIL.LJLJJLL;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        View view2 = this.LJLIL.LJLJI;
                        if (view2 != null) {
                            view2.setVisibility(4);
                            View view3 = this.LJLIL.LJLJJLL;
                            if (view3 != null && (c116414hZ2 = (C116414hZ) view3.findViewById(R.id.o1)) != null) {
                                if (saveLoadingState.LIZ != EnumC72128SSm.SHOW) {
                                    i = 8;
                                }
                                c116414hZ2.setVisibility(i);
                            }
                            this.LJLIL.A3();
                        } else {
                            o.LJIJI("singleActionButton");
                            throw null;
                        }
                    }
                } else {
                    View view4 = this.LJLIL.LJLJJLL;
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                    View view5 = this.LJLIL.LJLJI;
                    if (view5 != null) {
                        view5.setVisibility(4);
                        View view6 = this.LJLIL.LJLJJLL;
                        if (view6 != null && (c116414hZ = (C116414hZ) view6.findViewById(R.id.o1)) != null) {
                            if (saveLoadingState.LIZ != EnumC72128SSm.SHOW) {
                                i2 = 8;
                            }
                            c116414hZ.setVisibility(i2);
                        }
                        this.LJLIL.A3();
                    } else {
                        o.LJIJI("singleActionButton");
                        throw null;
                    }
                }
            } else {
                View view7 = this.LJLIL.LJLJJLL;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                TuxTextView tuxTextView = this.LJLIL.LJLJJL;
                if (tuxTextView != null) {
                    tuxTextView.setText(this.LJLILLLLZI.getResources().getString(R.string.cj));
                    C116414hZ c116414hZ3 = this.LJLIL.LJLJJI;
                    if (c116414hZ3 != null) {
                        if (saveLoadingState.LIZ == EnumC72128SSm.SHOW) {
                            i4 = 0;
                        }
                        c116414hZ3.setVisibility(i4);
                        ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem = this.LJLIL;
                        View view8 = profileAigcChooseAvatarActionAssem.LJLJI;
                        if (view8 != null) {
                            TuxTextView tuxTextView2 = profileAigcChooseAvatarActionAssem.LJLJJL;
                            if (tuxTextView2 != null) {
                                if (selectedAvatar.LIZ != 0) {
                                    z2 = true;
                                }
                                profileAigcChooseAvatarActionAssem.x3(view8, tuxTextView2, z2);
                            } else {
                                o.LJIJI("actionButtonText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("singleActionButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("actionButtonSpinner");
                        throw null;
                    }
                } else {
                    o.LJIJI("actionButtonText");
                    throw null;
                }
            }
        } else {
            View view9 = this.LJLIL.LJLJI;
            if (view9 != null) {
                view9.setVisibility(0);
                View view10 = this.LJLIL.LJLJJLL;
                if (view10 != null) {
                    view10.setVisibility(8);
                }
                E33 e33 = (E33) downloadInfo.LIZ;
                SSU ssu = e33.LIZ;
                int i5 = e33.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("state: ");
                LIZ.append(ssu);
                LIZ.append(", count: ");
                LIZ.append(i5);
                C221018lt.LIZ("ProfileAigcChooseAvatarActionAssem", X1D.LIZIZ(LIZ));
                int i6 = SSQ.LIZIZ[ssu.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem2 = this.LJLIL;
                        TuxTextView tuxTextView3 = profileAigcChooseAvatarActionAssem2.LJLJJL;
                        if (tuxTextView3 != null) {
                            int size = ((java.util.Set) selectedDownloadItems.LIZ).size();
                            if (size == 0) {
                                string = tuxTextView3.getResources().getString(R.string.cf);
                            } else {
                                string = tuxTextView3.getResources().getString(R.string.c3, Integer.valueOf(size));
                            }
                            tuxTextView3.setText(string);
                            View view11 = profileAigcChooseAvatarActionAssem2.LJLJI;
                            if (view11 != null) {
                                TuxTextView tuxTextView4 = profileAigcChooseAvatarActionAssem2.LJLJJL;
                                if (tuxTextView4 != null) {
                                    if (size > 0) {
                                        z = true;
                                    }
                                    profileAigcChooseAvatarActionAssem2.x3(view11, tuxTextView4, z);
                                    C116414hZ c116414hZ4 = this.LJLIL.LJLJJI;
                                    if (c116414hZ4 != null) {
                                        c116414hZ4.setVisibility(8);
                                    } else {
                                        o.LJIJI("actionButtonSpinner");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("actionButtonText");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("singleActionButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("actionButtonText");
                            throw null;
                        }
                    }
                } else {
                    TuxTextView tuxTextView5 = this.LJLIL.LJLJJL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(tuxTextView5.getResources().getString(R.string.c5, Integer.valueOf(i5), Integer.valueOf(((SIN) this.LJLIL.v3().getState()).LJLILLLLZI.LIZ.size())));
                        C116414hZ c116414hZ5 = this.LJLIL.LJLJJI;
                        if (c116414hZ5 != null) {
                            c116414hZ5.setVisibility(0);
                        } else {
                            o.LJIJI("actionButtonSpinner");
                            throw null;
                        }
                    } else {
                        o.LJIJI("actionButtonText");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("singleActionButton");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
