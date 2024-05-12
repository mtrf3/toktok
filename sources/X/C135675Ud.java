package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135675Ud implements C5HN {
    public C135695Uf LJLIL;
    public final C135845Uu LJLILLLLZI;
    public final C135785Uo LJLJI;
    public final C135755Ul LJLJJI;
    public final C135715Uh LJLJJL;
    public final C135825Us LJLJJLL;
    public final C135685Ue LJLJL;
    public boolean LJLJLJ;
    public FrameLayout LJLJLLL;
    public InterfaceC132925Jo LJLL;
    public PreviewPanelViewModel LJLLI;
    public OSZ<Long, Long> LJLLILLLL;
    public C5PT LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    @Override // X.C5HN
    public final void LIZIZ(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
    }

    @Override // X.C5HN
    public final void LIZJ() {
        this.LJLLL = false;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
        if (previewPanelViewModel != null) {
            previewPanelViewModel.lv0();
        }
    }

    public C135675Ud(C135695Uf c135695Uf) {
        this.LJLIL = c135695Uf;
        C135845Uu c135845Uu = new C135845Uu();
        this.LJLILLLLZI = c135845Uu;
        C135785Uo c135785Uo = new C135785Uo();
        this.LJLJI = c135785Uo;
        C135755Ul c135755Ul = new C135755Ul();
        this.LJLJJI = c135755Ul;
        C135715Uh c135715Uh = new C135715Uh();
        this.LJLJJL = c135715Uh;
        C135825Us c135825Us = new C135825Us();
        this.LJLJJLL = c135825Us;
        C135685Ue c135685Ue = new C135685Ue();
        this.LJLJL = c135685Ue;
        C135695Uf config = this.LJLIL;
        o.LJIIIZ(config, "config");
        this.LJLIL = config;
        c135715Uh.LIZIZ = config.LIZ;
        c135825Us.LIZIZ = config.LIZIZ;
        c135685Ue.LIZ = config.LIZJ;
        c135845Uu.LIZ().setColor(config.LJIIIZ);
        c135845Uu.LIZ().setStrokeWidth(config.LJIIJ);
        c135785Uo.LIZ().setColor(config.LJI);
        c135785Uo.LIZ().setStrokeWidth(config.LJII);
        c135785Uo.LIZIZ = config.LJIIIIZZ;
        c135755Ul.LIZ = config.LIZLLL;
        ((Paint) c135755Ul.LIZJ.getValue()).setColor(config.LJ);
        float f = config.LJFF;
        if (f < 0.0f) {
            return;
        }
        c135755Ul.LIZIZ = f;
        ((Paint) c135755Ul.LIZJ.getValue()).setStrokeWidth(f);
    }

    @Override // X.C5HN
    public final void LIZ(Canvas canvas) {
        FrameLayout frameLayout;
        PreviewPanelViewModel previewPanelViewModel;
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(canvas, "canvas");
        boolean z4 = false;
        if (!this.LJLJLJ || !this.LJLLL) {
            Paint paint = new Paint();
            paint.setColor(0);
            canvas.drawPoint(0.0f, 0.0f, paint);
            return;
        }
        C135755Ul c135755Ul = this.LJLJJI;
        C5PT c5pt = this.LJLLJ;
        c135755Ul.getClass();
        if (c135755Ul.LIZ && c5pt != null) {
            canvas.save();
            canvas.rotate(c5pt.LJLJJL, c5pt.LJLJI, c5pt.LJLJJI);
            float LIZ = (c5pt.LJLJI - (c5pt.LJLIL / 2.0f)) - AnonymousClass564.LIZ(1.0f);
            float LIZ2 = (c5pt.LJLJJI - (c5pt.LJLILLLLZI / 2.0f)) - AnonymousClass564.LIZ(1.0f);
            float LIZ3 = AnonymousClass564.LIZ(1.0f) + (c5pt.LJLIL / 2.0f) + c5pt.LJLJI;
            float LIZ4 = AnonymousClass564.LIZ(1.0f) + (c5pt.LJLILLLLZI / 2.0f) + c5pt.LJLJJI;
            float f = c135755Ul.LIZIZ;
            canvas.drawRoundRect(new RectF(LIZ + f, LIZ2 + f, LIZ3 - f, LIZ4 - f), 0.0f, 0.0f, (Paint) c135755Ul.LIZJ.getValue());
            canvas.restore();
        }
        if (!this.LJLLLL && (frameLayout = this.LJLJLLL) != null && (previewPanelViewModel = this.LJLLI) != null) {
            OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(frameLayout);
            C135785Uo c135785Uo = this.LJLJI;
            EnumC135725Ui transState = this.LJLJJL.LIZ;
            c135785Uo.getClass();
            o.LJIIIZ(transState, "transState");
            EnumC135725Ui enumC135725Ui = EnumC135725Ui.ALL;
            if (transState == enumC135725Ui || transState == EnumC135725Ui.X) {
                float measuredWidth = frameLayout.getMeasuredWidth() / 2.0f;
                canvas.drawLine(measuredWidth, 0.0f, measuredWidth, c135785Uo.LIZIZ, c135785Uo.LIZ());
                float measuredHeight = frameLayout.getMeasuredHeight();
                canvas.drawLine(measuredWidth, measuredHeight - c135785Uo.LIZIZ, measuredWidth, measuredHeight, c135785Uo.LIZ());
            }
            if (transState == enumC135725Ui || transState == EnumC135725Ui.Y) {
                float measuredHeight2 = frameLayout.getMeasuredHeight() / 2.0f;
                canvas.drawLine(0.0f, measuredHeight2, c135785Uo.LIZIZ, measuredHeight2, c135785Uo.LIZ());
                float measuredWidth2 = frameLayout.getMeasuredWidth();
                canvas.drawLine(measuredWidth2 - c135785Uo.LIZIZ, measuredHeight2, measuredWidth2, measuredHeight2, c135785Uo.LIZ());
            }
            C135845Uu c135845Uu = this.LJLILLLLZI;
            float floatValue = jv0.getFirst().floatValue();
            float floatValue2 = jv0.getSecond().floatValue();
            if ((this.LJLJL.LIZIZ & EnumC135745Uk.TO_LEFT.getValue()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((this.LJLJL.LIZIZ & EnumC135745Uk.TO_RIGHT.getValue()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((this.LJLJL.LIZIZ & EnumC135745Uk.TO_TOP.getValue()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((this.LJLJL.LIZIZ & EnumC135745Uk.TO_BOTTOM.getValue()) != 0) {
                z4 = true;
            }
            c135845Uu.getClass();
            if (!z && !z2 && !z3 && !z4) {
                return;
            }
            float f2 = 2;
            float measuredWidth3 = (frameLayout.getMeasuredWidth() - floatValue) / f2;
            float f3 = measuredWidth3 + floatValue;
            float measuredHeight3 = (frameLayout.getMeasuredHeight() - floatValue2) / f2;
            float f4 = measuredHeight3 + floatValue2;
            if (z) {
                canvas.drawLine(measuredWidth3, measuredHeight3, measuredWidth3, f4, c135845Uu.LIZ());
            }
            if (z2) {
                canvas.drawLine(f3, measuredHeight3, f3, f4, c135845Uu.LIZ());
            }
            if (z3) {
                canvas.drawLine(measuredWidth3, (c135845Uu.LIZ().getStrokeWidth() / f2) + measuredHeight3, f3, (c135845Uu.LIZ().getStrokeWidth() / f2) + measuredHeight3, c135845Uu.LIZ());
            }
            if (!z4) {
                return;
            }
            canvas.drawLine(measuredWidth3, f4 - (c135845Uu.LIZ().getStrokeWidth() / f2), f3, f4 - (c135845Uu.LIZ().getStrokeWidth() / f2), c135845Uu.LIZ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5HN
    public final void LIZLLL(long j) {
        boolean z;
        MutableLiveData mutableLiveData;
        Long l;
        OSZ<Long, Long> osz = this.LJLLILLLL;
        if (osz != null) {
            UIW uiw = new UIW(osz.getFirst().longValue(), osz.getSecond().longValue());
            PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
            if (previewPanelViewModel != null && (mutableLiveData = previewPanelViewModel.LJLJI) != null && (l = (Long) mutableLiveData.getValue()) != null && uiw.LJIIIZ(l.longValue())) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.LJLLL) {
                this.LJLLL = z;
                PreviewPanelViewModel previewPanelViewModel2 = this.LJLLI;
                if (previewPanelViewModel2 != null) {
                    previewPanelViewModel2.lv0();
                }
            }
        }
    }

    @Override // X.C5HO
    public final boolean LJJJJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return false;
    }

    @Override // X.C5HN
    public final void LJIILIIL(FrameLayout frameLayout, InterfaceC132925Jo material) {
        o.LJIIIZ(material, "material");
        this.LJLJLJ = false;
        this.LJLJLLL = null;
        this.LJLLL = false;
        this.LJLLILLLL = null;
        this.LJLLJ = null;
        PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
        if (previewPanelViewModel != null) {
            previewPanelViewModel.lv0();
        }
    }

    @Override // X.C5HN
    public final void LJFF(ActivityC45651qj activityC45651qj, FrameLayout frameLayout, InterfaceC132925Jo material) {
        o.LJIIIZ(material, "material");
        this.LJLLI = (PreviewPanelViewModel) C5G0.LIZ(PreviewPanelViewModel.class);
        this.LJLJLJ = true;
        this.LJLJLLL = frameLayout;
        this.LJLL = material;
    }

    @Override // X.C5HO
    public final boolean LJIILLIIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C5HO
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        FrameLayout frameLayout;
        int i2;
        NLEModel nLEModel;
        this.LJLLLL = false;
        if (i == 0 || (frameLayout = this.LJLJLLL) == null) {
            return true;
        }
        C135825Us c135825Us = this.LJLJJLL;
        int rotation = (int) nLETrackSlot.getRotation();
        c135825Us.getClass();
        if (c135825Us.LIZIZ) {
            int i3 = rotation + i;
            EnumC135765Um enumC135765Um = c135825Us.LIZ;
            int i4 = i3 % 90;
            if (Math.abs(i4) < 5) {
                EnumC135765Um enumC135765Um2 = c135825Us.LIZ;
                EnumC135765Um enumC135765Um3 = EnumC135765Um.NONE;
                if (enumC135765Um2 != enumC135765Um3) {
                    c135825Us.LIZJ += i;
                }
                if (enumC135765Um2 == enumC135765Um3 || Math.abs(c135825Us.LIZJ) < 5) {
                    c135825Us.LIZ = EnumC135765Um.ADSORBED;
                    i3 = (i3 / 90) * 90;
                }
            } else if (Math.abs(i4) > 85) {
                EnumC135765Um enumC135765Um4 = c135825Us.LIZ;
                EnumC135765Um enumC135765Um5 = EnumC135765Um.NONE;
                if (enumC135765Um4 != enumC135765Um5) {
                    c135825Us.LIZJ += i;
                }
                if (enumC135765Um4 == enumC135765Um5 || Math.abs(c135825Us.LIZJ) < 5) {
                    c135825Us.LIZ = EnumC135765Um.ADSORBED;
                    int i5 = i3 / 90;
                    if (i3 < 0) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    i3 = (i5 + i2) * 90;
                }
            } else {
                c135825Us.LIZJ = 0;
                c135825Us.LIZ = EnumC135765Um.NONE;
            }
            if (enumC135765Um != c135825Us.LIZ) {
                frameLayout.invalidate();
            }
            if (enumC135765Um.getValue() < c135825Us.LIZ.getValue()) {
                ((InterfaceC1283852c) c135825Us.LIZLLL.getValue()).LIZ(frameLayout, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
            }
            i = i3 - rotation;
            if (i == 0) {
                return true;
            }
        }
        PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
        if (previewPanelViewModel != null) {
            C135695Uf c135695Uf = this.LJLIL;
            EnumC132905Jm commitNleModel = c135695Uf.LJIIJJI;
            boolean z = c135695Uf.LJIIL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c135695Uf.LJIILIIL;
            o.LJIIIZ(commitNleModel, "commitNleModel");
            NLEEditor nLEEditor = previewPanelViewModel.LJLZ;
            if (nLEEditor != null) {
                nLETrackSlot.setRotation((nLETrackSlot.getRotation() + i) % 360.0f);
                int i6 = C132895Jl.LIZ[commitNleModel.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (z) {
                                PreviewPanelViewModel.iv0(previewPanelViewModel, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1032));
                            } else {
                                if (interfaceC65784Pro != null) {
                                    interfaceC65784Pro.invoke();
                                }
                                nLEEditor.LIZIZ();
                            }
                        }
                    } else {
                        NLEEditorJniJNI.NLEEditor_setGlobalExtra(nLEEditor.LIZ, nLEEditor, "only_update_preview_panel", "TRUE");
                        if (z) {
                            PreviewPanelViewModel.iv0(previewPanelViewModel, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1031));
                        } else {
                            if (interfaceC65784Pro != null) {
                                interfaceC65784Pro.invoke();
                            }
                            nLEEditor.LIZIZ();
                        }
                    }
                } else {
                    MutableLiveData<NLEModel> mutableLiveData = previewPanelViewModel.LJLIL;
                    NLEEditor nLEEditor2 = previewPanelViewModel.LJLZ;
                    if (nLEEditor2 != null) {
                        nLEModel = nLEEditor2.LJ();
                    } else {
                        nLEModel = null;
                    }
                    mutableLiveData.setValue(nLEModel);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5HN
    public final void LJIJ(NLETrack track, NLETrackSlot slot, C5PT c5pt) {
        boolean z;
        MutableLiveData mutableLiveData;
        Long l;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        OSZ<Long, Long> osz = new OSZ<>(Long.valueOf(slot.getMeasuredStartTime()), Long.valueOf(slot.getMeasuredEndTime()));
        UIW uiw = new UIW(osz.getFirst().longValue(), osz.getSecond().longValue());
        PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
        if (previewPanelViewModel != null && (mutableLiveData = previewPanelViewModel.LJLJI) != null && (l = (Long) mutableLiveData.getValue()) != null && uiw.LJIIIZ(l.longValue())) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLILLLL = osz;
        if (!o.LJ(this.LJLLJ, c5pt) || this.LJLLL != z) {
            this.LJLLJ = c5pt;
            this.LJLLL = z;
            PreviewPanelViewModel previewPanelViewModel2 = this.LJLLI;
            if (previewPanelViewModel2 != null) {
                previewPanelViewModel2.lv0();
            }
        }
    }

    @Override // X.C5HO
    public final boolean LJIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C5HO
    public final boolean LJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        PreviewPanelViewModel previewPanelViewModel;
        NLEModel nLEModel;
        this.LJLLLL = false;
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null && (previewPanelViewModel = this.LJLLI) != null) {
            OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(frameLayout);
            PreviewPanelViewModel previewPanelViewModel2 = this.LJLLI;
            if (previewPanelViewModel2 != null) {
                C135695Uf c135695Uf = this.LJLIL;
                EnumC132905Jm commitNleModel = c135695Uf.LJIIJJI;
                boolean z = c135695Uf.LJIIL;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c135695Uf.LJIILIIL;
                o.LJIIIZ(commitNleModel, "commitNleModel");
                NLEEditor nLEEditor = previewPanelViewModel2.LJLZ;
                if (nLEEditor != null) {
                    nLETrackSlot.setScale(nLETrackSlot.getScale() * f);
                    int i = C132895Jl.LIZ[commitNleModel.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (z) {
                                    PreviewPanelViewModel.iv0(previewPanelViewModel2, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1034));
                                } else {
                                    if (interfaceC65784Pro != null) {
                                        interfaceC65784Pro.invoke();
                                    }
                                    nLEEditor.LIZIZ();
                                }
                            }
                        } else {
                            NLEEditorJniJNI.NLEEditor_setGlobalExtra(nLEEditor.LIZ, nLEEditor, "only_update_preview_panel", "TRUE");
                            if (z) {
                                PreviewPanelViewModel.iv0(previewPanelViewModel2, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1033));
                            } else {
                                if (interfaceC65784Pro != null) {
                                    interfaceC65784Pro.invoke();
                                }
                                nLEEditor.LIZIZ();
                            }
                        }
                    } else {
                        MutableLiveData<NLEModel> mutableLiveData = previewPanelViewModel2.LJLIL;
                        NLEEditor nLEEditor2 = previewPanelViewModel2.LJLZ;
                        if (nLEEditor2 != null) {
                            nLEModel = nLEEditor2.LJ();
                        } else {
                            nLEModel = null;
                        }
                        mutableLiveData.setValue(nLEModel);
                    }
                }
            }
            C5PT c5pt = this.LJLLJ;
            if (c5pt != null) {
                this.LJLJL.LIZ(frameLayout, jv0.getFirst().floatValue(), jv0.getSecond().floatValue(), c5pt);
            }
        }
        return true;
    }

    @Override // X.C5HO
    public final boolean LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        NLEEditor nLEEditor;
        this.LJLLLL = true;
        C135715Uh c135715Uh = this.LJLJJL;
        c135715Uh.getClass();
        c135715Uh.LIZ = EnumC135725Ui.NONE;
        C135825Us c135825Us = this.LJLJJLL;
        c135825Us.getClass();
        c135825Us.LIZ = EnumC135765Um.NONE;
        c135825Us.LIZJ = 0;
        C135685Ue c135685Ue = this.LJLJL;
        c135685Ue.LIZLLL = false;
        c135685Ue.LIZIZ = 0;
        PreviewPanelViewModel previewPanelViewModel = this.LJLLI;
        if (previewPanelViewModel != null && (nLEEditor = previewPanelViewModel.LJLZ) != null) {
            previewPanelViewModel.LJZ.removeCallbacksAndMessages(null);
            NLEEditorJniJNI.NLEEditor_setGlobalExtra(nLEEditor.LIZ, nLEEditor, "only_update_preview_panel", "FALSE");
            NLEEditor nLEEditor2 = previewPanelViewModel.LJLZ;
            if (nLEEditor2 != null) {
                nLEEditor2.LIZIZ();
            }
        }
        PreviewPanelViewModel previewPanelViewModel2 = this.LJLLI;
        if (previewPanelViewModel2 != null) {
            previewPanelViewModel2.lv0();
        }
        return true;
    }

    @Override // X.C5HO
    public final boolean LJIIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        PreviewPanelViewModel previewPanelViewModel;
        boolean z;
        EnumC135725Ui enumC135725Ui;
        NLEModel nLEModel;
        boolean z2 = false;
        if (i > 1) {
            return false;
        }
        this.LJLLLL = false;
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null && (previewPanelViewModel = this.LJLLI) != null) {
            OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(frameLayout);
            C135715Uh c135715Uh = this.LJLJJL;
            float floatValue = jv0.getFirst().floatValue();
            float floatValue2 = jv0.getSecond().floatValue();
            float transformX = nLETrackSlot.getTransformX();
            float transformY = nLETrackSlot.getTransformY();
            C5PV c5pv = new C5PV(f, f2, f3, f4);
            c135715Uh.getClass();
            if (c135715Uh.LIZIZ) {
                float abs = Math.abs(c5pv.LJLJI + transformX);
                float f5 = C135715Uh.LIZLLL;
                if (abs <= f5 / floatValue) {
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(c5pv.LJLJJI + transformY) <= f5 / floatValue2) {
                    z2 = true;
                }
                EnumC135725Ui enumC135725Ui2 = c135715Uh.LIZ;
                if (z) {
                    if (z2) {
                        float f6 = -transformX;
                        c5pv.LJLIL = floatValue * f6;
                        float f7 = -transformY;
                        c5pv.LJLILLLLZI = floatValue2 * f7;
                        c5pv.LJLJI = f6;
                        c5pv.LJLJJI = f7;
                        enumC135725Ui = EnumC135725Ui.ALL;
                    } else {
                        float f8 = -transformX;
                        c5pv.LJLIL = floatValue * f8;
                        c5pv.LJLJI = f8;
                        enumC135725Ui = EnumC135725Ui.X;
                    }
                } else if (z2) {
                    float f9 = -transformY;
                    c5pv.LJLILLLLZI = floatValue2 * f9;
                    c5pv.LJLJJI = f9;
                    enumC135725Ui = EnumC135725Ui.Y;
                } else {
                    enumC135725Ui = EnumC135725Ui.NONE;
                }
                c135715Uh.LIZ = enumC135725Ui;
                if (enumC135725Ui2 != enumC135725Ui) {
                    frameLayout.invalidate();
                    ((InterfaceC1283852c) c135715Uh.LIZJ.getValue()).LIZ(frameLayout, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                }
            }
            PreviewPanelViewModel previewPanelViewModel2 = this.LJLLI;
            if (previewPanelViewModel2 != null) {
                float f10 = c5pv.LJLJI;
                float f11 = c5pv.LJLJJI;
                C135695Uf c135695Uf = this.LJLIL;
                EnumC132905Jm commitNleModel = c135695Uf.LJIIJJI;
                boolean z3 = c135695Uf.LJIIL;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c135695Uf.LJIILIIL;
                o.LJIIIZ(commitNleModel, "commitNleModel");
                NLEEditor nLEEditor = previewPanelViewModel2.LJLZ;
                if (nLEEditor != null) {
                    nLETrackSlot.setTransformX(nLETrackSlot.getTransformX() + f10);
                    nLETrackSlot.setTransformY(nLETrackSlot.getTransformY() + f11);
                    int i2 = C132895Jl.LIZ[commitNleModel.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (z3) {
                                    PreviewPanelViewModel.iv0(previewPanelViewModel2, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1036));
                                } else {
                                    if (interfaceC65784Pro != null) {
                                        interfaceC65784Pro.invoke();
                                    }
                                    nLEEditor.LIZIZ();
                                }
                            }
                        } else {
                            NLEEditorJniJNI.NLEEditor_setGlobalExtra(nLEEditor.LIZ, nLEEditor, "only_update_preview_panel", "TRUE");
                            if (z3) {
                                PreviewPanelViewModel.iv0(previewPanelViewModel2, nLEEditor, new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1035));
                            } else {
                                if (interfaceC65784Pro != null) {
                                    interfaceC65784Pro.invoke();
                                }
                                nLEEditor.LIZIZ();
                            }
                        }
                    } else {
                        MutableLiveData<NLEModel> mutableLiveData = previewPanelViewModel2.LJLIL;
                        NLEEditor nLEEditor2 = previewPanelViewModel2.LJLZ;
                        if (nLEEditor2 != null) {
                            nLEModel = nLEEditor2.LJ();
                        } else {
                            nLEModel = null;
                        }
                        mutableLiveData.setValue(nLEModel);
                    }
                }
            }
            C5PT c5pt = this.LJLLJ;
            if (c5pt != null) {
                this.LJLJL.LIZ(frameLayout, jv0.getFirst().floatValue(), jv0.getSecond().floatValue(), c5pt);
            }
        }
        return true;
    }
}
