package com.ss.ugc.android.editor.base.viewmodel.adapter;

import X.C125404w4;
import X.C125414w5;
import X.C125614wP;
import X.C125624wQ;
import X.C125634wR;
import X.C127594zb;
import X.C13I;
import X.C221108m2;
import X.C39679Fhj;
import X.C5H3;
import X.C79057V0z;
import X.QM9;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;

/* loaded from: classes3.dex */
public final class StickerUIViewModel extends ViewModel {
    public static final C125414w5 Companion = new Object() { // from class: X.4w5
    };
    public final LiveDataBus.BusMutableLiveData<C127594zb> cancelTextTemplate;
    public final MutableLiveData<Boolean> closeTextPanelEvent;
    public final LiveDataBus.BusMutableLiveData<Object> copyStickerOperation;
    public final LiveDataBus.BusMutableLiveData<Object> infoStickerOperation;
    public final MutableLiveData<C125404w4> selectStickerEvent;
    public final LiveDataBus.BusMutableLiveData<C39679Fhj> textOperation;
    public final C5H3 textTemplatePanelTab$delegate;
    public final C5H3 editorContext$delegate = C221108m2.LIZIZ(C125624wQ.LJLIL);
    public final LiveDataBus.BusMutableLiveData<Object> showTextPanelEvent = new LiveDataBus.BusMutableLiveData<>();
    public final C5H3 textPanelTab$delegate = C221108m2.LIZIZ(C125614wP.LJLIL);
    public final MutableLiveData<QM9> cancelStickerPlaceholderEvent = new MutableLiveData<>();
    public final MutableLiveData<C127594zb> animSelectedFrame = new MutableLiveData<>();

    private final EditorProContext getEditorContext() {
        return (EditorProContext) this.editorContext$delegate.getValue();
    }

    public final MutableLiveData<C13I> getTextPanelTab() {
        return (MutableLiveData) this.textPanelTab$delegate.getValue();
    }

    public final LiveDataBus.BusMutableLiveData<Object> getTextTemplatePanelTab() {
        return (LiveDataBus.BusMutableLiveData) this.textTemplatePanelTab$delegate.getValue();
    }

    public StickerUIViewModel() {
        MutableLiveData<C125404w4> mutableLiveData;
        EditorProContext editorContext = getEditorContext();
        if (editorContext != null) {
            mutableLiveData = C79057V0z.LJII(editorContext, "select_sticker_event");
        } else {
            mutableLiveData = null;
        }
        this.selectStickerEvent = mutableLiveData;
        this.textOperation = new LiveDataBus.BusMutableLiveData<>();
        this.copyStickerOperation = new LiveDataBus.BusMutableLiveData<>();
        this.infoStickerOperation = new LiveDataBus.BusMutableLiveData<>();
        EditorProContext editorContext2 = getEditorContext();
        this.closeTextPanelEvent = editorContext2 != null ? C79057V0z.LJII(editorContext2, "close_cover_text_panel_event") : null;
        this.textTemplatePanelTab$delegate = C221108m2.LIZIZ(C125634wR.LJLIL);
        this.cancelTextTemplate = new LiveDataBus.BusMutableLiveData<>();
    }

    public final MutableLiveData<C127594zb> getAnimSelectedFrame() {
        return this.animSelectedFrame;
    }

    public final MutableLiveData<QM9> getCancelStickerPlaceholderEvent() {
        return this.cancelStickerPlaceholderEvent;
    }

    public final LiveDataBus.BusMutableLiveData<C127594zb> getCancelTextTemplate() {
        return this.cancelTextTemplate;
    }

    public final MutableLiveData<Boolean> getCloseTextPanelEvent() {
        return this.closeTextPanelEvent;
    }

    public final LiveDataBus.BusMutableLiveData<Object> getCopyStickerOperation() {
        return this.copyStickerOperation;
    }

    public final LiveDataBus.BusMutableLiveData<Object> getInfoStickerOperation() {
        return this.infoStickerOperation;
    }

    public final MutableLiveData<C125404w4> getSelectStickerEvent() {
        return this.selectStickerEvent;
    }

    public final LiveDataBus.BusMutableLiveData<Object> getShowTextPanelEvent() {
        return this.showTextPanelEvent;
    }

    public final LiveDataBus.BusMutableLiveData<C39679Fhj> getTextOperation() {
        return this.textOperation;
    }
}
