package com.bytedance.android.live.walletnew.ui;

import X.C025908h;
import X.C04520Fs;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import X.C40517FvF;
import X.C41081jM;
import X.C47261Igj;
import X.C65307Pk7;
import X.C77756UfQ;
import X.C77758UfS;
import X.C77759UfT;
import X.C780334l;
import X.C81212Vu4;
import X.DialogInterfaceOnKeyListenerC77760UfU;
import X.InterfaceC77761UfV;
import X.InterfaceC77762UfW;
import X.UHH;
import X.X1D;
import X.XKX;
import Y.ACListenerS33S0100000_13;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.wallet.LocationHostSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LocationKeySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.b1;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LocationList extends LiveDialogFragment {
    public Context LJLIL;
    public View LJLILLLLZI;
    public String LJLJI;
    public InterfaceC77761UfV LJLJJI;
    public InterfaceC77762UfW LJLJJL;
    public RecyclerView LJLJJLL;
    public UHH LJLJL;
    public List<LocationObject> LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLILLLL;
    public C2A7 LJLLJ;
    public LocationObject LJLLLL;
    public List<String> LJLLLLLL;
    public LocationObject[] LJLZ;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public int LJLLI = 1;
    public String LJLLL = "";
    public String LJZ = "Invalid Status";
    public final C77758UfS LJZI = new C77758UfS(this);
    public final C77756UfQ LJZL = new C77756UfQ(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void LJII() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.findViewById(R.id.g9n).setVisibility(8);
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                view2.findViewById(R.id.g9o).setVisibility(0);
                return;
            } else {
                o.LJIJI("uiView");
                throw null;
            }
        }
        o.LJIJI("uiView");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.da4);
        c28507BGt.LIZLLL = true;
        c28507BGt.LJII = 80;
        if (mo49getActivity() != null) {
            c28507BGt.LJIIIZ = -1;
            c28507BGt.LJIIJ = C15380j0.LIZ(694.0f);
        }
        return c28507BGt;
    }

    public final String vl() {
        String str;
        String str2 = null;
        if (this.LJLZ != null) {
            int i = new C40517FvF(0, r0.length - 1).LJLILLLLZI;
            int i2 = 1;
            String str3 = "";
            if (1 <= i) {
                while (true) {
                    LocationObject[] locationObjectArr = this.LJLZ;
                    if (locationObjectArr != null) {
                        if (locationObjectArr[i2] == null) {
                            break;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LocationObject[] locationObjectArr2 = this.LJLZ;
                        if (locationObjectArr2 != null) {
                            LocationObject locationObject = locationObjectArr2[i2];
                            if (locationObject != null) {
                                str = locationObject.L();
                            } else {
                                str = null;
                            }
                            str3 = C025908h.LIZIZ(LIZ, str, ", ", str3, LIZ);
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        } else {
                            o.LJIJI("locationName");
                            throw null;
                        }
                    } else {
                        o.LJIJI("locationName");
                        throw null;
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str3);
            LocationObject[] locationObjectArr3 = this.LJLZ;
            if (locationObjectArr3 != null) {
                LocationObject locationObject2 = locationObjectArr3[0];
                if (locationObject2 != null) {
                    str2 = locationObject2.name;
                }
                LIZ2.append(str2);
                return X1D.LIZIZ(LIZ2);
            }
            o.LJIJI("locationName");
            throw null;
        }
        o.LJIJI("locationName");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC77760UfU(this));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.LJLLI != 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            if (this.LJLLI == 0) {
                LocationObject[] locationObjectArr = this.LJLZ;
                if (locationObjectArr != null) {
                    int length = locationObjectArr.length;
                    List<String> list = this.LJLLLLLL;
                    if (list != null) {
                        if (length != list.size()) {
                            this.LJLLI = 1;
                        } else {
                            LocationObject[] locationObjectArr2 = this.LJLZ;
                            if (locationObjectArr2 != null) {
                                int length2 = locationObjectArr2.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length2) {
                                        break;
                                    }
                                    LocationObject[] locationObjectArr3 = this.LJLZ;
                                    if (locationObjectArr3 != null) {
                                        LocationObject locationObject = locationObjectArr3[i];
                                        if (locationObject == null) {
                                            this.LJLLI = 1;
                                            break;
                                        }
                                        List<String> list2 = this.LJLLLLLL;
                                        if (list2 != null) {
                                            linkedHashMap.put(ListProtector.get(list2, i), locationObject);
                                            i++;
                                        } else {
                                            o.LJIJI("locationKey");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("locationName");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("locationName");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("locationKey");
                        throw null;
                    }
                } else {
                    o.LJIJI("locationName");
                    throw null;
                }
            }
            InterfaceC77761UfV interfaceC77761UfV = this.LJLJJI;
            if (interfaceC77761UfV != null) {
                if (this.LJLLI == 0) {
                    z = true;
                }
                interfaceC77761UfV.LJIILLIIL(z, new LocationAddress(linkedHashMap));
                return;
            }
            o.LJIJI("onCompleteListener");
            throw null;
        }
        InterfaceC77761UfV interfaceC77761UfV2 = this.LJLJJI;
        if (interfaceC77761UfV2 != null) {
            interfaceC77761UfV2.LJIILL(this.LJZ);
        } else {
            o.LJIJI("onCompleteListener");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = view;
        if (o.LJ(C04520Fs.LIZIZ(), "ar")) {
            this.LJLLILLLL = 1;
        }
        String str = this.LJLJI;
        if (str != null) {
            LocationService.LJLIL.getClass();
            if (ujb.o.LJJJJIZL(str, "CA", false)) {
                num = 6251999;
            } else {
                num = null;
            }
            xl(num, str);
            LJII();
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                View findViewById = view2.findViewById(R.id.g9l);
                o.LJIIIIZZ(findViewById, "uiView.findViewById(R.id.location_confirm_btn)");
                this.LJLLJ = (C2A7) findViewById;
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    View findViewById2 = view3.findViewById(R.id.g9m);
                    o.LJIIIIZZ(findViewById2, "uiView.findViewById(R.id.location_left_return)");
                    C41081jM c41081jM = (C41081jM) findViewById2;
                    View view4 = this.LJLILLLLZI;
                    if (view4 != null) {
                        View findViewById3 = view4.findViewById(R.id.g9k);
                        o.LJIIIIZZ(findViewById3, "uiView.findViewById(R.id.location_close_btn)");
                        TuxIconView tuxIconView = (TuxIconView) findViewById3;
                        View view5 = this.LJLILLLLZI;
                        if (view5 != null) {
                            View findViewById4 = view5.findViewById(R.id.g9p);
                            o.LJIIIIZZ(findViewById4, "uiView.findViewById(R.id.location_side_bar)");
                            C81212Vu4 c81212Vu4 = (C81212Vu4) findViewById4;
                            C2A7 c2a7 = this.LJLLJ;
                            if (c2a7 != null) {
                                C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 4));
                                C16880lQ.LJJJ(tuxIconView, new ACListenerS33S0100000_13(this, 5));
                                C16880lQ.LJJIIZI(c41081jM, new ACListenerS33S0100000_13(this, 6));
                                c81212Vu4.setOnSelectIndexItemListener(new C77759UfT(this));
                                return;
                            }
                            o.LJIJI("confirmbtn");
                            throw null;
                        }
                        o.LJIJI("uiView");
                        throw null;
                    }
                    o.LJIJI("uiView");
                    throw null;
                }
                o.LJIJI("uiView");
                throw null;
            }
            o.LJIJI("uiView");
            throw null;
        }
        o.LJIJI("regionTag");
        throw null;
    }

    public final void wl(int i, int i2) {
        LocationObject locationObject;
        List<LocationObject> list;
        List<LocationObject> list2;
        boolean z;
        int intValue;
        Integer num;
        InterfaceC77762UfW interfaceC77762UfW;
        int i3 = i + i2;
        if (i3 < 1 || i3 > this.LJLJLLL) {
            return;
        }
        int i4 = i3 - 1;
        LocationObject[] locationObjectArr = this.LJLZ;
        if (locationObjectArr != null) {
            int length = locationObjectArr.length;
            for (int i5 = i4 + 1; i5 < length; i5++) {
                LocationObject[] locationObjectArr2 = this.LJLZ;
                if (locationObjectArr2 != null) {
                    locationObjectArr2[i5] = null;
                } else {
                    o.LJIJI("locationName");
                    throw null;
                }
            }
            if (i2 == -1) {
                LocationObject locationObject2 = this.LJLLLL;
                if (locationObject2 != null) {
                    locationObject = locationObject2.LJLIL;
                } else {
                    locationObject = null;
                }
            } else {
                LocationObject[] locationObjectArr3 = this.LJLZ;
                if (locationObjectArr3 != null) {
                    locationObject = locationObjectArr3[i4];
                } else {
                    o.LJIJI("locationName");
                    throw null;
                }
            }
            this.LJLLLL = locationObject;
            if (locationObject != null) {
                list = locationObject.subRegion;
            } else {
                list = null;
            }
            if (list != null && (interfaceC77762UfW = this.LJLJJL) != null) {
                List<String> list3 = this.LJLLLLLL;
                if (list3 != null) {
                    interfaceC77762UfW.LIZIZ((String) ListProtector.get(list3, i3));
                } else {
                    o.LJIJI("locationKey");
                    throw null;
                }
            }
            LocationObject[] locationObjectArr4 = this.LJLZ;
            if (locationObjectArr4 != null) {
                if (locationObjectArr4[i4] != null) {
                    LocationObject locationObject3 = this.LJLLLL;
                    if (locationObject3 != null) {
                        list2 = locationObject3.subRegion;
                    } else {
                        list2 = null;
                    }
                    this.LJLJLJ = list2;
                    if (list2 == null) {
                        if (locationObject3 != null) {
                            num = Integer.valueOf(locationObject3.geonameId);
                        } else {
                            num = null;
                        }
                        xl(num, null);
                        return;
                    }
                    if (list2.size() > 30) {
                        z = true;
                    } else {
                        z = false;
                    }
                    View view = this.LJLILLLLZI;
                    if (view != null) {
                        View findViewById = view.findViewById(R.id.g9r);
                        o.LJIIIIZZ(findViewById, "bottomSheet.findViewById(R.id.location_title)");
                        TextView textView = (TextView) findViewById;
                        View findViewById2 = view.findViewById(R.id.g9p);
                        o.LJIIIIZZ(findViewById2, "bottomSheet.findViewById(R.id.location_side_bar)");
                        C81212Vu4 c81212Vu4 = (C81212Vu4) findViewById2;
                        View view2 = this.LJLILLLLZI;
                        if (view2 != null) {
                            View findViewById3 = view2.findViewById(R.id.g9m);
                            o.LJIIIIZZ(findViewById3, "uiView.findViewById(R.id.location_left_return)");
                            ImageView imageView = (ImageView) findViewById3;
                            View view3 = this.LJLILLLLZI;
                            if (view3 != null) {
                                View findViewById4 = view3.findViewById(R.id.g9k);
                                o.LJIIIIZZ(findViewById4, "uiView.findViewById(R.id.location_close_btn)");
                                ImageView imageView2 = (ImageView) findViewById4;
                                if (this.LJLLJ == null) {
                                    View view4 = this.LJLILLLLZI;
                                    if (view4 != null) {
                                        View findViewById5 = view4.findViewById(R.id.g9l);
                                        o.LJIIIIZZ(findViewById5, "uiView.findViewById(R.id.location_confirm_btn)");
                                        this.LJLLJ = (C2A7) findViewById5;
                                    } else {
                                        o.LJIJI("uiView");
                                        throw null;
                                    }
                                }
                                String str = this.LJLJI;
                                if (str != null) {
                                    if (o.LJ(str, "CA")) {
                                        intValue = ((Number) ListProtector.get(C47261Igj.LJJIJ(Integer.valueOf(R.string.o1a)), i4)).intValue();
                                    } else {
                                        intValue = ((Number) ListProtector.get(C47261Igj.LJJIJIIJI(Integer.valueOf(R.string.o1c), Integer.valueOf(R.string.o17), Integer.valueOf(R.string.o16)), i4)).intValue();
                                    }
                                    textView.setText(C15380j0.LJIILJJIL(intValue));
                                    if (i3 == 1) {
                                        imageView.setVisibility(8);
                                        imageView2.setVisibility(0);
                                    } else {
                                        imageView.setVisibility(0);
                                        imageView2.setVisibility(8);
                                    }
                                    if (i3 == this.LJLJLLL) {
                                        C2A7 c2a7 = this.LJLLJ;
                                        if (c2a7 != null) {
                                            c2a7.setVisibility(0);
                                            C2A7 c2a72 = this.LJLLJ;
                                            if (c2a72 != null) {
                                                c2a72.LJJLL(R.style.a2z);
                                                C2A7 c2a73 = this.LJLLJ;
                                                if (c2a73 != null) {
                                                    c2a73.setEnabled(false);
                                                } else {
                                                    o.LJIJI("confirmbtn");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("confirmbtn");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("confirmbtn");
                                            throw null;
                                        }
                                    } else {
                                        C2A7 c2a74 = this.LJLLJ;
                                        if (c2a74 != null) {
                                            c2a74.setVisibility(8);
                                        } else {
                                            o.LJIJI("confirmbtn");
                                            throw null;
                                        }
                                    }
                                    if (z) {
                                        c81212Vu4.setVisibility(0);
                                    } else {
                                        c81212Vu4.setVisibility(8);
                                    }
                                    if (this.LJLLILLLL == 1) {
                                        c81212Vu4.setSideBarPosition(1);
                                    }
                                    if (this.LJLJJLL == null) {
                                        View view5 = this.LJLILLLLZI;
                                        if (view5 != null) {
                                            RecyclerView recyclerView = (RecyclerView) view5.findViewById(R.id.g9n);
                                            this.LJLJJLL = recyclerView;
                                            if (recyclerView != null) {
                                                if (this.LJLIL != null) {
                                                    recyclerView.setLayoutManager(new LinearLayoutManager());
                                                } else {
                                                    o.LJIJI("uiContext");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("uiView");
                                            throw null;
                                        }
                                    }
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("defaultLocation: ");
                                    LIZ.append(this.LJLLL);
                                    C0NB.LIZIZ("USLocation", X1D.LIZIZ(LIZ));
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("defaultLocationKey ");
                                    List<String> list4 = this.LJLLLLLL;
                                    if (list4 != null) {
                                        LIZ2.append((String) ListProtector.get(list4, this.LJLJLLL));
                                        C0NB.LIZIZ("USLocation", X1D.LIZIZ(LIZ2));
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("Current Location ");
                                        LIZ3.append(vl());
                                        C0NB.LIZIZ("USLocation", X1D.LIZIZ(LIZ3));
                                        UHH uhh = new UHH(list2, i3, this.LJLJLLL, z, this.LJLLL, vl());
                                        this.LJLJL = uhh;
                                        C77758UfS listener = this.LJZI;
                                        o.LJIIIZ(listener, "listener");
                                        uhh.LJLJLLL = listener;
                                        RecyclerView recyclerView2 = this.LJLJJLL;
                                        if (recyclerView2 != null) {
                                            UHH uhh2 = this.LJLJL;
                                            if (uhh2 != null) {
                                                recyclerView2.setAdapter(uhh2);
                                            } else {
                                                o.LJIJI("locationAdapter");
                                                throw null;
                                            }
                                        }
                                        this.LJLL = i3;
                                        return;
                                    }
                                    o.LJIJI("locationKey");
                                    throw null;
                                }
                                o.LJIJI("regionTag");
                                throw null;
                            }
                            o.LJIJI("uiView");
                            throw null;
                        }
                        o.LJIJI("uiView");
                        throw null;
                    }
                    o.LJIJI("uiView");
                    throw null;
                }
                return;
            }
            o.LJIJI("locationName");
            throw null;
        }
        o.LJIJI("locationName");
        throw null;
    }

    public final void xl(Integer num, String str) {
        URL url;
        LocationService.LJLIL.getClass();
        String value = LocationHostSetting.INSTANCE.getValue();
        if (o.LJ(value, "")) {
            url = null;
        } else {
            StringBuilder LIZJ = b1.LIZJ(value, "/administrative/district?key=");
            LIZJ.append(LocationKeySetting.INSTANCE.getValue());
            String LIZIZ = X1D.LIZIZ(LIZJ);
            if (num != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZIZ);
                LIZ.append("&geonameid=");
                LIZ.append(num);
                LIZIZ = X1D.LIZIZ(LIZ);
            } else if (str != null) {
                LIZIZ = a1.LJ(LIZIZ, "&code=", str);
            }
            url = new URL(LIZIZ);
        }
        LJII();
        if (url != null) {
            C77756UfQ locationFetchListener = this.LJZL;
            o.LJIIIZ(locationFetchListener, "locationFetchListener");
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C65307Pk7(url, locationFetchListener, null), 3);
        } else {
            this.LJZ = "Location URL Fetch Failure";
            this.LJLLI = 2;
            dismiss();
        }
    }
}
