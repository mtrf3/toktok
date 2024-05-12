package X;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: X.ZhW, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90626ZhW extends BinderC90358ZdC {
    public AbstractBinderC90626ZhW() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                    } else {
                        C90613ZhJ.LJIIL(((BinderC90870ZlS) this).LJLIL, parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    final String readString = parcel.readString();
                    final C90880Zlc c90880Zlc = ((BinderC90870ZlS) this).LJLIL.LJII;
                    if (c90880Zlc != null) {
                        C67887Qkd c67887Qkd = new C67887Qkd();
                        c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgX
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC67935QlP
                            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                                C90880Zlc c90880Zlc2 = C90880Zlc.this;
                                String str = readString;
                                C67649Qgn<Status> c67649Qgn = (C67649Qgn) obj;
                                c90880Zlc2.LJII();
                                C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                                Parcel LJLJI = c90232ZbA.LJLJI();
                                LJLJI.writeString(str);
                                c90232ZbA.LLZZJLIL(LJLJI, 5);
                                synchronized (c90880Zlc2.LJIJ) {
                                    if (c90880Zlc2.LJIILL != null) {
                                        c67649Qgn.LIZ(C1GE.LIZJ(new Status(2001, null)));
                                    } else {
                                        c90880Zlc2.LJIILL = c67649Qgn;
                                    }
                                }
                            }
                        };
                        c67887Qkd.LIZLLL = 8409;
                        c90880Zlc.LIZLLL(1, c67887Qkd.LIZ());
                    }
                    parcel2.writeNoException();
                }
            } else {
                final String readString2 = parcel.readString();
                final LaunchOptions launchOptions = (LaunchOptions) C90257ZbZ.LIZ(parcel, LaunchOptions.CREATOR);
                final BinderC90870ZlS binderC90870ZlS = (BinderC90870ZlS) this;
                final C90880Zlc c90880Zlc2 = binderC90870ZlS.LJLIL.LJII;
                if (c90880Zlc2 != null) {
                    C67887Qkd c67887Qkd2 = new C67887Qkd();
                    c67887Qkd2.LIZ = new InterfaceC67935QlP() { // from class: X.ZgZ
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC67935QlP
                        public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                            C90880Zlc c90880Zlc3 = C90880Zlc.this;
                            String str = readString2;
                            LaunchOptions launchOptions2 = launchOptions;
                            C67649Qgn<InterfaceC90654Zhy> c67649Qgn = (C67649Qgn) obj;
                            c90880Zlc3.LJII();
                            C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                            Parcel LJLJI = c90232ZbA.LJLJI();
                            LJLJI.writeString(str);
                            C90257ZbZ.LIZIZ(LJLJI, launchOptions2);
                            c90232ZbA.LLZZJLIL(LJLJI, 13);
                            synchronized (c90880Zlc3.LJIIZILJ) {
                                if (c90880Zlc3.LJIILJJIL != null) {
                                    c90880Zlc3.LJIIIZ(2477);
                                }
                                c90880Zlc3.LJIILJJIL = c67649Qgn;
                            }
                        }
                    };
                    c67887Qkd2.LIZLLL = 8406;
                    c90880Zlc2.LIZLLL(1, c67887Qkd2.LIZ()).LIZIZ(new InterfaceC67661Qgz() { // from class: X.ZhO
                        @Override // X.InterfaceC67661Qgz
                        public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                            C90613ZhJ.LJIILIIL(BinderC90870ZlS.this.LJLIL, abstractC67638Qgc);
                        }
                    });
                }
                parcel2.writeNoException();
            }
        } else {
            final String readString3 = parcel.readString();
            final String readString4 = parcel.readString();
            final BinderC90870ZlS binderC90870ZlS2 = (BinderC90870ZlS) this;
            final C90880Zlc c90880Zlc3 = binderC90870ZlS2.LJLIL.LJII;
            if (c90880Zlc3 != null) {
                C67887Qkd c67887Qkd3 = new C67887Qkd();
                c67887Qkd3.LIZ = new InterfaceC67935QlP() { // from class: X.Zga
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC67935QlP
                    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                        C90880Zlc c90880Zlc4 = C90880Zlc.this;
                        String str = readString3;
                        String str2 = readString4;
                        C67649Qgn<InterfaceC90654Zhy> c67649Qgn = (C67649Qgn) obj;
                        c90880Zlc4.LJII();
                        C90232ZbA c90232ZbA = (C90232ZbA) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
                        Parcel LJLJI = c90232ZbA.LJLJI();
                        LJLJI.writeString(str);
                        LJLJI.writeString(str2);
                        C90257ZbZ.LIZIZ(LJLJI, null);
                        c90232ZbA.LLZZJLIL(LJLJI, 14);
                        synchronized (c90880Zlc4.LJIIZILJ) {
                            if (c90880Zlc4.LJIILJJIL != null) {
                                c90880Zlc4.LJIIIZ(2477);
                            }
                            c90880Zlc4.LJIILJJIL = c67649Qgn;
                        }
                    }
                };
                c67887Qkd3.LIZLLL = 8407;
                c90880Zlc3.LIZLLL(1, c67887Qkd3.LIZ()).LIZIZ(new InterfaceC67661Qgz() { // from class: X.ZhN
                    @Override // X.InterfaceC67661Qgz
                    public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                        C90613ZhJ.LJIILIIL(BinderC90870ZlS.this.LJLIL, abstractC67638Qgc);
                    }
                });
            }
            parcel2.writeNoException();
        }
        return true;
    }
}
