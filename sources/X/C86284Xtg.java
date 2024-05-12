package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.BackPressConfig;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;
import com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar;
import com.bytedance.sdk.xbridge.runtime.depend.PopupConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xtg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86284Xtg extends AbstractC86285Xth {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        IHostStyleUIDepend iHostStyleUIDepend;
        InterfaceC78559UsN interfaceC78559UsN;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        Number number;
        Number number2;
        Number number3;
        Number number4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Window window;
        C86289Xtl c86289Xtl;
        C86289Xtl c86289Xtl2;
        InterfaceC86286Xti interfaceC86286Xti = (InterfaceC86286Xti) xBaseParamModel;
        o.LJIIJ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 == null || (c86289Xtl2 = (C86289Xtl) interfaceC38263Ezz2.LJ(C86289Xtl.class)) == null || (iHostStyleUIDepend = c86289Xtl2.LIZIZ) == null) {
            C86289Xtl c86289Xtl3 = C86289Xtl.LJFF;
            if (c86289Xtl3 != null) {
                iHostStyleUIDepend = c86289Xtl3.LIZIZ;
            } else {
                iHostStyleUIDepend = null;
            }
        }
        InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
        if (interfaceC38263Ezz3 == null || (c86289Xtl = (C86289Xtl) interfaceC38263Ezz3.LJ(C86289Xtl.class)) == null || (interfaceC78559UsN = c86289Xtl.LIZJ) == null) {
            C86289Xtl c86289Xtl4 = C86289Xtl.LJFF;
            if (c86289Xtl4 != null) {
                interfaceC78559UsN = c86289Xtl4.LIZJ;
            } else {
                interfaceC78559UsN = null;
            }
        }
        if (context != null) {
            Activity LIZ = C37925EuX.LIZ(context);
            InterfaceC86287Xtj pageUI = interfaceC86286Xti.getPageUI();
            if (pageUI != null) {
                str = pageUI.getTitle();
            } else {
                str = null;
            }
            InterfaceC86287Xtj pageUI2 = interfaceC86286Xti.getPageUI();
            if (pageUI2 != null) {
                str2 = pageUI2.getTitleColor();
            } else {
                str2 = null;
            }
            InterfaceC86287Xtj pageUI3 = interfaceC86286Xti.getPageUI();
            if (pageUI3 != null) {
                bool = pageUI3.getHideNavBar();
            } else {
                bool = null;
            }
            InterfaceC86287Xtj pageUI4 = interfaceC86286Xti.getPageUI();
            if (pageUI4 != null) {
                str3 = pageUI4.getNavBarColor();
            } else {
                str3 = null;
            }
            InterfaceC86287Xtj pageUI5 = interfaceC86286Xti.getPageUI();
            if (pageUI5 != null) {
                str4 = pageUI5.getStatusBarBgColor();
            } else {
                str4 = null;
            }
            InterfaceC86287Xtj pageUI6 = interfaceC86286Xti.getPageUI();
            if (pageUI6 != null) {
                str5 = pageUI6.getStatusFontMode();
            } else {
                str5 = null;
            }
            OCN pageInteraction = interfaceC86286Xti.getPageInteraction();
            if (pageInteraction != null) {
                str6 = pageInteraction.getNavBtnType();
            } else {
                str6 = null;
            }
            OCN pageInteraction2 = interfaceC86286Xti.getPageInteraction();
            if (pageInteraction2 != null) {
                number = pageInteraction2.getDisableNavBarBackButton();
            } else {
                number = null;
            }
            InterfaceC86288Xtk popupInteraction = interfaceC86286Xti.getPopupInteraction();
            if (popupInteraction != null) {
                number2 = popupInteraction.getDisableMaskClickClose();
            } else {
                number2 = null;
            }
            InterfaceC86288Xtk popupInteraction2 = interfaceC86286Xti.getPopupInteraction();
            if (popupInteraction2 != null) {
                number3 = popupInteraction2.getEnablePullDownClose();
            } else {
                number3 = null;
            }
            OCO commonInteraction = interfaceC86286Xti.getCommonInteraction();
            if (commonInteraction != null) {
                number4 = commonInteraction.getDisableBackPress();
            } else {
                number4 = null;
            }
            if (str5 != null) {
                if (LIZ != null) {
                    window = LIZ.getWindow();
                } else {
                    window = null;
                }
                boolean LJ = o.LJ("dark", str5);
                if (LIZ != null && window != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23) {
                            View decorView = window.getDecorView();
                            o.LJFF(decorView, "window.decorView");
                            int systemUiVisibility = decorView.getSystemUiVisibility();
                            if (!LJ) {
                                decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                            } else {
                                decorView.setSystemUiVisibility(systemUiVisibility | FileUtils.BUFFER_SIZE);
                            }
                            window.clearFlags(67108864);
                            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (LIZ != null && str4 != null && str4.length() != 0) {
                int parseColor = ColorProtector.parseColor(EWX.LIZIZ(str4));
                LIZ.getWindow().addFlags(67108864);
                View view = new View(LIZ);
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, LIZ.getResources().getDimensionPixelSize(LIZ.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
                view.setBackgroundColor(parseColor);
                Window window2 = LIZ.getWindow();
                o.LJFF(window2, "activity.window");
                View decorView2 = window2.getDecorView();
                if (decorView2 != null) {
                    ((ViewGroup) decorView2).addView(view);
                    View findViewById = LIZ.findViewById(R.id.bst);
                    if (!(findViewById instanceof ViewGroup)) {
                        findViewById = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    if (viewGroup != null) {
                        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                        if (!(childAt instanceof ViewGroup)) {
                            childAt = null;
                        }
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2 != null) {
                            viewGroup2.setFitsSystemWindows(true);
                            viewGroup2.setClipToPadding(true);
                        }
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            if (iHostStyleUIDepend != null) {
                InterfaceC38263Ezz interfaceC38263Ezz4 = this.LJLIL;
                String LIZIZ = EWX.LIZIZ(str2);
                String LIZIZ2 = EWX.LIZIZ(str3);
                if (number != null) {
                    num4 = Integer.valueOf(number.intValue());
                } else {
                    num4 = null;
                }
                iHostStyleUIDepend.setPageNaviStyle(interfaceC38263Ezz4, LIZ, new PageTitleBar(str, LIZIZ, LIZIZ2, num4, str6, bool));
            }
            if (interfaceC78559UsN != null) {
                InterfaceC38263Ezz interfaceC38263Ezz5 = this.LJLIL;
                if (number2 != null) {
                    num = Integer.valueOf(number2.intValue());
                } else {
                    num = null;
                }
                if (number3 != null) {
                    num2 = Integer.valueOf(number3.intValue());
                } else {
                    num2 = null;
                }
                interfaceC78559UsN.LIZ(interfaceC38263Ezz5, new PopupConfig(num, num2));
                InterfaceC38263Ezz interfaceC38263Ezz6 = this.LJLIL;
                if (number4 != null) {
                    num3 = Integer.valueOf(number4.intValue());
                } else {
                    num3 = null;
                }
                interfaceC78559UsN.LIZIZ(interfaceC38263Ezz6, new BackPressConfig(num3));
            }
            c37356ElM.onSuccess((XBaseResultModel) C17N.LJIILJJIL(C65352Pkq.LIZ(InterfaceC86294Xtq.class)), "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
    }
}
