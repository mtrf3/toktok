package X;

import Y.IDRunnableS6S0101000;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC171766oe extends ActivityC41728GZg implements InterfaceC70422pa {
    public static final /* synthetic */ int LLI = 0;
    public AbstractBinderC172036p5 LJLILLLLZI;
    public C133785Mw LJLJJL;
    public InterfaceC132665Io LJLJJLL;
    public NLETemplateSource LJLJL;
    public NLETemplateModel LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public CutSource LJLZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public ArrayList<MediaItem> LLD;
    public ArrayList<TextItem> LLF;
    public ArrayList<MediaItem> LLFF;
    public long LLFFF;
    public Intent LLFII;
    public final MBA LJLIL = EXS.LIZ.plus(C79146V4k.LJIILIIL());
    public final C5UZ LJLJI = new NLEEditorListener() { // from class: X.5UZ
        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
        public final void onChanged() {
            AbstractActivityC171766oe abstractActivityC171766oe;
            C133785Mw c133785Mw;
            try {
                if (AbstractActivityC171766oe.this.LJLJJI.LJ() != null && (c133785Mw = (abstractActivityC171766oe = AbstractActivityC171766oe.this).LJLJJL) != null) {
                    c133785Mw.R8(abstractActivityC171766oe.LJLJJI.LJ());
                }
            } catch (Throwable th) {
                C172586py.LIZIZ("cutui.CutPlayerActivity", "NLEEditor callback ", th);
            }
        }
    };
    public final NLEEditor LJLJJI = new NLEEditor();
    public String LJZ = "";
    public boolean LLFZ = true;

    public abstract C172126pE LLFZ();

    public void LLIIJI(float f) {
    }

    public void LLILIL() {
    }

    public void LLJILJILJ(long j) {
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        EnumC135185Sg LJJIL;
        this.LLFZ = false;
        super.onPause();
        C172586py.LIZ("cutui.CutPlayerActivity", "onPause");
        InterfaceC132665Io interfaceC132665Io = this.LJLJJLL;
        if (interfaceC132665Io == null) {
            LJJIL = null;
        } else {
            LJJIL = interfaceC132665Io.LJJIL();
        }
        if (LJJIL == EnumC135185Sg.STARTED) {
            this.LJLL = true;
            InterfaceC132665Io interfaceC132665Io2 = this.LJLJJLL;
            if (interfaceC132665Io2 == null) {
                return;
            }
            interfaceC132665Io2.pause();
            return;
        }
        this.LJLL = false;
    }

    static {
        C172976qb.LIZ.LIZ();
        com.bytedance.ies.nleeditor.NLE.loadNLELibrary$default(com.bytedance.ies.nleeditor.NLE.INSTANCE, false, 1, null);
        C172586py.LIZLLL();
    }

    public final void LLFII() {
        ArrayList<MediaItem> arrayList = this.LLD;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<MediaItem> it = arrayList.iterator();
            while (it.hasNext()) {
                MediaItem next = it.next();
                if (o.LJ(next.M(), android.net.Uri.EMPTY)) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (!LLIIIILZ(new ArrayList<>(arrayList2))) {
                    return;
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new RunnableC65317PkH(3, this), 400L);
                return;
            }
        }
        CutSource cutSource = this.LJLZ;
        o.LJI(cutSource);
        final ArrayList<MediaItem> arrayList3 = this.LLD;
        final ArrayList<TextItem> arrayList4 = this.LLF;
        if (this.LJLJJLL == null) {
            LLIL();
            o.LJI(LLFZ());
            C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(this.LJLJL, "initTemplateData : nleTemplateSource = "));
            if (this.LJLJL != null) {
                this.LJLLILLLL = SystemClock.uptimeMillis();
                this.LJLLJ = SystemClock.uptimeMillis();
                LLII();
            } else {
                NLETemplateSource nLETemplateSource = new NLETemplateSource(this, cutSource, this.LJZ);
                this.LJLJL = nLETemplateSource;
                nLETemplateSource.LJFF(this.LJLILLLLZI);
                nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(this)));
                nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.6og
                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onProgress(float f, String str) {
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        AbstractActivityC171766oe.this.LJLLILLLL = SystemClock.uptimeMillis();
                        AbstractActivityC171766oe abstractActivityC171766oe = AbstractActivityC171766oe.this;
                        AbstractBinderC172036p5 abstractBinderC172036p5 = abstractActivityC171766oe.LJLILLLLZI;
                        if (abstractBinderC172036p5 != null) {
                            C171956ox.LIZ(abstractBinderC172036p5, 1025, String.valueOf(abstractActivityC171766oe.LJLLILLLL - abstractActivityC171766oe.LJLLI), null, null, null, 124);
                        }
                        AbstractActivityC171766oe.this.runOnUiThread(new RunnableC45816HyW(nLETemplateModel, this, arrayList3, arrayList4, 2));
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onSuccess(NLETemplateModel nLETemplateModel) {
                        AbstractActivityC171766oe.this.LJLLJ = SystemClock.uptimeMillis();
                        AbstractActivityC171766oe abstractActivityC171766oe = AbstractActivityC171766oe.this;
                        abstractActivityC171766oe.LJLJLJ = nLETemplateModel;
                        abstractActivityC171766oe.LLII();
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onError(int i, String str) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("initTemplateData onError, code=");
                        LIZ.append(i);
                        LIZ.append(", message=");
                        LIZ.append((Object) str);
                        C172586py.LIZ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ));
                        AbstractActivityC171766oe.this.LJLLL = SystemClock.uptimeMillis();
                        AbstractActivityC171766oe abstractActivityC171766oe = AbstractActivityC171766oe.this;
                        AbstractBinderC172036p5 abstractBinderC172036p5 = abstractActivityC171766oe.LJLILLLLZI;
                        if (abstractBinderC172036p5 == null) {
                            return;
                        }
                        C171956ox.LIZ(abstractBinderC172036p5, 1026, String.valueOf(abstractActivityC171766oe.LJLLL - abstractActivityC171766oe.LJLLI), String.valueOf(i), str, null, 112);
                    }
                });
                nLETemplateSource.LIZJ();
            }
            C172586py.LIZ("cutui.CutPlayerActivity", "onPlayerInitOk");
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
    }

    public void LLIIJLIL() {
        CutSourceType cutSourceType;
        String desc;
        String str;
        C172586py.LIZ("cutui.CutPlayerActivity", "onPlayerCompileStart");
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 != null) {
            CutSource cutSource = this.LJLZ;
            if (cutSource == null || (cutSourceType = cutSource.type) == null) {
                desc = null;
            } else {
                desc = cutSourceType.getDesc();
            }
            CutSource cutSource2 = this.LJLZ;
            if (cutSource2 == null) {
                str = null;
            } else {
                str = cutSource2.value;
            }
            C171956ox.LIZ(abstractBinderC172036p5, 1002, desc, str, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        this.LLFFF = SystemClock.uptimeMillis();
    }

    public void LLIL() {
        C172586py.LIZ("cutui.CutPlayerActivity", "onPlayerDataOk");
        this.LJLLI = SystemClock.uptimeMillis();
    }

    public void LLILLJJLI() {
        C172586py.LIZ("cutui.CutPlayerActivity", "onPlayerFirstFrameOk");
        this.LJLLLLLL = SystemClock.uptimeMillis();
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 == null) {
            return;
        }
        C171956ox.LIZ(abstractBinderC172036p5, 1007, String.valueOf(this.LJLLILLLL - this.LJLLI), String.valueOf(this.LJLLJ - this.LJLLI), String.valueOf(this.LJLLLL - this.LJLLI), String.valueOf(this.LJLLLLLL - this.LJLLI), 96);
    }

    public void LLIZLLLIL() {
        C172586py.LIZ("cutui.CutPlayerActivity", "onPlayerPrepareOk");
        this.LJLLLL = SystemClock.uptimeMillis();
    }

    public final void LLII() {
        Intent intent = getIntent();
        o.LJIIIIZZ(intent, "intent");
        AbstractBinderC172036p5 LIZ = C171876op.LIZ(intent);
        if (LIZ != null) {
            C171956ox.LIZ(LIZ, 1009, null, null, null, null, 126);
        }
        C133035Jz c133035Jz = C133785Mw.LJFF;
        String absolutePath = new File(getCacheDir(), "VEEditor").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(this@CutPlayerActiv… \"VEEditor\").absolutePath");
        C133785Mw LIZIZ = C133035Jz.LIZIZ(c133035Jz, absolutePath, LLFZ());
        this.LJLJJL = LIZIZ;
        C5J1 V8 = LIZIZ.V8();
        if (V8 != null) {
            this.LJLJJLL = V8;
            V8.LJJJJI(new C5JL() { // from class: X.5UX
                @Override // X.C5JL
                public final void LIZ(int i, int i2, float f, String str) {
                    C5N1 X8;
                    AbstractActivityC171766oe this$0 = AbstractActivityC171766oe.this;
                    o.LJIIIZ(this$0, "this$0");
                    if (i == 4116) {
                        InterfaceC132665Io interfaceC132665Io = this$0.LJLJJLL;
                        if (interfaceC132665Io != null) {
                            interfaceC132665Io.play();
                        }
                        C133785Mw c133785Mw = this$0.LJLJJL;
                        if (c133785Mw != null && (X8 = c133785Mw.X8()) != null) {
                            X8.LJIIL(true);
                        }
                        this$0.LLIZLLLIL();
                    }
                }
            });
            V8.LJIJJ(new InterfaceC132775Iz() { // from class: X.6ov
                @Override // X.InterfaceC132775Iz
                public final void LIZ() {
                    AbstractActivityC171766oe this$0 = AbstractActivityC171766oe.this;
                    o.LJIIIZ(this$0, "this$0");
                    this$0.LLILLJJLI();
                }
            });
            V8.LJJJJJ(new C5J0() { // from class: X.6ow
                @Override // X.C5J0
                public final void LIZ(int i, long j) {
                    AbstractActivityC171766oe this$0 = AbstractActivityC171766oe.this;
                    o.LJIIIZ(this$0, "this$0");
                    this$0.LLJILJILJ(j / 1000);
                }
            });
            V8.LJIJJLI(new C5JL() { // from class: X.6ot
                @Override // X.C5JL
                public final void LIZ(int i, int i2, float f, String str) {
                    AbstractActivityC171766oe this$0 = AbstractActivityC171766oe.this;
                    o.LJIIIZ(this$0, "this$0");
                    this$0.LLILLIZIL(i, str);
                }
            });
            V8.LJIIL = new C5JI() { // from class: X.6os
                @Override // X.C5JI
                public final void LIZIZ() {
                    AbstractActivityC171766oe.this.LLILZ(true);
                }

                @Override // X.C5JI
                public final void onDestroy() {
                    AbstractActivityC171766oe.this.LLILIL();
                }

                @Override // X.C5JI
                public final void onPause() {
                    AbstractActivityC171766oe.this.LLILZ(false);
                }

                @Override // X.C5JI
                public final void onStop() {
                    AbstractActivityC171766oe.this.LLILZ(false);
                }
            };
        }
        runOnUiThread(new IDRunnableS6S0101000(11, this, 31));
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C172586py.LIZ("cutui.CutPlayerActivity", "onDestroy");
        NLETemplateSource nLETemplateSource = this.LJLJL;
        if (nLETemplateSource != null) {
            nLETemplateSource.LIZLLL();
        }
        this.LJLJL = null;
        InterfaceC132665Io interfaceC132665Io = this.LJLJJLL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.destroy();
        }
        this.LJLJJLL = null;
        C126924yW.LIZ = false;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        InterfaceC132665Io interfaceC132665Io;
        super.onResume();
        this.LLFZ = true;
        Intent intent = this.LLFII;
        if (intent != null) {
            this.LL = true;
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, 1002);
            InterfaceC132665Io interfaceC132665Io2 = this.LJLJJLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.destroy();
            }
            this.LJLJJLL = null;
        }
        this.LLFII = null;
        if (!this.LJLL || (interfaceC132665Io = this.LJLJJLL) == null) {
            return;
        }
        interfaceC132665Io.play();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        super.onStop();
        C172586py.LIZ("cutui.CutPlayerActivity", "onStop");
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public final boolean LLIIIILZ(ArrayList<MediaItem> arrayList) {
        Intent LIZ = C171886oq.LIZ(this, new C171856on(arrayList, (ArrayList) null, 6), "com.ss.android.ugc.cut_ui.process.PICKER");
        if (LIZ != null) {
            LIZ.setPackage(getPackageName());
            LIZ.putExtra("picker_mode", EnumC172856qP.MULTI.name());
            LIZ.putExtra("zip_md5", this.LJZ);
            LIZ.putExtras(getIntent());
            LIZ.addFlags(536870912);
            int size = C171896or.LIZ(getPackageManager(), LIZ).size();
            if (size > 0) {
                if (size != 1) {
                    Intent intent = new Intent("com.bytedance.ies.nle.ui_base.CHOOSE");
                    intent.setPackage(getPackageName());
                    intent.putExtra("extra_intent", LIZ);
                    intent.putExtra("extra_title", (CharSequence) null);
                    if (C171896or.LIZ(getPackageManager(), intent).size() > 0) {
                        LIZ = intent;
                    }
                }
                this.LJZL = true;
                C78598Ut0.LJIJJ(LIZ, this);
                startActivityForResult(LIZ, 1000);
                return true;
            }
        }
        C172586py.LIZ("cutui.CutPlayerActivity", "can not launchPicker");
        return false;
    }

    public Intent LLIILII(String outputFilePath) {
        o.LJIIIZ(outputFilePath, "outputFilePath");
        C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(outputFilePath, "onPlayerCompileSuccess : "));
        long uptimeMillis = SystemClock.uptimeMillis() - this.LLFFF;
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 != null) {
            C171956ox.LIZ(abstractBinderC172036p5, 1004, outputFilePath, String.valueOf(uptimeMillis), null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        AbstractBinderC172036p5 abstractBinderC172036p52 = this.LJLILLLLZI;
        if (abstractBinderC172036p52 != null) {
            C171956ox.LIZ(abstractBinderC172036p52, 1003, null, null, null, null, 126);
        }
        return new Intent();
    }

    public void LLILLL(MediaItem mediaItem) {
        C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(mediaItem, "onPlayerMediaItemUpdate : "));
    }

    public void LLILZ(boolean z) {
        C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(Boolean.valueOf(z), "onPlayerPlaying : "));
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        String LLJJIJIIJIL;
        ArrayList<MediaItem> LIZ;
        super.onCreate(bundle);
        this.LJLJJI.addConsumer(this.LJLJI);
        C126924yW.LIZ = true;
        overridePendingTransition(0, 0);
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        Intent intent = getIntent();
        o.LJIIIIZZ(intent, "intent");
        AbstractBinderC172036p5 LIZ2 = C171876op.LIZ(intent);
        this.LJLILLLLZI = LIZ2;
        CutSource cutSource = (CutSource) getIntent().getParcelableExtra("arg_cut_source");
        this.LJLZ = cutSource;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "zip_md5");
        this.LJZ = LLJJIJIIJIL2;
        if (cutSource == null) {
            finish();
            return;
        }
        C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(cutSource, "onCreate start : "));
        if (bundle != null) {
            ArrayList<MediaItem> parcelableArrayList = bundle.getParcelableArrayList("media_item_list");
            this.LLD = parcelableArrayList;
            ArrayList<TextItem> parcelableArrayList2 = bundle.getParcelableArrayList("text_item_list");
            this.LLF = parcelableArrayList2;
            this.LJZL = bundle.getBoolean("hasLaunchPicker", false);
            this.LL = bundle.getBoolean("hasLaunchNext", false);
            this.LJZI = bundle.getBoolean("hasLaunchClip", false);
            C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(parcelableArrayList, "onCreate restore mediaItemList="));
            C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(parcelableArrayList2, "onCreate restore textItemList="));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onCreate restore hasLaunchPicker=");
            LIZ3.append(this.LJZL);
            LIZ3.append(", hasLaunchNext=");
            LIZ3.append(this.LL);
            LIZ3.append(", hasLaunchClip=");
            LIZ3.append(this.LJZI);
            C172586py.LIZ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ3));
        } else {
            if (LIZ2 != null) {
                C171956ox.LIZ(LIZ2, 1001, cutSource.type.getDesc(), cutSource.value, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
            ArrayList<MediaItem> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("media_item_list");
            this.LLD = parcelableArrayListExtra;
            ArrayList<TextItem> parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("text_item_list");
            this.LLF = parcelableArrayListExtra2;
            C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(parcelableArrayListExtra, "onCreate init mediaItemList="));
            C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(parcelableArrayListExtra2, "onCreate init textItemList="));
        }
        if (bundle == null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_opt")) != null && (LIZ = C172266pS.LIZ(LLJJIJIIJIL)) != null && !LIZ.isEmpty()) {
            LLIIIILZ(LIZ);
        }
        XKX.LIZLLL(this, null, null, new C146075oJ(this, cutSource, LLJJIJIIJIL2, LIZ2, null), 3);
        C172586py.LIZ("cutui.CutPlayerActivity", "onCreate done");
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
    }

    public static void LLIIIJ(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i >= 0) {
                MediaItem mediaItem = (MediaItem) obj;
                if (mediaItem.isMutable) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((MediaItem) next).materialId, mediaItem.materialId)) {
                            obj2 = next;
                            break;
                        }
                    }
                    MediaItem mediaItem2 = (MediaItem) obj2;
                    if (mediaItem2 != null) {
                        MediaItem mediaItem3 = (MediaItem) ListProtector.get(list, i);
                        String str = mediaItem2.source;
                        String str2 = mediaItem2.mediaSrcPath;
                        ListProtector.set(list, i, MediaItem.L(mediaItem3, 0L, 0, 0, str, mediaItem2.sourceStartTime, mediaItem2.crop, mediaItem2.type, str2, 565247));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public void LLIIIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerCompileError : ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append((Object) str);
        C172586py.LIZ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ));
        long uptimeMillis = SystemClock.uptimeMillis() - this.LLFFF;
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 != null) {
            C171956ox.LIZ(abstractBinderC172036p5, 1005, String.valueOf(i), str, String.valueOf(uptimeMillis), null, 112);
        }
        AbstractBinderC172036p5 abstractBinderC172036p52 = this.LJLILLLLZI;
        if (abstractBinderC172036p52 == null) {
            return;
        }
        C171956ox.LIZ(abstractBinderC172036p52, 1003, null, null, null, null, 126);
    }

    public void LLILLIZIL(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initPlayer onError, code=");
        LIZ.append(i);
        LIZ.append(", message=");
        LIZ.append((Object) str);
        C172586py.LIZIZ("cutui.CutPlayerActivity", X1D.LIZIZ(LIZ), null);
        this.LJLJLLL = i;
        AbstractBinderC172036p5 abstractBinderC172036p5 = this.LJLILLLLZI;
        if (abstractBinderC172036p5 == null) {
            return;
        }
        C171956ox.LIZ(abstractBinderC172036p5, 1008, String.valueOf(i), str, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        long j;
        C171856on LIZIZ;
        super.onActivityResult(i, i2, intent);
        MediaItem mediaItem = null;
        ArrayList<MediaItem> arrayList = null;
        mediaItem = null;
        mediaItem = null;
        mediaItem = null;
        switch (i) {
            case 1000:
                this.LJZL = false;
                if (i2 == -1 && intent != null) {
                    C171856on LIZ = C171866oo.LIZ(intent);
                    if (LIZ != null) {
                        arrayList = LIZ.LIZ;
                    }
                    ArrayList<MediaItem> arrayList2 = this.LLD;
                    if (arrayList != null && arrayList2 != null) {
                        LLIIIJ(arrayList2, arrayList);
                        ArrayList<MediaItem> arrayList3 = this.LLFF;
                        if (arrayList3 == null || arrayList3.isEmpty()) {
                            this.LLFF = new ArrayList<>(arrayList2);
                        }
                        LLFII();
                        return;
                    }
                    overridePendingTransition(0, 0);
                    finish();
                    return;
                }
                overridePendingTransition(0, R.anim.i);
                finish();
                return;
            case 1001:
                this.LJZI = false;
                if (i2 == -1) {
                    if (intent == null || (LIZIZ = C171886oq.LIZIZ(intent)) == null || !(!LIZIZ.LIZ.isEmpty()) || (mediaItem = (MediaItem) ListProtector.get(LIZIZ.LIZ, 0)) == null) {
                        C172586py.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : processItem is null");
                    } else {
                        ArrayList<MediaItem> arrayList4 = this.LLD;
                        if (arrayList4 != null) {
                            Iterator<MediaItem> it = arrayList4.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (o.LJ(it.next().materialId, mediaItem.materialId)) {
                                        if (i3 != -1) {
                                            Object obj = ListProtector.get(arrayList4, i3);
                                            o.LJIIIIZZ(obj, "currentList[index]");
                                            ListProtector.set(arrayList4, i3, MediaItem.L((MediaItem) obj, 0L, 0, 0, mediaItem.source, mediaItem.sourceStartTime, mediaItem.crop, mediaItem.type, mediaItem.mediaSrcPath, 565247));
                                            NLETemplateModel nLETemplateModel = this.LJLJLJ;
                                            if (nLETemplateModel != null) {
                                                C172586py.LIZ("NLETemplateUtils", o.LJIILLIIL(mediaItem, "updateMediaItem: "));
                                                C127334zB.LIZJ(nLETemplateModel, this, C47261Igj.LJII(mediaItem));
                                            }
                                            this.LJLJJI.LJII(this.LJLJLJ);
                                            this.LJLJJI.LIZIZ();
                                            InterfaceC132665Io interfaceC132665Io = this.LJLJJLL;
                                            if (interfaceC132665Io != null) {
                                                interfaceC132665Io.prepare();
                                            }
                                            LLILLL(mediaItem);
                                            LLFII();
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            C172586py.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : invalid processItem");
                        } else {
                            C172586py.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : currentList is null");
                        }
                    }
                } else {
                    C172586py.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : cancel");
                }
                C172586py.LIZ("cutui.CutPlayerActivity", o.LJIILLIIL(mediaItem, "onClipFinish : "));
                if (mediaItem == null) {
                    j = 0;
                } else {
                    j = mediaItem.targetStartTime;
                }
                InterfaceC132665Io interfaceC132665Io2 = this.LJLJJLL;
                if (interfaceC132665Io2 == null) {
                    return;
                }
                interfaceC132665Io2.LJJJI(j * 1000, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, new AnonymousClass519() { // from class: X.5UY
                    @Override // X.AnonymousClass519
                    public final void LIZ(int i4) {
                        InterfaceC132665Io interfaceC132665Io3;
                        AbstractActivityC171766oe this$0 = AbstractActivityC171766oe.this;
                        o.LJIIIZ(this$0, "this$0");
                        if (i4 != 0 || (interfaceC132665Io3 = this$0.LJLJJLL) == null) {
                            return;
                        }
                        interfaceC132665Io3.play();
                    }
                });
                return;
            case 1002:
                this.LL = false;
                if (i2 == -1) {
                    if (intent == null || !intent.getBooleanExtra("arg_finish_template_player", false)) {
                        C172586py.LIZJ("cutui.CutPlayerActivity", "onActivityResult next : cancel");
                        LLFII();
                        return;
                    } else {
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                }
                C172586py.LIZJ("cutui.CutPlayerActivity", o.LJIILLIIL(Integer.valueOf(i2), "onActivityResult next : "));
                finish();
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }
}
